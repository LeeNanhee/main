package day12_ex_02;

public class TestHashSet {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		memberHashSet.addMember( new Member(1001, "이순신") );
		memberHashSet.addMember( new Member(1002, "김유신") );
		memberHashSet.addMember( new Member(1003, "강감찬") );
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");  //1003 아이디 중복인데 추가가됨
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	
		
		memberHashSet.removeMember(1002);
		memberHashSet.showAllMember();
		
	}
	
}
