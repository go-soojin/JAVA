import java.net.FileNameMap;
import java.util.Scanner;

public class ExecClass3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Exec3[] student = new Exec3[5];
		for(int i = 0; i <5; i++) {
		System.out.println("이름을 입력해주세요.");
		String name = scanner.nextLine();
		
		System.out.println("국어 점수를 입력해주세요.");
		String inputString = scanner.nextLine();
		int korScore = Integer.parseInt(inputString);
				
		System.out.println("영어 점수를 입력해주세요.");
		inputString = scanner.nextLine();
		int engScore = Integer.parseInt(inputString);
		
		System.out.println("수학 점수를 입력해주세요.");
		inputString = scanner.nextLine();
		int mathScore = Integer.parseInt(inputString);
		
		student[i] = new Exec3(name, korScore, engScore, mathScore);
		
		}
		
		int totalKorScore = 0;
		int totalEngScore = 0;
		int totalMathScore = 0;
		for(int i = 0; i <5; i++) {
			totalKorScore = totalKorScore + student[i].korScore;
			totalEngScore = totalEngScore + student[i].engScore;
			totalMathScore = totalMathScore + student[i].mathScore;
		}
		System.out.println("국어 총합 : " + totalKorScore);
		System.out.println("수학 총합 : " + totalEngScore);
		System.out.println("영어 총합 : " + totalMathScore);
	}
}
