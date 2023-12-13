

let student = {
    name: 'Lee',
    score: {math:90, eng:80},
    grade : 'A',
    showInfo : function(){
        console.log("이름 : ",this.name);
        console.log("학점 : ",this.grade);
    },
    showScore : function(){
        for (i in this.score){
            console.log(i, ':', this.score[i]);
        }
    }
};

console.dir(student);

student.addr = 'seoul'
student.contact ='010-4412-2646'

student.showScore();
student.showInfo();



document.write('name : ', student.name,'<br>');
document.write('grade : ', student['grade']);

// for (i in student.score){
//     console.log(i, ':', student.score[i]);
// }