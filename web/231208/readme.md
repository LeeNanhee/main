# 자바스크립트 기본 개념

객체 
- class 객체
- html 요소도 하나의 객체로 바라본다.

객체 기본요소
1) 멤버변수(필드) / 정보 가지고 있음
형식 : 요소명.style.fontFamily = "";

2) 메서드 / 기능
형식 :  요소명.setAttribute(); 

# 속성
- property : 자바스크립트에서 제공하는 속성들 (prop)
- attribute : html 태그의 속성들 (attr)
        
# 컴퓨터에서 이벤트가 발생하면! 무슨 동작을 할께!
* 이벤트 
- 마우스 : click, dblclick,  scroll, DOMMouseWheel, 
- 키보드 : keyup, keydown, 
- 브라우저 : resize, 

1) 이벤트 리스너

요소.addEventListener('이벤트 이름', function(){
    함수이름();
});

요소.addEventListener('이벤트 이름', ()=>{
    함수이름();
});


2) 태그에서 이벤연결

<태그 onclick = "함수이름()">
<script>
    function 함수이름(){
        기능구현
    }

    let 함수이름 = ()=>{
        기능구현
    }
</script>