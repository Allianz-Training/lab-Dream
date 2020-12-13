console.log('----Pg.86----')
console.log('1.----')
let num1:number = 100
let num2:number = 111
let num3:number = 55
let num4:number = 21
let num5:number = 99

console.log(num1.toString(8))
console.log(num2.toString(8))
console.log(num3.toString(8))
console.log(num4.toString(8))
console.log(num5.toString(8))
console.log('2.----')

console.log(num1.toString(16))
console.log(num2.toString(16))
console.log(num3.toString(16))
console.log(num4.toString(16))
console.log(num5.toString(16))

console.log('3.----')
console.log(Math.round(12.423))
console.log(Math.round(31313.135))
console.log(Math.round(42.809))


console.log('----Pg.96----')
let max:number = 50
let min:number = -5

function random(max:number,min:number){
     console.log((min+(max-min)*Math.random()))
}

random(max,min)

console.log('----Pg.103----')
let a:boolean = false
let b:boolean = true
let c:boolean = false

console.log(a||(b&&c))//false
console.log(b||(a||c))//true
console.log(b&&(a||c))//false

console.log('----Pg.109----')
console.log(typeof false)
console.log(typeof "ABD")
console.log(typeof 113113)
console.log(typeof null)
console.log(typeof "")
//console.log(typeof 13qed)


console.log('----Lab----')
//1
let student = {
    name:"John",
    lastname:"Doe",
    year:3,
    ID:123,
    isStudent: true,
}
//2
let student2:any = student;
student2.name = null;
//3
for(let key in student2){
    console.log(key,student2[key])
}
//4
Object.assign(student2,{isActive: true});
//5
delete student2.isActive;

console.log('----Pg.----')
let fruits = ['Apple','Orange','Plum'];
let shoppingCart = fruits;
shoppingCart.push('Banana');
console.log(fruits.length)

console.log('----Pg.219----')
let str1:string = "Apple, Cat, Zoo, Bird, Dog";
//1
let arr = str1.split(', ').sort();
console.log('1) = '+arr);
let arr2:number[] = [123, 132, 423, 423, 12345, 5343, 52, 10904, 64] 
let arr3:number[] = arr2.filter(item=> item.toString().charAt(0)== '1')
console.log(arr3)
let arr4:string[] = ['Apple', 'Mango', 'Cat', 'Banana'];
arr4.splice(2,1,"Orange")
console.log(arr4.sort())
console.log(arr4.find(item => 'Apple'))
arr4.forEach((item,index,array)=>{
    console.log(`${item} ${index} ${array}`);
})

console.log('----Pg.241----')
let heroes = [
    {
        id:"a001",
        name:"Thor",
        weapons:["axe","hammer"]
    },
    {
        id:"a002",
        name:"Tony",
        weapons:["iron suit"]
    }
]
let avengerMap = new Map();
heroes.map(item=>avengerMap.set(item.id,item));
console.log(avengerMap);
console.log(avengerMap.get('a001'));
console.log(avengerMap.get('a002'));
avengerMap.delete('a001');

console.log(avengerMap);

console.log('----Pg.328----')
let rectangleArea = (x:number,y:number) => {
    let result = x*y;
    return result;
}
console.log("The area with width = 2 and length =3 is : "+rectangleArea(2,3))

let primeNum = (n:number) =>{
    for (var i = 2; i < n; i++) { 
        if(n % i === 0) return false; 
      }
      return n > 1; 
}
console.log("73 check for prime number : " +primeNum(73));
console.log("37 check for prime number : " +primeNum(37));

console.log('----Pg.336----')

interface idPersonal {
    idNumber: number;
    firstName: string;
    lastName: string;
    age: number;
}

interface subject{
    subjName: string;
}
interface subjectInfo{
    subject:subject;
    subjectNum:number;
    subjectCredit:number;
}

console.log('----Pg.351----')
enum translater{
    English = 'English',
    Thai = 'Thai',
    French = 'French',
    Dutch = 'Dutch'
}
let switchEnum = (num:number) =>{
    switch (num) {
        case 1:
            return translater.English;
        case 2:
            return translater.Thai;
        case 3:
            return translater.French;
        case 4:
            return translater.Dutch;
        default:
            break;
    }
    
}
//var enumCode:string = prompt('Language code','');
//console.log(switchEnum(parseInt(enumCode)))
console.log("input 1 :",switchEnum(1));//test

console.log('----Pg.362----')
let values = new Array<number>();
values.push(12);
//values.push('12'); error becouse of declaretion in number
interface studentDetail{
    studentID:number;
    name:string;
    department:string;
}
let studentInfo = new Map<string,studentDetail>();
let std: studentDetail = {
    studentID:1234,
    name:'Peter',
    department:'Engineer'

}
studentInfo.set('12345',std);
console.log(studentInfo);