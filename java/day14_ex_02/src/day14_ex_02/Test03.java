package day14_ex_02;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.println("점수를 입력하세요 >> ");
			int score = scan.nextInt();
			
			if(score >= 65) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
			
		}catch(InputMismatchException e) {
			
			System.out.println("키보드 입력이 잘 못 되었습니다.");
		}
		
		scan.close();
		System.out.println("프로그램 종료");
		
		
	}

}








