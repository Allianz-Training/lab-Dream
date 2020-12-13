console.log('----Pg.86----');
console.log('1.----');
var num1 = 100;
var num2 = 111;
var num3 = 55;
var num4 = 21;
var num5 = 99;
console.log(num1.toString(8));
console.log(num2.toString(8));
console.log(num3.toString(8));
console.log(num4.toString(8));
console.log(num5.toString(8));
console.log('2.----');
console.log(num1.toString(16));
console.log(num2.toString(16));
console.log(num3.toString(16));
console.log(num4.toString(16));
console.log(num5.toString(16));
console.log('3.----');
console.log(Math.round(12.423));
console.log(Math.round(31313.135));
console.log(Math.round(42.809));
console.log('----Pg.96----');
var max = 50;
var min = -5;
function random(max, min) {
    console.log((min + (max - min) * Math.random()));
}
random(max, min);
console.log('----Pg.103----');
var a = false;
var b = true;
var c = false;
console.log(a || (b && c)); //false
console.log(b || (a || c)); //true
console.log(b && (a || c)); //false
console.log('----Pg.109----');
console.log(typeof false);
console.log(typeof "ABD");
console.log(typeof 113113);
console.log(typeof null);
console.log(typeof "");
//console.log(typeof 13qed)
console.log('----Lab----');
//1
var student = {
    name: "John",
    lastname: "Doe",
    year: 3,
    ID: 123,
    isStudent: true
};
//2
var student2 = student;
student2.name = null;
//3
for (var key in student2) {
    console.log(key, student2[key]);
}
//4
Object.assign(student2, { isActive: true });
//5
delete student2.isActive;
console.log('----Pg.----');
var fruits = ['Apple', 'Orange', 'Plum'];
var shoppingCart = fruits;
shoppingCart.push('Banana');
console.log(fruits.length);
console.log('----Pg.219----');
var str1 = "Apple, Cat, Zoo, Bird, Dog";
//1
var arr = str1.split(', ').sort();
console.log('1) = ' + arr);
var arr2 = [123, 132, 423, 423, 12345, 5343, 52, 10904, 64];
var arr3 = arr2.filter(function (item) { return item.toString().charAt(0) == '1'; });
console.log(arr3);
var arr4 = ['Apple', 'Mango', 'Cat', 'Banana'];
arr4.splice(2, 1, "Orange");
console.log(arr4);
