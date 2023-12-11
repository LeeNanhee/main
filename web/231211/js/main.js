function exam01(){
    console.log('메서드 정상 호출!')
}

function exam02(n){
    console.log(n);
    // 아이디가 txt-1인 요소를 선택해서
    // innerHTML 속성값 = 매개변수 값으로 설정해라
    document.getElementById('txt-1').innerText = n;
    document.getElementById('txt-2').value = n;
}    