package day12_ex_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberArrayList {
	
	private List<Member> arrayList;  // ArrayList 선언 

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();  //멤버로 선언한 ArrayList 생성
	}

	public void addMember(Member member){  //ArrayList 에 멤버 추가
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId){ 
		
		Iterator<Member> ir = arrayList.iterator();
		// hasNext() : Iterator가 가리키는 곳에 데이터가 있으면 true, 없으면 false
		// next() : 다음 데이터
		// remove() : next()로 읽어온 요소를 삭제한다
		// 메서드 호출 순서 : hasNext()-> next()->remove()순으로 호출
		
		while( ir.hasNext() ) {
			
			Member member = ir.next(); 
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member); // member에 해당하는 요소 삭제
				return true;
			}
		}
		
		System.out.print(memberId + "가 존재하지 않습니다.");
		return false;
		
	}
	
	public void showAllMember(){
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}


}





/*
 * 
 * for(int i =0; i<arrayList.size(); i++){
			
			Member member = arrayList.get(i); 
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i); // 해당 i번째 요소를 삭제
				return true;
			}
		}
 * 
 * 
 * 
 * */
