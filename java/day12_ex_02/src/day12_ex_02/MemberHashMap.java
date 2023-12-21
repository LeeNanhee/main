package day12_ex_02;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	// map : key, value 쌍으로 이루어짐
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		// 값추가 - put 메서드
		
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		
		if(hashMap.containsKey(memberId) ) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		// Iterator 구문을 작성해보기 -> 기존에 작성했던 구문 참고해도 됨. 
		// key를 중심으로 순회한다. Key에 해당하는 제네릭타입을 넣어준다. 
		// key값을 순회하기 때문에 next()로 찾는 값들은 key값이다.
		
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		// get(key)
		
	}

}








