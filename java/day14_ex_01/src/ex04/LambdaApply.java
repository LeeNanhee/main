package ex04;

public class LambdaApply {

	public static void main(String[] args) {
		
		// toUpperCase - 대문자변환 / toLowerCase - 소문자 변환 
		// String 객체에게 기본으로 제공되는 메서드임. 
		
		// 람다표현식을 메서드의 인자로 전달해서 사용하는 예제 (메서드 내에서 사용가능)
		// ----- 람다식을 매개변수로 전달 가능0, 유연성 높임.
		
		// (1) 람다식
		StringOperation toUpperCase = s -> s.toUpperCase();
		StringOperation toLowerCase = s -> s.toLowerCase();
		// (2) str
		String str = "Lambda Expressions";
		
		// (3) 메서드에 - 매개변수로 넘겨서 사용
		System.out.println(   processString(str, toUpperCase)   ) ;
		System.out.println(   processString(str, toLowerCase)   ) ;
		
	}
	
	public static String processString(String str, StringOperation operation) {
		return operation.apply(str); // 람다식 메서드 내에서 사용
	}
}



//toUpperCase.apply(str); // 대문자변환 하는 기능 구현 적용
//toLowerCase.apply(str); // 소문자변환 하는 기능 구현 적용
//








