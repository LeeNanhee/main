package ArrayList;

public class MyArray {

		
		int[] intArr; // 저장될 공간
		int count; // 현재까지 저장된 개수
		
		public int ARRAY_SIZE; // 배열 기본 크기 설정
		public static final int ERROR_NUM = -9999999; // 에러가 생길경우, 상수 반환


		// 생성자 실행, 초기 저장된 개수 설정, 기본 배열 사이즈, 배열 생성
		public MyArray() {
			count = 0;
			ARRAY_SIZE = 10;
			intArr = new int[ARRAY_SIZE];
		}
		
		public MyArray(int size) {
			count = 0;
			ARRAY_SIZE = size;
			intArr = new int[ARRAY_SIZE];
		}
		
		// 1. 현재 저장된 개수를 알려주는 - size() 메서드 구현
		public int size() {
			return count;
		}
		
		// 2. 배열에 마지막 값 추가하는 - add() 메서드 구현
		// - 매개변수로 값을 받아야함. 
		public void add(int num) {
			
			// 만약에 - 현재 갯수가 최대크기일 이상일 경우, 
			// 저장할 수 없다 메시지 출력 - 메서드종료 (return;)
			if( count >= ARRAY_SIZE) {
				System.out.println("저장 공간 없음, 저장할 수 없음");
				return;
			}
			
			// 추가할 위치 인덱스 = count와 일치한다  
			intArr[count++] = num;
			
		}

		// 3. 배열 중간에 값을 삽입하는 - insert() 메서드 구현
		public void insert(int index, int num) {
			
			if( count >= ARRAY_SIZE) {
				System.out.println("저장 공간 없음, 저장할 수 없음");
				return;
			}
			
			// 인덱스 범위에 벗어난 숫자가 들어왔다면 - 인덱스번호 오류, 추가할 수 없음, 메서드 종료
			if(index < 0 || index > count) {
				System.out.println("인덱스번호 오류, 추가할 수 없음");
				return;
			}
			// 값을 한칸씩 미뤄야 한다.
			// 전체갯수-1 이 마지막 인덱스 번호이다.
			for(int i = count-1; i >= index ; i--) {
				intArr[i+1] = intArr[i];
			}
			
			
			intArr[index] = num; // 변경
			count++;
			
		}
		
		
		// 4. 해당 인덱스 값을 삭제하는 - remove() 메서드 구현
		public int remove(int index) {
			
			// ret에 에러번호를 넣어두었다가, 
			// 에러 발생하면 에러번호를 반환하고
			// 정상적으로 값이 찾아지면 찾은 값을 ret에 넣어두고
			// 마지막에 ret return함.
			
			int ret = ERROR_NUM;
			
			if(count == 0 ) {
				System.out.println("저장된 값이 없습니다.");
				return ret;
			}
			
			if(index < 0 || index > count) {
				System.out.println("인덱스번호 오류, 삭제할 수 없음");
				return ret;
			}
			
			ret = intArr[index];
			
			for(int i = index; i < count - 1 ; i++) {
				intArr[i] = intArr[i+1];
			}
			count--;
			
			return ret; // 삭제된 값이 마지막에 return
			
		}
		
		
		// 5. 인덱스 번호에 해당하는 값을 반환하는 - get() 메서드
		// 인덱스 범위가 벗어났으면, 인덱스 오류! 출력
		// 저장된 값이 없으면, 저장된 값이 없습니다! 출력
		// 인덱스 번호를 받고, 인덱스번호에 해당하는 값을 리턴하면된다.		
		
		public int get(int index) {
			if(count == 0 ) {
				System.out.println("저장된 값이 없습니다.");
				return ERROR_NUM;
			}
			
			if(index < 0 || index > count) {
				System.out.println("인덱스번호 오류, 삭제할 수 없음");
				return ERROR_NUM;
			}
			
			return intArr[index];
			
		}
		
		// 6. 전체 내역을 출력하는 - printAll() 메서드
		public void printAll() {
			
			if(count == 0 ) {
				System.out.println("저장된 값이 없습니다.");
				return;
			}
			
			for(int i = 0 ; i < count; i++) {
				System.out.println(intArr[i]);
			}
		}
		
		
		// 7. 전체 내역을 삭제하는 - removeAll() 메서드

		public void removeAll() {
			
			if(count == 0 ) {
				System.out.println("저장된 값이 없습니다.");
				return;
			}
			
			for(int i = 0 ; i < count; i++) {
				intArr[i] = 0;
			}
			count = 0;
		}
		
		
		public boolean isFull() {
			// 저장가능한 갯수보다 count 가 이상이면 true
			// 아니면 false 반환
			if (count >= ARRAY_SIZE) 
				return true;
			else
				return false;
		}

	}






