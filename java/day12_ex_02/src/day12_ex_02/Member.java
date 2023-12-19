package day12_ex_02;

/*
	1) Member 클래스를 만들고, 아이디와 이름을 멤버 변수로 선언
	
	2) Member관리 클래스 -> 컬렉션 프레임워크 활용
	- Member 클래스로 생성된 인스턴스들을 관리하는 클래스를
	  컬렉션 프레임워크 클래스들을 활용하여 구현한다.
*/


public class Member {
	
	private int memberId;        //회원 아이디
	private String memberName;   //회원 이름

	public Member(int memberId, String memberName){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {  //
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString(){   //toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	
	
	@Override
	public int hashCode() {
		// 인스터 객체마다 가지고 있는 고유번호
		// 멤버 id로 교체
		return memberId;
	}
	
	public boolean equals(Object obj) {
		if( obj instanceof Member){
			Member member = (Member)obj;
			if( this.memberId == member.memberId )
				return true;
			else 
				return false;
		}
		return false;
	}


}
