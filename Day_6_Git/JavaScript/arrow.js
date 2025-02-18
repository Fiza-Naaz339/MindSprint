const print=()=>console.log('Sample');
const greeting=(name)=>console.log("Welcome "+name);
const add = (num1,num2)=>num1+num2; //Implicit return

const calculate = (num1,num2)=>{
    const a = num1+num2;
    const b = num1+num2;
    return a+b; //return explicitly
}
print();
greeting("Jhon Doe");
console.log("Add: ",add(3,4));
console.log("Calculate: ",calculate(3,4));