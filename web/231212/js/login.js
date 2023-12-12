
// 문제1) 객체 생성하기
// userInfo객체에 아이디(id)와 비밀번호(password) 프로퍼티로 저장 - korea / 1234

// 문제2) 필요한 요소를 선택해서 변수에 담아 놓기
// userId변수에 = 아이디 받을 값 체크  - 아이디에 대한 요소 선택
// userPW변수에 = 비밀번호 값을 체크  - 비밀번호 칸에 대한 요소 선택
// loginBtn 변수에 = 로그인 버튼 선택해서 담아두기

let userInfo = {
    id : 'korea', 
    pw : '1234'
}

// input상자가 가지고 있는 값 value 프로퍼티에 담겨있다
let userId = document.getElementById("id");
let userPw = document.getElementById("pw");
let loginBtn = document.getElementById("loginBtn");
let errorMessage = document.getElementsByClassName("errorMessage")[0];

// 정규식 : 영어소문자, 숫자, 특수문자가 1개 이상 반드시 포함되어야 한다
const regex = /(?=.*[a-z])(?=.*[\d])(?=.*[@$!%*?&]])[a-z\d@$!%*?&]+/;

// 문제3. loginBtn을 클릭하면, 현재 id, pw 박스에 설정된 value를 출력해라. 콘솔창에
// 1) addEventListener 이용하시오
// 2) 태그에 이벤트 연결하는 방법

loginBtn.addEventListener('click', function(){

    // 문제4. userId, userPW가 비어 있다면, 콘솔창에 값이 없습니다 띄우기
    // id 입력x, pw입력x, 둘다 입력 안 된 경우 - if / && / ||
    // else if 추가 - 아이디가 4~12글자가 아니면- 아이디는 4~12글자 입니다.
    let idValue = userId.value;
    let pwValue = userPw.value;
    
    if(idValue =="" &&  pwValue==""){
        errorMessage.innerText = "ID와 PW를 입력해주세요";
    }else if(idValue ==""){
        errorMessage.innerText = "ID를 입력해주세요";
    }else if(pwValue ==""){
        errorMessage.innerText = "password를 입력해주세요";
    }else if(idValue.length < 4  || idValue.length > 12){
        errorMessage.innerText = "아이디는 4~12글자 입니다.";
    }else if(!regex.test(userInfo.pw)){ 
        // 정규식에 안 맞으면 false -> true가 되어서 실행됨
        errorMessage.innerText = "비밀번호는 영문소문자, 숫자, 특수문자로 구성되어 있습니다.";
    }
    else{
        // 모두 입력된 상태
        if(userId.value == userInfo.id && userPw.value == userInfo.pw){
            errorMessage.innerText ="";
            userId.value = "";
            userPw.value = ""
            alert('로그인 성공');
        }else{
            errorMessage.innerText = "아이디 또는 비밀번호를 잘못 입력했습니다. 입력하신 내용을 확인해주세요.";
            userId.value = "";
            userPw.value = "";
        }

    }
    
      
    // 문제5. 비밀번호를 - 숫자, 문자, 특수문자 포함 - 유효성 검사 (정규식)

    // 문제6. 객체에 담긴 userId, userPw가 일치하는 검사
    // 입력받은 내용과 일치하면 - alert('로그인성공')
    // 실패하면  - 아이디 또는 비밀번호를 잘못 입력했습니다. 입력하신 내용을 확인해주세요.
    

});






