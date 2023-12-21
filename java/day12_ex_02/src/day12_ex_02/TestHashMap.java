package day12_ex_02;

public class TestHashMap {
	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		memberHashMap.addMember( new Member(1001, "이순신") );
		memberHashMap.addMember( new Member(1002, "김유신") );
		memberHashMap.addMember( new Member(1003, "강감찬") );
		memberHashMap.addMember( new Member(1004, "홍길동") );
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMember();
	}
}
