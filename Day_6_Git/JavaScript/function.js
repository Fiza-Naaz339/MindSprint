console.log(greeting("Fiza Naaz"));
data();
function greeting(name){
    return 'Welcome '+name;
}

function print(){
    console.log('Hello world');
}

function cube(n){
    return n*n*n;
}
const data = function(){
    console.log('Data Feteched successfully');
}
print();
const result = greeting("Fiza Naaz") //Store in some variables
console.log(result);
console.log("Cube of 5: ",cube(5)); //Call the function directly in console

//Function declaration