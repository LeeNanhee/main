package day13_ex_02;

public class Calculator {
	
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void add() {

		// 클래스 선언
		
	}
	
	
	
	// 내부 클래스 정의
	public class Calc{ 
		// 메서드
		public int add() {
			return num1 + num2;
		}
	}
	

}
