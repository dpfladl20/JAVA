package package1;

public class Class7 {
	public static void main(String[] args) {
		// 객체화
		Human hm = new Human();
		
		hm.setName("홍길동");
		hm.setGender("남");
		hm.setAge(26);
		
		HumanView hv = new HumanView();
		
		hv.printInfo(hm);
		
	}
}


// 멤버변수 private
// 메서드 public
class Human{
	// 데이터 : name, gender, age
	
	private String name;
	private String gender;
	private int age;

	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
}


class HumanView{
	void printInfo(Human hm) {
		// 이름, 성별, 나이를 한번에 안내(출력)
		System.out.println(hm.name);
		System.out.println(hm.gender);
		System.out.println(hm.age);
	}
}