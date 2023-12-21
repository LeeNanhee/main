package ex02;

@FunctionalInterface
public interface Converter<F, T> {
	// T : 반환형, F : 매개변수의 자료형
	T converter(F from);
}
