package java04;

public class Ex2 {
	public static void main(String[] args) {
		// 상속 : 내 눈에는 안보이지만 컴퓨터가 클래스를 복사붙여넣기 하게한다
		// ㄴ 물려주다 (어떤 클래스에 있는 변수와 메서드를 다른 클래스에 물려준다)
		// extends : 클래스 복붙
		
		Person p1 = new Person();
		p1.정보입력("홍길동", 16, false);
		p1.정보보기();
		
		// 기존 클래스(Person)를 복붙해서 새로운 클래스를 만들어 약간의 수정을 거치고 싶다(상속)
		Member m1 = new Member();
		m1.정보입력("유관순", 17, true);
		m1.정보보기();
		
		// 상속을 하는 이유 : 기존 클래스에서 일부만 수정하기 위해!!
		
	}
}


// 사람 클래스
class Person{
	// private : 자신의 클래스 말고는 다 불가능
	// private -> protected : 상속에 한해서는 사용 허용
	protected String name;
	protected int age;
	private boolean gender;
	
	public void 정보입력(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void 정보보기() {
		System.out.println("이름:"+name+", 나이:"+age+", 성별:");
		if(gender == false) {
			System.out.println("남성");
		} else {
			System.out.println("여성");
		}
	}

}

// 상속 (회원클래스 - 사람에게 있는 변수와 메서드를 회원에게 물려주자!)
class Member extends Person{
	// 사람 클래스를 복사해서 회원 클래스에 붙여 넣어라
	// 상속을 하는 이유는 수정, 추가를 하기 위해서

	// 상속받은 다음 추가하는법 : 그냥 추가하면 됨
	private String 그룹명 = "우리그룹";
	
	public void 회원정보() {
		System.out.println(그룹명+"의 회원인 "+name+"입니다");
	}
	
	// 상속받은 다음 수정하는 법 : 오버라이딩
	// 오버라이딩 : 물려받은 메서드를 재정의(다시 만든다)
	public void 정보보기() {
		super.정보보기(); 			//super. : 상속해준 클래스의 정보보기를 사용
									// this. : 자기 클래스의 정보보기를 사용
		System.out.println("회원그룹은 "+그룹명);
	}
	// 오버라이딩(수정)의 원리 : 상속받은 것과 나의 것이 겹치면 나의 것이 '우선순위'가 더 높다
	
}