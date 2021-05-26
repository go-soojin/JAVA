import java.util.Scanner;

public class Rhombus {
	public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	
		System.out.println("가로 길이를 입력해주세요.");
		String input = s1.nextLine();
		double width = Integer.parseInt(input);
		
		System.out.println("세로 길이를 입력해주세요.");
		input = s1.nextLine();
		double height = Integer.parseInt(input);
		
		
		double rhombusArea = (width*height)/ (double)2;
		
		
		System.out.println("마름모의 넓이 : " + rhombusArea);

	
	} 
}
