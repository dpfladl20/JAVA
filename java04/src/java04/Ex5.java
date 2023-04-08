package java04;

public class Ex5 {
	public static void main(String[] args) {
	
		MyStrDeco msd = new MyStrDeco("bye");
		msd.printStr();
		
	}
}

class MyStr{
	protected String str;
	
	public MyStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	public String setStr(String str) {
		return str;
	}
	public void printStr() {
		System.out.println(str);
	}
}

// MyStr 클래스를 상속받고 출력이 좀더 꾸며진 채로 출력할 수 있게 변경
class MyStrDeco extends MyStr{

	public MyStrDeco(String str) {
		super(str);			// 부모 생성자에 기본생성자가 없으면 자식 생성자에서 사용을 해줘야 함
	} 
	
	public void printStr() {
		System.out.println("=="+str+"==");
	}
	
}