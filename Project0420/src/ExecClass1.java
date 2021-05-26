import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExecClass1 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		ArrayList<Customer> c1 = new ArrayList<Customer>();
		ArrayList<Score> score = new ArrayList<Score>();
		for (int i = 0; i < 999; i++) {
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1 : 방문자 입력");
			System.out.println("2 : 전체 방문자 출력");
			System.out.println("3 : 별점 입력");
			System.out.println("4 : 전체 별점 출력");
			System.out.println("Quit : 종료");

			String userInput = s1.nextLine();
			if (userInput.equals("1")) {
				System.out.println("이름을 입력해주세요.");
				String name = s1.nextLine();
				System.out.println("번호를 입력해주세요.");
				String phoneNo = s1.nextLine();
				c1.add(new Customer(name, phoneNo));
			} else if (userInput.equals("2")) {
				for (int j = 0; j < c1.size(); j++) {
					System.out.println(c1.get(j).name + "의 연락처 : " + c1.get(j).phoneNo);
				}
			} else if (userInput.equals("3")) {
				System.out.println("별점 입력할 고객의 이름을 입력해주세요.");
				String name2 = s1.nextLine();
				String userName = "";
				String userPhone = "";
				for (int j = 0; j < c1.size(); j++) {
					if (c1.get(j).name.equals(name2)) {
						userName = c1.get(j).name;
						userPhone = c1.get(j).phoneNo;
					}
				}
				if (userName.equals("")) {
					System.out.println("입력한 고객이 없습니다.");
				}else {
					System.out.println("별점을 입력해주세요. (1~5)");
					String scoreString = s1.nextLine();
					try {
						int scoreNumber = Integer.parseInt(scoreString);
						score.add(new Score(userName, userPhone, scoreNumber));
					}catch(Exception e) {
						
					}
				}
			}else if(userInput.equals("4")) {
				for (int j = 0; j < score.size(); j++) {
					System.out.println(score.get(j).name + "의 별점 : " + score.get(j).score);
				}
			}

			else if (userInput.equals("Quit")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}
	}
}