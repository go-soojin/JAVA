import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class homeworkSavebox {
	int coins = 0;
	public void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금하실 금액을 입력해주세요.");
		String userInputString1 = scanner.nextLine();
		
		int coin = Integer.parseInt(userInputString1);
		System.out.println("딸그랑");
		coins = coins + coin;
		}
		
	
	
	public void deposit2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액, 메세지를 입력해주세요.");
		String message = scanner.nextLine();
		String[] splited = message.split(",");

		int coin = Integer.parseInt(splited[0]);
		coins = coins + coin;
		message = splited[1].trim();
		
		System.out.println(""+ coin + "(" + message + ")");
	}
	public void crash() {
		System.out.println("전체 금액 : " + coins);
	}
}
