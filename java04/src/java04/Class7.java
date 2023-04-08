package java04;

public class Class7 {
	public static void main(String[] args) {
		Human 홍씨 = new Human("홍길동",16);
		홍씨.말하기();
		홍씨.밥먹기();
		
		HumanEx 박씨 = new HumanEx("박첨지",17);
		박씨.말하기();
		박씨.걷기();
		
		HumanDeco 이씨 = new HumanDeco("이이",18);
		이씨.나이정보();
		
		// 이때, 원본에 버그가 발생해서 수정해야 하면?
		// 여러 차례 수정 필요
		// 실수를 할 확률이 높아짐
		
		// 문제발생원인 ==> 복사붙여넣기
		
	}
}

// 사람(Human) 클래스
class Human{
	//name, age
	private String name;
	private int age;
	private boolean gender;			//성별(남:false 여:true)
	
	// 생성자로 정보 채워넣기
	Human(String name, int age){
		System.out.println("생성");
		this.name = name;
		this.age = age;
		}
	
	// 말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println(name+"("+age+")+이(가) 말합니다.");
	}
	
	public void 걷기() {
		System.out.println(name+"("+age+")+이(가) 걷습니다");
	}
	
	public void 밥먹기() {
		System.out.println(name+"("+age+")+이(가) 밥을 먹습니다");
	}
	
}

//사람(Human) 클래스
class HumanEx{
	//name, age
	private String name;
	private int age;
	
	// 생성자로 정보 채워넣기
	HumanEx(String name, int age){
		this.name = name;
		this.age = age;
		}
	
	// 말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println(name+"이(가) 말합니다.");
	}
	
	public void 걷기() {
		System.out.println(name+"이(가) 걷습니다");
	}
	
	public void 밥먹기() {
		System.out.println(name+"이(가) 밥을 먹습니다");
	}
	
}

// Human 클래스에서 이름 양옆에 ==을 붙인 클래스
class HumanDeco{
	//name, age
	private String name;
	private int age;
	
	// 생성자로 정보 채워넣기
	HumanDeco(String name, int age){
		this.name = name;
		this.age = age;
		}
	
	// 말하기, 걷기, 밥먹기, 나이정보
	public void 말하기() {
		System.out.println("=="+name+"=="+"이(가) 말합니다.");
	}
	
	public void 걷기() {
		System.out.println("=="+name+"=="+"이(가) 걷습니다");
	}
	
	public void 밥먹기() {
		System.out.println("=="+name+"=="+"이(가) 밥을 먹습니다");
	}
	
	public void 나이정보() {
		System.out.println("=="+name+"=="+"의 나이는 "+age+"살 입니다.");
	}
	
}