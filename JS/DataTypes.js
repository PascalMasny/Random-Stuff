let length = 16; //Number
let lastName = "John Doe"; //String
let x  = {firstName: "John", lastName: "Doe"}; //Object

let y = 16 + "Volvo";
//16Volvo

let z = "Volvo" + 16;
//Volvo16

let a = "16" + "Volvo";
//16Volvo

let b = 16 + 4 + "Volvo";
//20Volvo

let c = "Volvo" + 16 + 4;
//Volvo164


// Numbers
let d = 43.00;
let e = 43;
let f = 123e5; //12300000
let g = 1233-5; //0.00123

// Booloeans
let x = 5;
let y = 5;
let z = 6;
let a = "6"

(x == y) //Retruns true
(y == z) //returns false
//!
(z == a) // returns true!! Numer 6 == String 6

let x = true;
let y = false;

// Arrays
const cars =["Audi", "Volvo", "BMW"];
console.log(cars[0]);

// Objects
const person = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"};

// typeof
typeof ""
typeof "John"
typeof "John Doe"   //returns "string"

typeof 0              
typeof 314            
typeof 3.14           
typeof (3)            
typeof (3 + 4)     //returns "number"

// Undefined
let car = undefined;