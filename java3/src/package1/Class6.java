package package1;

public class Class6 {
	public static void main(String[] args) {
		Car 아빠차 = new Car();
		// 아빠차.name = "";				//private 하면 직접 사용이 불가능해짐
		// System.out.println(아빠차.name);
		
		아빠차.setName("그렌저");
		System.out.println(아빠차.getName());
		
	}
}

// 멤버변수는 private, 메서드는 public
/*
 접근권한 제어자
 	private : 다른 클래스에서 접근 불가능
 	
 	default(아무것도안적음) : 다른 패키지에서 접근 불가능
 	protected : 다른 패키지에서 접근 불가능하지만 상속했을 경우에는 가능
 	
 	public : 접근 가능(같은 프로젝트)
 */

// 캡슐화 : 멤버번수를 private 로 만들어서 외부클래스로부터 데이터를 보호하고 public 메서드로 사용한다

class Car{
	// 차명, 색상, 차번호(뒷자리) 
	private String name;		// private이 되면 다른 클래스에서 사용 불가능
	private String color;
	private int num;
	
	// 대입을 위해선 set
	private void setName(String name) {
		this.name = name;
	}
	private void setColor(String color) {
		this.color = color;
	}
	private void setNum(int num) {
		this.num = num;
	}
	
	// 사용을 위해선 get
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getNum() {
		return num;
	}
}