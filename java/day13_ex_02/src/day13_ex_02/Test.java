package day13_ex_02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 외부 클래스 객체 생성
		Calculator cal = new Calculator(10, 11); // 외부클래스 객체
		
		// 인스턴스 내부 클래스
		// [외부클래스명.내부클래스명] 객체명 = [외부클래스명].new [내부클래스]();
		Calculator.Calc c = cal.new Calc(); // 내부클래스를 객체
		
		
		
	}

}






