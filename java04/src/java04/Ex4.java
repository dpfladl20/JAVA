package java04;

public class Ex4 {
	public static void main(String[] args) {
		스타벅스 cafe1 = new 스타벅스("본점",123);
		cafe1.printMenu();
		스타벅스_부평점 cafe2 = new 스타벅스_부평점("부평점",456);
		cafe2.printMenu();
		스타벅스_강남점 cafe3 = new 스타벅스_강남점("강남점",789);
		cafe3.printMenu();
	}
}


// 스타벅스
class 스타벅스{
	protected String 지점명;
	protected String 메뉴[] = new String[3];
	protected int 매출;
	
	//생성자
	public 스타벅스(String 지점명, int 매출) {
		this.지점명 = 지점명;
		this.매출 = 매출;
		setMenu();
	}
	public void setMenu() {
		메뉴[0] = "카푸치노";
		메뉴[1] = "카페라떼";
		메뉴[2] = "오렌지주스";
	}
	public void printMenu() {
		System.out.print(지점명+"의 메뉴판 : ");
		for(int i = 0; i <메뉴.length; ++i) {
			System.out.print(메뉴[i]+" ");
		}
		System.out.println();
	}
}

// 스타벅스_부평점
class 스타벅스_부평점 extends 스타벅스{
	public 스타벅스_부평점(String 지점명, int 매출) {
		super(지점명, 매출);
	}
	public void setMenu() {
		메뉴[0] = "아메리카노";
		메뉴[1] = "에스프레소";
		메뉴[2] = "딸기주스";
	}
	
	// 추가
	// 오버로딩 : 메서드명이 같아도 매개변수가 다르면 다른 메서드로 취급
	public void setMenu(String 메뉴1, String 메뉴2, String 메뉴3) {
		메뉴[0] = 메뉴1;
		메뉴[1] = 메뉴2;
		메뉴[2] = 메뉴3;
	}
}

// 스타벅스_강남점
class 스타벅스_강남점 extends 스타벅스{
	public 스타벅스_강남점(String 지점명, int 매출) {
		super(지점명,매출);
	}
	public void setMenu() {
		메뉴[0] = "캬라멜마끼아또";
		메뉴[1] = "아이스크림";
		메뉴[2] = "팥빙수";
	}
}

