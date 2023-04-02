package package1;

public class KrController {
	public static void main(String[] args) {
		KrModel km1 = new KrModel();
		KrModel km2 = new KrModel();
		
		km1.setNum(123);
		km1.setStr("안녕");
		
		km2.setNum(456);
		km2.setStr("반갑");
		
		KrService ks = new KrService();
		ks.decoEquals(km1);
		ks.decoPlus(km2);
		
		
		KrView kv = new KrView();
		kv.printNum(km1);
		kv.printStr(km2);
	}
}

//KrModel 클래스(변수 : num, str / 메서드 : get, set)
class KrModel{
	
	int num;
	String str;
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	public int getNum() {
		return num;
	}
	public String getStr() {
		return str;
	}
	
}

// KrView 클래스(출력용)
class KrView{
	void printNum(KrModel km) {
		System.out.println(km.getNum());	
	}
	void printStr(KrModel km) {
		System.out.println(km.getStr());
	}
}

// KrService 클래스 (자바기능)
class KrService{
	// 출력 전에 꾸며주기
	void decoEquals(KrModel km) {
		// 양 옆에 == 표시
		km.setStr("=="+km.getStr()+"==");		// 문자열을 가져온 다음 == 을 붙여서 저장
	}
	void decoPlus(KrModel km) {
		// 양 옆에 + 표시
		// km.setStr("+"+km.getStr()+"+");			// 문자열을 가져온 다음 +을 붙여서 저장
		km.str = "+"+km.str+"+";
		
	}
	
}