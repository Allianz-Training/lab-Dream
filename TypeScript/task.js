//task
var Test = 'Test';
//let lenght = Test.length
console.log(Test.length);
console.log(Test.charAt(1));
console.log(Test[1]);
var hel = 'Hello';
var wld = 'World';
console.log(hel + " " + wld);
//Pg. 48
console.log("----Pg.48----");
var msexcel = 'microsoft excel';
console.log(msexcel.toUpperCase());
var gap = 'GOOGLE AND APPLE';
console.log(gap.toLowerCase());
var helwrld = 'hello world';
console.log(helwrld.charAt(0).toUpperCase() + helwrld.slice(1, 4) + helwrld.charAt(6).toUpperCase() + helwrld.slice(7, 11));
//Pg. 63
console.log("----Pg.63----");
console.log("Hello World".startsWith("Hello"));
console.log("Hello World".endsWith("World"));
console.log("Computer".slice(3, 6));
console.log("Death Race".slice(0, 5));
console.log("Republican".substring(2, 8));
//Pg. 71
console.log("----71----");
var million = 1000000;
var billion = 10000000;
var trillion = 43000000000;
var deci1 = 0.000012;
var deci2 = 0.000000123;
console.log(million.toExponential());
console.log(billion.toExponential());
console.log(trillion.toExponential());
console.log(deci1.toExponential());
console.log(deci2.toExponential());
var ts1 = 1e10;
var ts2 = 1e8;
var ts3 = 122e8;
var ts4 = 1e-8;
var ts5 = 12e-5;
console.log(ts1.toString());
console.log(ts2.toString());
console.log(ts3.toString());
console.log(ts4.toString());
console.log(ts5.toString());
