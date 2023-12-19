package Queue;

public class TestQueue {

	public static void main(String[] args) {
		
		QueueList myList = new QueueList();
		
		myList.enQueue("A");
		myList.enQueue("B");
		myList.enQueue("C");
		myList.enQueue("D");
		myList.enQueue("E");
		
		myList.printAll();
		
	}
}
