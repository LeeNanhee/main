package day13_ex_01;

public class Test01 {

	public static void main(String[] args) {
		
		// 1) 내부 클래스 생성 - 동일하게 클래스니까 메서드 정의 가능
		// 2) 내부 클래스 안에서 인터페이스의 기능을 재정의
		// 3) 사용 - 객체명.메서드();
		
		// 익명클래스에서 인터페이스의 메서드 기능 구현
		CompareNumber compare01 = new CompareNumber() {		
				@Override
				public int compareTo(int x , int y) {
					return x > y ? 1 : ( x ==y ? 0 : -1);
				}
		};
		
		CompareNumber compare02 = (int x , int y) -> x > y ? 1 : ( x ==y ? 0 : -1);
		
		
		int x = 20;
		int y = 10;
		
		int result = compare02.compareTo(x, y);
		
		if(result == 1) {
			System.out.println("x가 크다.");
		}else if(result == 0){
			System.out.println("x와 y는 같다.");
		}else {
			System.out.println("y가 크다.");
		}
		
		
	}
}
