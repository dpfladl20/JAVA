package loop;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		// while문의 플래그를 활용하여 1~10의 합계를 구하라
		
		int i = 0;
		int sum = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("몇까지 더할까요?");
		num = sc.nextInt();
		while(i <= num) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터"+num+"까지의 합계: "+sum);
	}
}
