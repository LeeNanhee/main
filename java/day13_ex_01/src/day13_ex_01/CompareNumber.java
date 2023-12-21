package day13_ex_01;

// 함수형 인터페이스 선언하기
// 익명 함수와 매개변수만으로 구현된 인터페이스, 
// @FunctionalInterface를 붙여준다.
// 함수형 인터페이스라는 의미
// 함수형 인터페이스는 내부에 메서드가 1개만 존재해야 함. 2개 이상이면 에러가 남. 

@FunctionalInterface
public interface CompareNumber {
	int compareTo(int x , int y);
}
