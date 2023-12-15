package day11_ex_01;

public class ItemList {
	
	private Item start; // 시작 객체의 주소값을 저장할 변수;
	private int count;
	
	public ItemList() {
		start = null;
		count = 0;
	}

	// 참조 변수: 주소값을 가지고 값에 접근 
	
	// 1. add
	public Item add(String data) {
		
		// 물리적으로 위치가 순서대로 존재하지 않는다. 
		
		Item newItem;
		if( start == null) {
			newItem = new Item(data);
			start = newItem; // 새로 생성된 아이템의 주소값을 start에 넣어준다.
		}else {
			newItem = new Item(data);
			
			Item temp = start; // temp는 링크드리스트 각각의 아이템을 차례대로 가리키는 역할을 하게됨.
			
			while(temp.nextLink != null) { // nextLink가 비어 있는 것을 찾으면 반복문 종료
				temp = temp.nextLink;
			}
			
			temp.nextLink = newItem; 
			// nextLink가 null값인 것을 찾으면 새로 생성한 newItem 주소를 nextLink에 설정
		}
		count++;
		return newItem;
		
	}
	
	// 2. insert
	public Item insert(int index, String data) {
		
		int i;
		
		Item tempItem = start;
		Item newItem = new Item(data);
		
		if(index <0 || index > count) {
			System.out.println("추가 할 위치 오류");
			return null;
		} 
		
		if(index == 0) { // 맨 앞에 추가하는 경우
			
			newItem.nextLink = start; // start의 주소값 -> 새로추가된 item의 nextLink에 설정 = 맨 앞에 있는 효과가 생김
			start = newItem; // start가 가리키는 곳을 새로 추가된 item 변경
			
		} else {
			
			Item prevItem = null;
			
			for(i = 0; i < index; i++) {
				prevItem = tempItem;
				tempItem = tempItem.nextLink;
			}
			newItem.nextLink = prevItem.nextLink;
			prevItem.nextLink = newItem;
		}
		count++;
		
		return newItem;
		
	}
	
	// 3. remove
	public Item remove(int index)
	{
		int i;
		Item tempItem = start;
		
		if(index >= count ){
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(index == 0){  //맨 앞을 삭제하는
			start = tempItem.nextLink;
		}
		else{
			Item prevItem = null;	
			for(i=0; i<index; i++){
				prevItem = tempItem;
				tempItem = tempItem.nextLink;
			}
			prevItem.nextLink = tempItem.nextLink;
		}
		count--;
		System.out.println(index + "번째 항목 삭제되었습니다.");
		
		return tempItem;
	}

	// 4. get
	public String get(int index)
	{
		int i;
		Item tempItem = start;
		
		if(index >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(index == 0){  //맨 인 경우

			return start.getData();
		}
		
		for(i=0; i<index; i++){
			tempItem = tempItem.nextLink;
			
		}
		return tempItem.getData();
	}

	
	// 5. printAll
	public void printAll() {
		if(count == 0) {
			System.out.println("출력할 내용 없음");
			return;
		}
		
		Item temp = start; // temp를 시작 인스터스로 설정 (temp를 통해서 다음 인스턴스로 이동)
		
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.nextLink; // 다음 아이템으로 이동 (링크 타고 이동)
			if(temp != null) {
				System.out.println("->");
			}
			
		}
		System.out.println(""); // 빈줄 하나 출력
	}
}













