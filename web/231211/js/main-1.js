
// 자바스크립트 
// 
/* 변수선언
변수선언하고 초기화 하지 않으면
기본값이 : undefined 

1) var 선언자
- 일반적인 변수 선언자 입니다.
- 선언문 생략 가능, var 선언이 됨.
- 호이스팅 문제가 생길수 있음. 

* 호이스팅 개념 : 프로그램 중간에 선언을 해도, 선언문을 최상위로 끌어올림. 

2) let 선언자
- 블록 유효 범위를 가진다 (=지역변수)
  (중괄호 내에서 유효하다, 선언된 범위내에서 유효하다)

3) const 선언자
- 블록 유효 범위를 가짐, 
- 선언과 동시에 초기화해야함.
- 값을 변경 시도하면 오류


변수 이름 규칙
- 대소문자 구분
- 영어 대소문자, 숫자, 기호 ( _ $ )만 가능
- 첫글자 숫자X, 예약어X, 

변수에 저장 가능한 자료형
- 문자형, 숫자형, 논리형(boolean)


null : 변수의 값이 비어 있다는 뜻

Q. 변수를 선언했을 때, 초기값 무엇인가?
- undefined
- 변수가 선언되었는데, 값이 지정되 않았을 경우

자료형 체크 : typeof

 */

// 실습1

// console.log(num1);
let num1 = 10; // let, var 변경해서 확인하기
console.log(num1);
let num2;

// const - 상수, 선언과 동시에 초기화
// const num = 10;



// 실습2  - 객체 
// 자바 - map, 파이썬- 딕셔너리, 자바스크립트 - 객체데이터(object)
// 키와 밸류를 값을 짝지어서 여러개 모은 것

// 1) 객체 리터럴
// {'키' : '값'}의 형태
let word = {
    'a' :'apple', 
    'b':'banana', 
    'c':'cherry'
};

// 2) 추가와 삭제
// 객체 없는 것을 읽으려고 하면 undefined  
word['f'] = 'fruit'; // 프로퍼티 추가 : 없는 프로퍼티를 써주면 추가
delete word.b;  // 프로퍼티 삭제
console.log(word['f']);
console.log(word);


// 3) in 연산자 - 프로퍼티 존재여부?
console.log( 'a' in word);
console.log( 'b' in word);


// q. 객체 언제 사용하기 좋을까?
// 사각형의 너비 30mm, 높이는 20mm;

let width = 30;
let height = 20;
let squre = {width : 30, height : 20};

console.group(squre.width);
console.group(squre.height);

// 회원 정보를 담는 person 객체를 생성해서, 값을 저장
// name, age, gender, married (true, false) 프로퍼티를 생성하고 자신의 정보를 담아서 출력하시오. 

let person = {
    name : '홍길동',
    age : 30,
    gender : 'male',
    married : 'false',
    showInfo : function(){
        // 객체 나 자신을 가리키는 키워드 : this
        console.log("이름 : " + this.name)
        console.log("나이 : " + this.age)
        console.log("성별 : " + this.gender)
    }
};

person.showInfo();

// console.log(person);
// console.log(person.name);
// console.log(person.age);
// console.log(person.gender);


// 3. 함수
// 1) square 객체에 너비(w)와 높이(h)를 저장
// 2) 함수 : squareArea() 만들기
//       너비와 높이를 매개변수로 받아서 곱하는 기능(면적 구하기)
// 3) 함수 호출하여 얻어진 값을 콘솔창에 출력해주기


// 선언문을 생략하면 기본적으로 var로 선언이 된다.
let square = {w: 20, h : 30};
let result;
function squareArea(w, h){
    return w * h;
}
result = squareArea(square.w, square.h);
console.log("면적:",  result);


function squareArea2(item){
    return item.w * item.h;
}

resutl = squareArea2(square);
console.log("면적2:",  result);

// 문제1) : 현재 날짜를 담고 있는 today 객체를 생성하고
// today를 객체로 받아 2023/12/11 형식으로 출력하는 함수를 만드시오.

let today = {
    year : 2023,
    month : 12,
    day : 11
};

// 문제2)
// 1) 인자를 세개 받음 - 순서대로 : 년, 월, 일
// 2) 년도 인자만 받았을 경우 = 년도만 문자열 리턴
// 3) 년도, 월만 받았을 경우 = 년과 월만 문자열 리턴
// 4) 년도, 월, 일 받으면  = 년/월/일 문자열 리턴 

function todayPrint2(year, month, day){

    // true : 그 외의 모든 값은 true로 처리함
    // false : 0, null, undefined

    // if(month == undefined && day == undefined){
    //     console.log(year);
    // }
    // else if(day == undefined){
    //     console.log(year + "/" + month);
    // }else{
    //     console.log(year + "/" + month + "/" + day);
    // }
    let str;

    if( year && month && day ){
        str = year + "/" + month + "/" + day
    }else if(year && month){
        str = year + "/" + month
    } else if (year){
        str = year
    }
    return str
}
todayPrint2(2023, 0, 12);

// function todayPrint(date){
//     console.log(date.year + "/" + date.month + "/" + date.day)   
//     // 백틱  
//     console.log(`${date.year}/${date.month}/${date.day}`)
// }

// todayPrint(today);