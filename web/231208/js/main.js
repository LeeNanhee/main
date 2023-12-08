
// addEventLisner이거 이용해서

// 각각의 a태그를 클릭하면, 해당 순번(인덱스, i) 이 콘솔창에 출력

// let tab_a01 = document.getElementsByClassName('menu');

let tab_a = document.querySelectorAll('.board .tab > li > a');
// 패널 선택해오시오. 이름 : tab_panel
let tab_panel = document.querySelectorAll('.board .tab > li > .panel');


for(let i = 0; i < tab_a.length; i++){

    tab_a[i].addEventListener('click', ()=>{
        // classList에서 추가 : add / 제거 : remove
        // 전체 panle의 classList에서 show제거 (remove)

        for(let j = 0; j < tab_a.length; j++){
            tab_panel[j].classList.remove('show');
        }

        tab_panel[i].classList.add('show');
    });
    
}

// let tab_panel = document.querySelectorAll('.board .tab > li > .panel');

//tab_panel[i].classList.add('show');