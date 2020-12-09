//task
var Test: string = 'Test'
//let lenght = Test.length

console.log(Test.length)
console.log(Test.charAt(1)) 
console.log(Test[1])

var hel: string ='Hello'
var wld: string ='World'

console.log(`${hel} ${wld}`)


//Pg. 48
console.log("----Pg.48----")
var msexcel: string = 'microsoft excel'
console.log(msexcel.toUpperCase())
var gap: string = 'GOOGLE AND APPLE'
console.log(gap.toLowerCase())
var helwrld: string ='hello world'
console.log(helwrld.charAt(0).toUpperCase() + helwrld.slice(1,4)+helwrld.charAt(6).toUpperCase()+helwrld.slice(7,11))

//Pg. 63
console.log("----Pg.63----")
console.log("Hello World".startsWith("Hello"))
console.log("Hello World".endsWith("World"))

console.log("Computer".slice(3,6))
console.log("Death Race".slice(0,5))
console.log("Republican".substring(2,8))

//Pg. 71
console.log("----Pg.71----")
let million:number = 1000000
let billion:number = 10000000
let trillion:number = 43000000000
let deci1:number = 0.000012
let deci2:number = 0.000000123
console.log(million.toExponential())
console.log(billion.toExponential())
console.log(trillion.toExponential())
console.log(deci1.toExponential())
console.log(deci2.toExponential())

let ts1:number = 1e10
let ts2:number = 2e5
let ts3:number = 122e8
let ts4:number = 1e-8
let ts5:number = 12e-5

console.log(ts1.toString())
console.log(ts2.toString())
console.log(ts3.toString())
console.log(ts4.toString())
console.log(ts5.toString())




