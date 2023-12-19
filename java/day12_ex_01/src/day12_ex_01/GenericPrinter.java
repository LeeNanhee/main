package day12_ex_01;


// <T> : 자료형을 받는 매개변수 - 자료형의 이름을 T로 받음
public class GenericPrinter<T> {
	
	
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}
