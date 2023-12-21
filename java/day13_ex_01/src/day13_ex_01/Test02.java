package day13_ex_01;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바에서는 객체 없이 메서드가 호출 될 수없음
		// 람다식을 구현하면, 익명의 내부 클래스가 만들어지고, 이를 통해 익명 객체가 생성이 된다.
		
		
		StrConcat strConcat01 = new StrConcat() {
			
			@Override
			public void sentence(str1, str2) {
				return str1 + "/" + str2;
			}
			
		} ;
		
		StrConcat strConcat02 = (str1, str2) -> str1 + "/" + str2 ;
			
		/*
		(1) 인터페이스 객체명 = (매개변수, 매개변수) -> 실행할문장;
		(2) 인터페이스 객체명 = (매개변수, 매개변수) -> {
				실행할문장; 
				return ;
			};
		*/
			
		
		
		
		System.out.println(strConcat02.concat("love", "peace!"));
	}

}
