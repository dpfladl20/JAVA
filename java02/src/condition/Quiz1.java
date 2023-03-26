package condition;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// if, for문 활용
		// 1. 1~10 중 짝수만 출력하기
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		// 2. 비밀번호 맞추기 (기회는 5번, 정수, 맞추면 맞췄다, 기회를 모두 사용하면 접속불가)
//		int pwd = 1234;
//		int user_input = 0;		//입력횟수 변수생성
//		
//		for(int i =0; i<5; i++) {
//			System.out.print("비밀번호를 입력하세요>> ");
//			user_input = sc.nextInt();
//			if(user_input == pwd) {
//				System.out.println("맞았습니다!");
//				break;
//			}
//			if(user_input == 4) {
//				System.out.print("접속불가");
//			}
//		}
		
		// 3. 시험합격 점수는 국어,영어,수학이 각각 40점 이상이고, 총점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 각과목이 40점 이상이나 총점이 미달되면 총점미달로 표기
		
		int kor = 40;
		int eng = 40;
		int mat = 40;
		int sum = kor + eng + mat;
		
		if(kor >=40 && eng >=40 && mat >=40) {
			if(sum >=150) {
				System.out.println("시험 합격");
			}else if(sum < 150) {
				System.out.println("총점 미달");
			}
		}else {
			System.out.println("과락");
		}
		
		// 4. 1~10까지의 합 구하기
		int sum2 = 0;
		for(int j = 1; j <= 10; j++) {
			sum2 += j;
		}
		System.out.println("1부터 10까지의 합은 "+sum2);
		
		
		// 5. 10~1까지 거꾸로 출력하기
		for(int t = 10; t >= 1 ; t--) {
			System.out.print(t+" ");
		}
	}
}
