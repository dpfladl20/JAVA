package package1;

public class Constructor2 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동",12);
		Person p2 = new Person("이순신",23);
		
		PersonView pv1 = new PersonView();
		PersonView pv2 = new PersonView(p2);
		
		pv1.info(p1);			// info : 들어온 값을 저장하고 정보출력
		
		pv2.info();				// info : 바로 정보 출력
		
	}
	
	
}


class Person{
	// 멤버변수 : 이름, 나이
	private String name;
	private int age;
	
	// 생성자 (생성자 통해서 멤버변수 초기화)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	
	
}

class PersonView{
	Person person;
	// PersonView a = new PersonView();
	// 기본 생성자 : 받아온 객체를 멤버변수에서 백업
	public PersonView() {}			// 여러 형태의 생성자(객체화)를 허용해주려고
	// 생성자 오버로딩 : 받아온 객체를 멤버변수에 백업
	public PersonView(Person person) {
		this.person = person;
	}
	
	
	// 메서드(멤버변수 출력용)
	public void info() {
		System.out.println("이름 : "+person.getName()+", 나이: "+person.getAge());
	}
	
	// 메서드 오버로딩(바뀐사람으로 저장 후 출력)
	public void info(Person person) {
		this.person = person;
		System.out.println("이름 : "+person.getName()+", 나이: "+person.getAge);
	}
}