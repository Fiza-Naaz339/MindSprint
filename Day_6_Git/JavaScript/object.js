const person = {
    firstname : "Jhon",
    lastname : "Doe",
    email : "jhondoe@gmail.com",
    age : 45,
    address : {
        street : "XYZ",
        city : "NYC",
        zipcode : 23434567,
        country : "US"
    },
    greeting: function(){
        console.log(`Welcome ${this.firstname} ${this.lastname}`);
        
    }
}
console.log("Address: ",person.address);
person.greeting();
console.log(person['email']);

for(let key in person){
    console.log(person[key]);   
}
