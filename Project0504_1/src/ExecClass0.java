import java.util.ArrayList;
import java.util.Scanner;

public class ExecClass0 {
	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<Employee>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 999; i++) {
			System.out.println("원하시는 메뉴를 선택하세요.");
			System.out.println("1: 직원 정보 입력");
			System.out.println("2: 부서별 인원 확인(출력)");
			System.out.println("exit: 종료");

			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				// 직원 정보 입력
				System.out.println("직원의 이름을 입력해주세요.");
				String name = scanner.nextLine();
				System.out.println("직원의 부서를 입력해주세요.");
				String team = scanner.nextLine();
				System.out.println("직원의 직위를 입력해주세요.");
				String position = scanner.nextLine();
				System.out.println("직원의 담당업무를 입력해주세요.");
				String duty = scanner.nextLine();
				employee.add(new Employee());
			} else if (userInput.equals("2")) {
//				System.out.println("전체 직원 수 : " + employee.size());
				System.out.println("확인하고자하는 부서명을 입력해주세요.");
				String inputTeam = scanner.nextLine();
				
				int teamNumber = 0;
				Team salesTeam = new Team("영업팀");
				Team devTeam = new Team("개발팀");
				Team hrTeam = new Team("인사팀");
			
				for(int k = 0; k < employee.size(); k++) {
					if(inputTeam.equals("영업팀")) {					
						salesTeam.teamNumber++;
						
					}
				}
				
				
				
//				for (int j = 0; j < employee.size(); j++) {
//					System.out.println(employee.get(j).name + ", 부서 : " + employee.get(j).team + ", 직위 : "
//							+ employee.get(j).position + ", 담당업무 : " + employee.get(j).duty);
//				}
			} else if (userInput.equals("exit")) {
				break;
			}

		}
	}
}
