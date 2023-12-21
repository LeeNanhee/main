package day14_ex_02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0;
		
		
		try {
			// 실행할 구문
			result = 10 / 0;
			System.out.println("나누기 결과 : " + result);
			
		}catch(ArithmeticException e){
			// 예외가 발생했을 때 처리할 구문
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램 종료");
	}

}








