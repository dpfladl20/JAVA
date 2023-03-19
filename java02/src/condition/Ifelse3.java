package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 20세 이상이면 성인, 14~20세 미만은 청소년, 14세 미만은 어린이로 구분
		System.out.print("나이를 입력하세요>> ");
		int age = 0;
		age = sc.nextInt();
		if(age < 14) {
			System.out.println("어린이");
		}else if(age >=14 && age <20) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
		

		// 2. 학점 계산 (90이상은 A, 80이상은 B, 70이상은 C, 그 미만은 F)
		System.out.print("점수를 입력하세요>> ");
		int score = 0;
		score = sc.nextInt();
		if(score >= 90) {
			System.out.println("학점 A");
		}else if(score >= 80) {
			System.out.println("학점 B");
		}else if(score >= 70) {
			System.out.println("학점 C");
		}else {
			System.out.println("학점 F");
		}
		

		// 3. 비밀번호를 정해놓고 사용자가 비밀번호를 입력해서 맞추면 "비밀번호가 맞습니다"
		// 틀리면 "비밀번호가 다릅니다"
		
		System.out.print("비밀번호를 입력하시오>> ");
		int key = 1234;
		int password = 0;
		password = sc.nextInt();
		if(password == key) {
			System.out.println("비밀번호가 맞습니다");
		}else {
			System.out.println("비밀번호가 틀립니다");
		}
		
		// 4. 윤년 판별하기(년도를 입력받아 해당 년도가 윤년인지 판별해보세요)
		System.out.print("해당 년도를 입력하시오>> ");
		int year = 0;
		year = sc.nextInt();
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println("윤년");
		}else {
			System.out.println("윤년이 아닙니다");
		}
	}
}
