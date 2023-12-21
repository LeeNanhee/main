package ex02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ■ 람다식
		//Converter<String, Integer> converter = s -> Integer.parseInt(s);
		
		// ■ 함수형 인터페이스 - 메서드 참조
		
		// 1) static(정적) 메서드 참조 
		Converter<String, Integer> converter01 = IntergerUtils::stringToInt;
		
		Integer result = converter01.converter("123");
		System.out.println(result);
	
		// 2) 인스턴스 메서드 참조 - 객체 생성하고, 객체이름(인스턴스 이름으로) 메서드를 참조한다.
		StringUtils strUtils = new StringUtils();
		Converter<String, String> converter02 = strUtils::reverse;
		
		String result02 = converter02.converter("hello");
		System.out.println(result02);
		
		// 3) 특정 객체의 인스턴스 메서드 참조 - 클래스명::메서드명
		
		List<String> names = Arrays.asList("John", "Jane","Doe");
		
		// String클래스의 compareTo메서드를 참조
		// compareTo - 두개의 문자열을 비교를 함.
		// 같으면 0, 
		// 사전적으로 앞에오면 음수 반환
		// 사전적으로 뒤에오면 양수 반환
		// String::compareTo - String 클래스의 compareTo 메서드를 참조해라.
		
		Collections.sort(names, String::compareTo);
		System.out.println(names);
		
	}

}








