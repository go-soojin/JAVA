import java.util.Scanner;

public class Exec2 {
	int kaup = 0;
	public void kaup1() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("체중을 kg단위로 입력해주세요");
		String userInput1 = s1.nextLine();
		Scanner s2 = new Scanner(System.in);
		System.out.println("신장을 m단위로 입력해주세요");
		String userInput2 = s2.nextLine();
		int kg = Integer.parseInt(userInput1);
		int cm = Integer.parseInt(userInput2);
		double kaup = (double) kg / (cm * cm)  ;
	}
	
		public void kaup2() {
		System.out.println("카우프 지수 = " + kaup);
	}
	
}
