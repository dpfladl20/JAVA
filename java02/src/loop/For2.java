package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		// for문을 통해서 구현하자
		
		// 1. 안녕 5번
		for(int i = 0; i<5; i++) {
			System.out.println("안녕");
		}
		// 2. 1~10까지 합계 구하기
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 "+sum);
		
		// 3. 1~입력값까지 합계 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("입력한 값까지 더하시오>> ");
		int num = 0;
		num = sc.nextInt();
		int sum2 = 0;
		for(int i = 1; i <= num; i++) {
			sum2 += i;
		}
		System.out.println("1부터 "+num+"까지의 합은 "+sum2);
	}
}
