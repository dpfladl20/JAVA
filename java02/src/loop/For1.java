package loop;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : while, for
		// for : while이 가독성이 떨어져서
		
		// 0~9까지 출력 while
		int i = 0;
		while(i <10) {
			// 반복할 코드를 위에 적은 후 끝나고 +1 씩 넣어주기
			System.out.println("while: "+i);
			i++;
		}
		// while문 단점 : 바깥에 플래그 만들어줘야 함, {}안에서 플래그를 증감, 가독성이 떨어짐
		
		// 0~9까지 출력 for
		// for문 : 플래그 관련 코드는 ()에 몰아버리자! 반복할 코드만{}에 남기자!
		for(int j = 0; j<10; j++) {
			System.out.println("for: "+j);
		}
		// for(초기값;조건식;증감량){반복할 코드;}
		// for문의 단점 : while만큼 자유롭지 못하다
		
	}
}