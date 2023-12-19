package Queue;

import LinkedList.Item;
import LinkedList.ItemList;

/* 큐 = 앞에서부터 순서대로 처리
- 맨 앞(front) 에서 자료를 꺼내거나 삭제하고, 맨 뒤(rear)에서 자료를 추가 함
- Fist In First Out (선입선출) 구조
- 일상 생활에서 일렬로 줄 서 있는 모양
- 순차적으로 입력된 자료를 순서대로 처리하는데 많이 사용 되는 자료구조
- 콜센터에 들어온 문의 전화, 메세지 큐 등에 활용됨
*/
public class QueueList{
	
	Item front; // start
	Item rear; // end
	ItemList list;
	
	public QueueList() {
		front = null;
		rear = null;
		list = new ItemList();
	}

	// 1. 추가 (맨뒤에 추가) - enQueue
	public void enQueue(String data) {
		Item newItem;
		
		if(list.isEmpty()) {
			newItem = list.add(data);
			front = newItem;
		}else {
			newItem = list.add(data);
			rear = newItem;
		}
		System.out.println(newItem.getData() + " Added!");
	}
	
	// 2. 삭제 (맨 앞에 삭제) - deQueue
	public String deQueue() {
		if(list.isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData();
		front = front.nextLink;
		
		if(front == null) {
			rear = null;
		}
		return data;
	}
	
	// 3. 출력
	public void printAll() {
		if(list.isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		Item temp = front;
		while(temp != null) {
			System.out.print(temp.getData() + ",");
			temp = temp.nextLink;
		}
		System.out.println();
	}
	
}





