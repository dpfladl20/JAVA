package java04;

// Impl : 구현부
public class PhoneImpl {
	public static void main(String[] args) {
		Phone p2 = new Phone2G();
		Phone p3 = new Phone3G();
		Phone p4 = new PhoneLTE();
		
		p2.call();
		p3.msg();
		p4.call();
	}

}


class Phone2G{
	public void call() {
		System.out.println("전화를 합니다");
	}
	public void msg() {
		System.out.println("문자를 보냅니다");
	}
}

class Phone3G implements Phone{

	@Override
	public void call() {
		System.out.println("3G로 전화를 합니다");
		
	}

	@Override
	public void msg() {
		System.out.println("3G로 문제를 보냅니다");
		
	}
	
}

class PhoneLTE implements Phone{

	@Override
	public void call() {
		System.out.println("LTE로 전화를 합니다");
		
	}

	@Override
	public void msg() {
		System.out.println("LTE로 문자를 보냅니다");
		
	}
	public void internet() {
		System.out.println("인터넷을 합니다");
	}
	public void lte() {
		System.out.println("빠름");
	}
}