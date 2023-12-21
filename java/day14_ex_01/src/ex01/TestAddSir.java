package ex01;

public class TestAddSir {

	public static void main(String[] args) {
	
		AddSir addSir = (name) -> name + "님";
		
		String str = addSir.addNim("홍길동");
		System.out.println(str);
		
		StrToInt converter = (num) -> Integer.parseInt(num); 
		// 문자열로된 숫자를 숫자형으로 바꿔주는 구문
		
		int n = converter.stringToInt("123");
		System.out.println(n);
		
	}
	
	
}
