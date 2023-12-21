package day14_ex_02;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int val = 0;
		
		while(true) {
			try {
				System.out.println("숫자를 입력하세요(0~50)");
				val = scan.nextInt();
				
				if(val == -1) {
					break;
				}
				if(val < 0 || val >50) {
					// 강제로 예외를 발생시킨다
					throw new Exception("숫자의 허용범위가 아닙니다.");
				}
			}catch(Exception e) {
				scan.nextLine(); // scan에 들어 있는 내용 비운다.
				System.out.println("에러 메시지" + e.getMessage());
				
			}
			scan.close();
			System.out.println("프로그램 종료.");
		}
	}
}








