package Stack;

 // import 패키지명.java파일명;
import ArrayList.MyArray;

public class StackArray {

	int top;
	MyArray stackArr;
	
	public StackArray() {
		top = 0;
		stackArr = new MyArray();
	}
	
	public StackArray(int size) {
		stackArr = new MyArray(size);
	}
	
	// 1. 추가
	public void push(int data) {
		if(stackArr.isFull()) {
			System.out.println("Stack is Full.");
			return;
		}
		stackArr.add(data);
		top++; // 몇개 쌓였는지? = 갯수
	}
	
	// 2. 삭제
	public int pop() {
		if( top == 0){
			System.out.println("Stack is Empty.");
			return MyArray.ERROR_NUM;
		}
		
		return stackArr.remove(--top);
		
	
	}
	
}







