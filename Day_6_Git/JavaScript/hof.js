const array = [1,2,3,4,5,6,7,8,9,10];
const resultArray = [];
for(let num of array){
    resultArray.push(num*3);
}
console.log("Manual format: ",resultArray);

const newArray = array.map((num)=>num*3)
console.log("Map Function: ",newArray);

const evenArray = array.filter((num)=>num%2===0);
console.log("Even Array: ",evenArray);

//Reurn the 1st match else return undefined
const findArray = array.find((num)=>num===6);
console.log(findArray ? 'Found ' + findArray: 'Not found');

const find = array.find((num)=>num===19);
console.log("Number 19 find?");
console.log(find ? 'Found ' + find: 'Not found');

const findIndex = array.findIndex((num)=>num===9);
console.log("At 9th index value");
console.log(findIndex ? 'Found ' + findIndex: 'Not found');

const arraycount2 = [1,2,3,2,4,5,2,6,7,2,8,2];
const res = array.filter((arraycount2)=>arraycount2===2);
console.log(res);

array.forEach(num=>console.log(num))
result = [35,67,89,65,94];
console.log(result.every(num=>num>=35)); //All
console.log(result.some(num=>num>=90)); //anyone

console.log([[1,2],2,[3,4,5]].flat())
console.log(array.includes(5))

console.log("Fiza Naaz".indexOf("F"));
console.log("Fiza Naaz".lastIndexOf("z"));
console.log(("Fiza Naaz").toLowerCase().indexOf("A"));

const myarray = [10,20,30,40,50];
console.log(myarray.slice(2)); //starts from 2 till last
console.log(myarray.slice(2,4)); //starts from 2 till idex 3

myarray.splice(3,0,60); //Start index, delete count,no of elements
console.log(myarray);

myarray.splice(3,1);
console.log("After deletes: ",myarray);

//Replace 70 by 35
myarray.splice(3,1,35);
console.log("After replace: ",myarray);
