package loop;

public class While4 {
	public static void main(String[] args) {
		// while문은 ()조건식이 풀리면 {}실행을 안함
		
		// do~while : 일단 먼저 실행하고 조건검사해서 반복여부 결정
		int i = 0;
		do {
			System.out.println("한번만 무조건 실행 보장");
			i++;
		}while(i < 0);
		
		
		//
		
	}
}
