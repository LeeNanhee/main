// 자바스크립트 최신 문법
// ES6 버전의 문법

//1. 객체 만들때

let name = "홍길동"
let age = 30
// 변수와 키값이 같다면, 한번만 써준다.
let person = {name, age}
// let person = {name : name, age : age}

console.log(person)


// 2. Destructuring
let dog = {
    name2 : '사랑이',
    type : '포메라니안',
    color : 'white'
}
let {name2, type, color} = dog;

console.log(name2, type, color)


// 배열
let arr = [1,2,3];

for(let i = 0; i < arr.length; i++){
    console.log("배열 내용 : ", arr[i])
}

let [a, b, c] = arr;
console.log(a)
console.log(b)
console.log(c)


// 3. Rest Destructuring

let array = [10,20,30, 40, 50, 60, 70]
let [n1, n2, n3, ...rest] = array
console.log(n1);
console.log(n2);
console.log(n3);
console.log(rest);


// 4. Spread
let x = [1, 2]
let y = [3, 4]
let z = [5, 6]

let result = [...x, ...y, ...z]
console.log(result);


// 5. 화살표 함수 

// original
function 함수이름(){

}

// es6
// 화살표 함수는 기존의 function 표현 방식이 간결
// case 1
let foo01 = () => { console.log('hello1') };
let foo02 = () => console.log('hello2');

foo01();
foo02();

// case 2
let zoo01 = ()=>{
    return Date.now();
}
let zoo02 = ()=> Date.now();

console.log(zoo01());
console.log(zoo02());

// case3 
function circle01(radius) {
    return radius * radius * 3.14;
}
// return 생략가능
let circle02 = (radius) => {
    return radius * radius * 3.14;
}
let circle03 = (radius) => radius * radius * 3.14;

// 화살표 사용 하면 안되는 예시
// this가 가리키는 대상이 객체가 아니고, globalThis , 
// 화살표 함수 안에서는 this가 자신을 포함하고 있는 context의 this를 이어받는다.
// 그래서 현재 상황은 문서 전체를 가리키게 되는 this이다. 
// 객체 안의 함수는 function(){} 메서드를 만든다.   

let square = {
    w : 10, 
    h : 20,
    point : 0,
    score : function() {
        this.point++; // 현재 자신의 객체를 this에 연결(바인딩)한다.
    }
}

let squareArea01 = (w, h) => {
    return w * h;
};

let squareArea02 = (w, h) => w * h;


// 화살표 함수를 쓰면 안되는 경우.