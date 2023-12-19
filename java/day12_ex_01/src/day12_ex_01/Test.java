package day12_ex_01;

/* 제네릭
- 다이아몬드 연산자 <>에서 <>를 다이아몬드 연산자라 함
- ArrayList list = new ArrayList<>();  //다이아몬든 연산자 내부에서 자료형은 생략가능 함
*/

public class Test {

	public static void main(String[] args) {
		
		GenericPrinter<Plastic> powderPrinter = new GenericPrinter<Plastic>();
		powderPrinter.setMaterial(new Plastic() );
		System.out.println(powderPrinter);
	}
}
