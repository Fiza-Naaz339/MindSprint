console.log(a); //undefined
var a=10;
console.log(a); //10
 // Error
//console.log(b);
//let b = 10;
//console.log(b);

//call back annoymous function
const test = function(){
    console.log('Test triggered');

}

//debugging 
const myFunction = function test(){
    console.log('Test triggered');
}

var factorial = function fac(n){
    return n<2 ? 1:n* fac(n-1);
}
console.log("Factorial of 3: ",factorial(3));