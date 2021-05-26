import java.util.Scanner;

public class Exec5 {
	public static void main(String[] args) {
		for (int i = 0; i < 9999999; i++) {
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1 : 돈 입금");
			System.out.println("2 : 돈 입금 + 메세지 입력");
			System.out.println("종료를 원하시면 crash를 입력하세요.");
			
			Scanner s1 = new Scanner(System.in);
			String userInputString = s1.nextLine();
//			if(userInputString.equals("crash")) {
//				break;
//			}
//			System.out.println("종료됩니다.");
			
			int convertNumber = Integer.parseInt(userInputString);
			if(convertNumber == 1) {
				System.out.println("금액을 입력해주세요.");
				Scanner s2 = new Scanner(System.in);
				int userNum = s2.nextInt();
				System.out.println("딸그랑! 입금 금액 : " + userNum);
			}else if(convertNumber == 2) {
				System.out.println("금액을 입력해주세요.");
				Scanner s2 = new Scanner(System.in);
				int userNum = s2.nextInt(); 
				System.out.println("메세지를 입력해주세요." );
				Scanner s3 = new Scanner(System.in);
				String userInput = s3.nextLine();
				System.out.println("메세지 : " + userInput + ", " +  "입금금액 : " + userNum);
			}else if (userInputString.equals("crash")) {
				break;
			}
			
		}
}
	}