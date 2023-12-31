// 학생 객체 = object(타입 이름)

let num = 10;

// 객체 리터럴 - 변수처럼 정의해서 객체 만들때
// 클래스가 없어도 객체 생성 가능하다.
// 키와 값이 짝궁(한 셋트)
// 키(key) : 변수와 이름 짓는 규칙 비슷
// 값(value) : 원시타입( 숫자, 문자, null, undefined, true/false )
let student = {
    name : 'LEE',
    score : 90,
    grade : 'A'
};

// 1) 속성 추가
student.addr = 'seoul';
student['email'] = 'abc@naver.com';

// 2) 속성 삭제
delete student.grade
console.log(student);

// 3) 출력

// (1) 콘솔
console.log(student.addr);
console.log(student['name']); // 인덱싱하듯이

// (2) 브라우저 - document.write('작성한 내용 그대로 브라우저에 출력');
// 백틱으로 출력
document.write(`<p> ${student['name']} </p>`);
document.write(`<p> ${student.addr} </p>`);

// (3) 반복문 이용한 출력
// for( 변수명 in 객체명 ){} 
//  -- 객체 안에서 반복을 돌면서, 속성들을 하나씩 출력해준다.
// 변수명에 객체의 속성의 key가 담긴다. 변수명은 내가 정해주면 됨.

for( key in student) {
    document.write(`<p>${key} : ${student[key]}</p>`);
    
}

// 4) 해당하는 속성이 있는지? 검사
console.log('name' in student); // true
console.log('grade' in student); // false

// for~in 반복문 통해, 객체의 속성을 모두 출력 가능
//for( 변수명 in 객체명) {}
// 변수에 담기는 것은? key이 담긴다
// 속성의 값을 출력하고 싶으면 ?  객체명[key]




document.write();
document.write();
document.write();
document.write();
