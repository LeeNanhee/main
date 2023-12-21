package ex03;

public class TestPerson {

	public static void main(String[] args) {
		
		// 1) 함수형 인터페이스 - 메서드 참조유형 (생성자 참조)
		PersonFactory pFactory01 = Person::new;
		Person boy = pFactory01.create("jonh", 20);
		
		// 2) 람다식으로 구현
		PersonFactory pFactory02 = (name, age)-> new Person(name, age);
		Person girl = pFactory02.create("elise", 28);
		
		// 3) 익명클래스 (이전버전)
		PersonFactory pFactory03 = new PersonFactory() {
			@Override
			public Person create(String name, int age) {
				return new Person(name, age);
			}
		};
		Person mom = pFactory03.create("Daisy", 58);
	}
}
