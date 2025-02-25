# Deploying Java Spring Boot Application using Jenkins and Setting Up a Pipeline

## Start Jenkins
To start Jenkins, download the `jenkins.war` file and run the following command:
```sh
java -jar jenkins.war
```
## Jenkins is fully up and running
![Screenshot 2025-02-25 024838](https://github.com/user-attachments/assets/7c0d8025-9ba4-40c1-bc9c-b53c8c7c23cc)

This will start Jenkins on the default port (typically `8080`). Open `http://localhost:8080` in your browser and follow the setup instructions.
![Screenshot 2025-02-25 024920](https://github.com/user-attachments/assets/f6c1a74f-4007-489c-b52f-478a4a0b26a2)


## Create a New Jenkins Job
![Screenshot 2025-02-25 025159](https://github.com/user-attachments/assets/fb2cf8ef-bf5b-4574-83ee-61a67fd94b4a)

## Configure the Job
Ensure your Jenkins job is configured properly:
![Screenshot 2025-02-25 025328](https://github.com/user-attachments/assets/190da75b-d73b-4fed-baf2-364c791d7ebc)
![Screenshot 2025-02-25 025411](https://github.com/user-attachments/assets/7ef5e397-c8ad-48ff-acd9-cf89270f9d01)
![Screenshot 2025-02-25 025455](https://github.com/user-attachments/assets/74aefd5a-0d46-413f-a9f9-d2a492be5a82)

## Jenkins Pipeline Script
Use the following pipeline script to build, test, package, containerize, and deploy the Spring Boot application:
```groovy
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/sonam-niit/springproject.git'
                bat "./mvnw compile"
                echo 'Building the Project with Maven compile'
            }
        }

        stage('Test') {
            steps {
                bat "./mvnw test"
                echo 'Testing the Project with Maven test'
            }
        }

        stage('Package') {
            steps {
                bat "./mvnw package"
                echo 'Packaging the Project with Maven package'
            }
        }

        stage('Containerize') {
            steps {
                bat "docker build -t myapp2 ."
                echo 'Containerizing the App with Docker'
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Check if the container exists
                    def containerExists = bat(script: 'docker ps -aq -f name=sbapp', returnStdout: true).trim()

                    if (containerExists) {
                        echo 'Stopping and removing existing container...'
                        bat(script: 'docker stop sbapp', returnStatus: true)
                        bat(script: 'docker rm sbapp', returnStatus: true)
                    } else {
                        echo 'No existing container found. Proceeding with deployment.'
                    }
                }

                // Run Docker container
                bat "docker run -d --name sbapp -p 9095:8082 myapp2"
                echo 'Deploying the App with Docker'
            }
        }
    }
}
```

## Running the Job
![image](https://github.com/user-attachments/assets/39c41e39-b1ee-4009-9ecb-9788f9d010e9)


## Checking the Deployed Application
Access the application at `http://localhost:9095`
![Image7](https://github.com/user-attachments/assets/11301775-a1f6-4bfe-88ee-76b1ac9b1da5)

Access the application at `http://localhost:9095/api/message`
![Image8](https://github.com/user-attachments/assets/978a6f48-d6c8-4a0e-8b07-b3344c5c8990)

Access the application at `http://localhost:9095/api/product/4`
![Image9](https://github.com/user-attachments/assets/0ce96799-93a6-41a6-aa36-05e114c53783)
