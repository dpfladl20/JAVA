package loop;

public class While2 {
	public static void main(String[] args) {
		// 반복문 : 유사한 코드를 자동수행하기 위해
		
		// ex) 안녕 5번 입력하는 코드
		/*
		 * System.out.println("안녕"); System.out.println("안녕"); System.out.println("안녕");
		 * System.out.println("안녕"); System.out.println("안녕");
		 */
		
		// while문으로 변경하면
		// while은 설계가 필요하다 (만번만 수행할 수 있도록)
		
		int i = 0;
		while(i < 3) {
			// 반복 수행할 코드
			System.out.println("안녕");
			i++;		// 누적연산 += 1 or ++
		}
		
		// while을 사용하려면 플래그 변수가 필요, 조건식 세우기, while 안에서 플래그 값을 증감
		
		// 퀴즈 : while문을 사용해서 "반갑습니다" 15번 입력하기
		
		int chr = 0;
		while(chr < 15) {
			chr++;
			System.out.println("반갑습니다");
		}
		
	}
}
