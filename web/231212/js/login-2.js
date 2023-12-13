let userInfo = {id:'korea' , password:'asdf1234!!'};

let userId = document.getElementById('id');
let userPw = document.getElementById('pw');
let loginBtn = document.getElementById('loginBtn');
let idBox = document.getElementsByClassName('idBox')[0];
let errorMessage = document.getElementsByClassName('errorMessage')[0];
const regex = /(?=.*[a-z])(?=.*[\d])(?=.*[@#$%^&*!?])[a-z\d@#$%^&*!?]+/



// loginBtn.addEventListener('click', function(){
//     let idValue = userId.value;
//     let pwValue = userPw.value; 
//     console.log(idValue);
//     console.log(pwValue);

//     if(idValue == "" && pwValue == ""){
//         errorMessage.innerText = "id,pw를 입력해주세요.";
//     }else if(idValue == ""){
//         errorMessage.innerText = "id를 입력해주세요.";
//     }else if(pwValue == ""){
//         errorMessage.innerText = "pw를 입력해주세요.";
//     }else if(idValue.length < 4 || idValue.length > 12){
//         errorMessage.innerText = "아이디는 4-12 글자 입니다.";
//     }else if(!regex.test(pwValue)){
//         errorMessage.innerText = "비밀번호 양식이랑 다릅니다."
//     }else{
//         if(idValue == userInfo.id && pwValue == userInfo.password){
//             errorMessage.innerText = "";
//             idValue = "";
//             pwValue = "";
//             alert('로그인성공');            
//         }else{
//             idValue = "";
//             pwValue = "";
//             errorMessage.innerText = "아이디 또는 비밀번호를 잘못 입력했습니다. 입력하신 내용을 확인해주세요.";            
//         }
//     }
// });

function 버튼누르기(){
    let idValue = userId.value;
    let pwValue = userPw.value; 
    console.log(idValue);
    console.log(pwValue);

    if(idValue == "" && pwValue == ""){
        errorMessage.innerText = "id,pw를 입력해주세요.";
    }else if(idValue == ""){
        errorMessage.innerText = "id를 입력해주세요.";
    }else if(pwValue == ""){
        errorMessage.innerText = "pw를 입력해주세요.";
    }else if(idValue.length < 4 || idValue.length > 12){
        errorMessage.innerText = "아이디는 4-12 글자 입니다.";
    }else if(!regex.test(pwValue)){
        errorMessage.innerText = "비밀번호 양식이랑 다릅니다."
    }else{
        if(idValue == userInfo.id && pwValue == userInfo.password){
            errorMessage.innerText = "";
            idValue = "";
            pwValue = "";
            alert('로그인성공');            
        }else{
            idValue = "";
            pwValue = "";
            errorMessage.innerText = "아이디 또는 비밀번호를 잘못 입력했습니다. 입력하신 내용을 확인해주세요.";            
        }
    }
}
