# Publishing a Website on AWS

## Create an Ubuntu EC2 Instance
1. Launch an EC2 instance with Ubuntu.
   <img width="959" alt="image" src="https://github.com/user-attachments/assets/7654f6f8-57b4-4a80-87bc-001905dedc36" /> 
   <img width="960" alt="image" src="https://github.com/user-attachments/assets/4f1016de-2139-4f98-9a99-e3215132421d" /> 
   <img width="960" alt="image" src="https://github.com/user-attachments/assets/9d8d5fca-d584-4e52-a08a-765a226c9c2e" />
   <img width="960" alt="image" src="https://github.com/user-attachments/assets/5c71fb56-9ac9-4266-9b2c-d9e858d415b8" />

2. Connect to the instance.
   <img width="960" alt="image" src="https://github.com/user-attachments/assets/b2148846-3561-4c45-ac1c-b0f1acb3f378" />



# Setting Up a Spring Boot Application on Ubuntu Instance

## Step-by-Step Instructions

1. **Update package lists**: Run the following command to update the package lists for upgrades and new package installations:
   ```bash
   sudo apt update
2. **Install Git: Install Git using the following command**:
   ```bash
    sudo apt install git
3. **Check Git version: Verify that Git is installed correctly**: 
    ```bash
    git --version
4. **Clone the Spring Boot application repository: Use the following command to clone the repository**:
    ```bash
    git clone https://github.com/sonam-niit/springboot-app.git
5. **Move to the cloned folder: Change directory to the cloned repository**:
    ```bash
    cd springboot-app
6. **Install OpenJDK and JRE: Install the Java Runtime Environment (JRE) and Java Development Kit (JDK)**:
    ```bash
    sudo apt install openjdk-17-jre
    sudo apt install openjdk-17-jdk
7. **Install Maven: Install Maven to build your project**:
    ```bash
    sudo apt install maven
8. **Check Java and Maven versions: Verify that Java and Maven are installed correctly**:
    ```bash
    java -version
    mvn -version
9. **Create a JAR file for your project: Build your project and create the JAR file**:
    ```bash
    mvn clean install
10. **Check if the target folder is created**:
List the contents of the current directory to see if the target folder is created:
    ```bash
    ls
11. **Move to the target folder: Change directory to the target folder**:
    ```bash
    cd target
12. **Check the JAR file name**:
List the contents of the target folder to find the JAR file:
    ```bash
    ls
13. **Run the Spring Boot application**:
Use the following command to run the JAR file (replace sample-0.0.1-snapshot.jar with the actual JAR file name if it’s different):
    ```bash
    java -jar sample-0.0.1-snapshot.jar

14. **Access the application**:
Open your web browser and enter the following URL to access the application (replace with your public IP or DNS name):
    ```bash
    http://<your-public-ip-or-dns-name>:8080/hello
![WhatsApp Image 2025-02-24 at 11 09 55 PM](https://github.com/user-attachments/assets/68e92c6b-47c7-4281-a37e-07118d3635a2)
    
15. **Also check**:
    ```bash
    http://<your-public-ip-or-dns-name>:8080/employee
<img width="960" alt="image" src="https://github.com/user-attachments/assets/55969101-dadd-40af-b58e-630cbf4e3d45" />

    
