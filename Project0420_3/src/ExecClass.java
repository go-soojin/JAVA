import java.util.ArrayList;
import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		ArrayList<Customer> c1 = new ArrayList<Customer>();
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i <999; i++) {
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1 : 방문자 입력");
			System.out.println("2 : 전체 방문자 출력");
			System.out.println("3 : 별점 입력");
			System.out.println("4 : 전체 별점 출력");		
			System.out.println("quit : 종료");
			
			String userInput = scanner.nextLine();
			if(userInput.equals("1")) {
				System.out.println("이름을 입력해주세요.");
				String name = scanner.nextLine();
				System.out.println("연락처를 입력해주세요.");
				String phone = scanner.nextLine();
				c1.add(new Customer(name,phone));
			} else if(userInput.equals("2")) {
				for(int j = 0; j<c1.size(); j++) {
					System.out.println(c1.get(j).name + "의 연락처 : " + c1.get(j));
				}
			} else if(userInput.equals("3")) {
				System.out.println("별점을 입력할 고객의 이름을 입력해주세요.");
				String 
			}
			
			
			
			
			else if(userInput.equals("quit")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
