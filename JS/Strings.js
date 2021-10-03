//length
let text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
console.log(text.length); //returns 26

//slice
let str = "Apple, Banana, Kiwi";
console.log(str.slice(7, 13));     // start letter, end letter
                                    // returns Kiwi
                
//substring
let str = "Apple, Banana, Kiwi";
console.log(str.substr(7, 13)); 

//replace 
let text = "Please visit Microsoft!";
let newText = text.replace("Microsoft", "W3Schools");

//upper / lowercase
let text1 = "Hello World";
console.log(text1.toUpperCase);
console.log(text1.toLowerCase);

//trim
let text = "           Hello World!         ";
console.log(text.trim());