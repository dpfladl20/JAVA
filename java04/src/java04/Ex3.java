package java04;

public class Ex3 {
	public static void main(String[] args) {
		MyString ms1 = new MyString("hello");
		ms1.myPrint2();
		
		
	}
}

// class : 변수+함수
class MyString{
	private String str1;
	String str2;
	protected String str3;
	public String str4;
	
	// 생성자 생성
	MyString(String str){
		System.out.println("MyString 객체화");
		this.str1 = str;
		this.str2 = str;
		this.str3 = str;
		this.str4 = str;
	}
	
	public void myPrint1(){
		System.out.println(str1);
	}
	public void myPrint2(){
		System.out.println(str1+str2+str3+str4);
	}
	public void setStr(String str) {
		this.str1 = str;
	}
	public String getStr(String str) {
		return str1;
	}
}

// extends : 복붙
class MyStringEx extends MyString{

	MyStringEx(String a_str1, String a_str2) {
		super(a_str1);		// ()가 있다는 것은 '함수'라는 뜻
		// super() : 부모(상속)의 생성자
		// super. : 부모(상속)의 것을 사용하겠다
		str1 = "";			//private라 모름
		str2 = "";			//default
		str3 = "";			//protected
		str4 = "";			//public
		setStr(a_str2);
		
		
	}
	
}