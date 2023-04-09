package java07;

public class Review2 {
	// Review1의 코드가 복붙되었음
	
	// 상속을 했더니 클래스명에 빨간 밑줄이 간다? 명시해줘야하는 메서드가 있는것(생성자)
	// 빨간밑줄에 마우스를 갖다대고 첫번째 파란색 항목 클릭
	// super.	: 부모의 변수 또는 메서드를 사용
	// this.	: 나(클래스)의 변수 또는 메서드 사용
	// 상속(복붙)을 하는 이유는 '기존 클래스를 유지한채로 기능을 수정/추가하기 위해서'
	// 수정(오버라이딩 ==> 다시 만든다, 재정의)
	public void printNum() {
		// super.pirntNum();		// super.printNum() : 부모의 printNum을 사용 (코드실행)
		System.out.println();
	
		
	// 추가
	private String str = "자식 클래스";
	public void printStr() {
		System.out.println(str);
	}
			
	}
	
	public static void main(String[] args) {
		Review2 review2 = new Review2(0,1,2,3);
		review2.printNum();
		System.out.println(review2.num4);
		
	}
	
	
}
