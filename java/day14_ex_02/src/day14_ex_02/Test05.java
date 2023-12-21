package day14_ex_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05 {
	
	public static void checkYourSelf(Scanner scan) throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자 있는 것이 좋다.");
		System.out.println("선택 >> ");
		int check = scan.nextInt();
		
		if(check == 1) {
			System.out.println("당신은 E 성향!");
		}else {
			System.out.println("당신은 I 성향!");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		try {
			System.out.println("성격 유형 검사를 시작합니다.");
			Test05.checkYourSelf(scan);
			
		}catch(InputMismatchException e) {
			System.out.println("키보드의 입력이 잘 못 되었습니다.");
		} finally {
			if(scan != null) 
				scan.close();
		}
		System.out.println("종료");
	}
}












