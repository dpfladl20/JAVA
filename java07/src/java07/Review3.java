package java07;

public interface Review3 {
	// 상속용 클래스
	// 인터페이스 : 상수 or 메서드의 선언부만 올 수 있음
	final static String str = "Review3 Interface";		//상숭 final : 한번 정하면 못바꿈
	String str2 = "final static 이 생략되어 있음";
	
	public void test1();		// {} 없이 선언까지만
	public void tste2();		// 상속받은 곳에서 반드시 오버라이딩으로 {}을 구현해줘야 함
	
	
	
	
	
}
