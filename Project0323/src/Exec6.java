import java.util.Scanner; 
public class Exec6 { 
	int coins = 0; 
	public void saveBox(int coin) { 
		coins = coins + coin; 
	} 
	public void deposit() { 
		System.out.println("잔액 : " + coins); 
	} 

	public static void main(String[] args) { 
		Exec6 box1 = new Exec6(); 
		box1.saveBox(5000);   // 디버깅 확인을 위해 잔액 5000원 설정

		for (int i = 0; i < 9999999; i++) {  
			System.out.println("원하시는 메뉴를 선택해주세요.");  
			System.out.println("1 : 돈 입금");  
			System.out.println("2 : 돈 입금 + 메세지 입력");  
			System.out.println("종료를 원하시면 crash를 입력하세요.");  
			Scanner s1 = new Scanner(System.in);  
			String userInputString = s1.nextLine();  
			
			if(userInputString.equals("1")) {  
				System.out.println("금액을 입력해주세요.");  
				Scanner s2 = new Scanner(System.in);  
				int userNum = s2.nextInt(); 
				System.out.println("딸그랑! 입금 금액 : " + userNum );
				box1.saveBox(userNum);
				box1.deposit();
//				break;
				
			}else if(userInputString.equals("2")) {  
				System.out.println("금액을 입력해주세요.");  
				Scanner s2 = new Scanner(System.in);  
				int userNum = s2.nextInt();   
				
				System.out.println("메세지를 입력해주세요." );  
				Scanner s3 = new Scanner(System.in);  
				String userInput = s3.nextLine(); 
				
				System.out.println("메세지 : " + userInput +  ", "  
				+  "입금 금액 : " +  userNum);  
				box1.saveBox(userNum);
				box1.deposit();
//				break;
				
			}else if (userInputString.equals("crash")) {  
				System.out.println("종료됩니다.");
				box1.deposit();
				break; 
			}  
			
		}  
	 }  
	}