// 문제

let name = "Korea Fruit Store"
let fruits = ['banana', 'apple','mango']
let address = 'seoul'

// 1. es6 문법으로 재작성 해보세요.

let store = {name, fruits, address}
console.log(store);

// 2. es6 문법을 이용하여 다음과 같이 출력 (백틱)
// 제 가게 이름은 Korea Fruit Store 입니다. 위치는 Seoul 입니다.

console.log(`제 가게 이름은 ${name} 입니다. 위치는 ${address} 입니다.`)


// 3. 다음 코드를 Destructoring을 이용하여 해결. 
function calculate(obj){
    // 이 부분에 적절한 문장 구현 하시오.
    // 객체를 변수에 분배할때는 { }중괄호를 변수에 묶어준다.
    // 배열이었다면 [a,b,c] = arr;
    // 객체라면 {a,b,c} = obj;

    let {a, b, c} = obj ; 

    return a + b + c;
}
let sum = calculate({a:1, b:2, c:3});
console.log(sum);


// 4. 아래 코드에서 정답이 true가 나오게 하시오.
let name2="Korea store"
let fruits2 = ["banana","apple", "mango"]
let address2={
	country: "Korea",
	city: "Seoul"
}
function findStore(obj) {
    // 이 부분에 적절한 구문 작성하기
    let name2 = obj.name2;
    let city = obj.address2.city;
    console.log(obj);

    return name2 =="Korea store" && city == "Seoul"
}
console.log(findStore({name2, fruits2, address2}))


// 5. 다음과 같이 프린트 되게 코드를 바꾸시오. 

function getNumber(){
	let array = [1,2,3,4,5,6]
	let [first, , third, forth,...a] = array;
	return {first, third, forth}
}
console.log(getNumber())
// 결과값 : {first : 1, third : 3, forth : 4}




















