
public class Student { // 객체를 만들기 위한 class, 기본적으로 Object class 상속
	public String name; // 객체
	private String address; // 객체
	private String phone; // 객체
	private int age; // 객체
	
	Student(String name, String address, String phone, int age){ // 생성자
		this.name = name; // 내부 property로 접근
		this.address = address;
		this.phone = phone;
		this.age = age;
	}
	
	protected void printInfo() {
		System.out.println("이름 : "+ this.name+", 주소 : " + this.address + ", 연락처 : " 
							+ this.phone + ", 나이 : " + this.age);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() { 
		return "이름 : "+ this.name + ", 나이 : " + this.age;
	}
}


