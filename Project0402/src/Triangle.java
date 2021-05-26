import java.util.Scanner;

public class Triangle extends Base{ // 상속 (기본의 것에 추가 변경 가능 / 삭제 불가)
	double baseLine = 0;
	double height = 0;
	
	Triangle(String name) {
		super(name);
	}
	
	public void inputData() {
		System.out.println();
		System.out.println("------ " + this.name + " ------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("밑변을 입력해주세요.");
		String inputText = scanner.nextLine();
		this.baseLine = Double.parseDouble(inputText);
		System.out.println("높이를 입력해주세요.");
		inputText = scanner.nextLine();
		this.height = Double.parseDouble(inputText);
		
	}
	public void calcArea() {
		this.areaSize = this.baseLine * this.height / (double)2;
	}
}
