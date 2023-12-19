package day12_ex_02;

public class Test {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		memberArrayList.addMember( new Member(1001, "이순신") );
		memberArrayList.addMember( new Member(1002, "김유신") );
		memberArrayList.addMember( new Member(1003, "강감찬") );
		memberArrayList.addMember( new Member(1004, "홍길동") );
		memberArrayList.addMember( new Member(1005, "신사임당") );
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(1005);
		
		memberArrayList.showAllMember();
		
		
		
	}
	
}
