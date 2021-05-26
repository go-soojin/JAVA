import java.util.Scanner;

public class ExecClass1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DDay d1 = null;
		for (int i = 0; i < 99999; i++) {
			System.out.println("원하시는 기능을 선택하세요.");
			System.out.println("1: 기념일 입력");
			System.out.println("2: D-day 출력");
			System.out.println("exit : 종료");

			String userInputString = scanner.nextLine();
			if (userInputString.equals("1")) {
				// 기념일 입력
				System.out.println("기념일을 입력해주세요. (ex. yyyy-MM-dd)");
				String inputDateString = scanner.nextLine();
				d1 = new DDay(inputDateString);
			} else if (userInputString.equals("2")) {
				// D-day 출력
				d1.calculationDDay();
				System.out.println(d1);
			} else if (userInputString.equals("exit")) {
				break;
			}
		}
	}
}
