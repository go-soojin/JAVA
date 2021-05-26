import java.util.Scanner;

public class Circle extends Base {
	double radius = 0;
	
	Circle(String name) {
		super(name); // 상속받은 곳에 있는 것 실행해
	}
	
	@Override
	public void inputData() {
		System.out.println();
		System.out.println("------ " + this.name + " ------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("반지름을 입력해주세요.");
		String inputText = scanner.nextLine();
		this.radius = Double.parseDouble(inputText);	
	}
	@Override
	public void calcArea() {
		this.areaSize = this.radius *this.radius * 3.14;
	}
}
