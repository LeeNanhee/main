package LinkedList;

public class Item {

	private String data;  // 현재 객체가 가지고 있는 데이터(문자열) - 값저장
	public Item nextLink; // 다음 객체의 주소값을 저장할 변수 - 다음 객체 주소
	
	public Item() {
		data = null;
		nextLink = null;
	}
	
	public Item(String data) {
		this.data = data;
		nextLink = null;
	}
	
	public Item(String data, Item link) {
		this.data = data;
		this.nextLink = link;
	}
	
	public String getData() {
		return data;
	}
	
}
