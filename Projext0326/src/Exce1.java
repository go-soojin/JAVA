import java.util.Scanner;

public class Exce1 {
	public static void main(String[] args) {
		Exec2 Kaup = new Exec2();
		for (int i = 0; i < 9999; i++) {
			System.out.println("체중을 kg 단위로 입력해주세요.");
			Scanner s1 = new Scanner(System.in);
			int userNum1 = s1.nextInt();
			
			System.out.println("신장을 m 단위로 입력해주세요.");
			Scanner s2 = new Scanner(System.in);
			int userNum2 = s2.nextInt();
			
			double result = (double) userNum1 / userNum2 * userNum2;
						
			if (result >=30) {
				System.out.println("비만");
			} else if (result <=29  & result >24) {
				System.out.println("과체중");
			} else if (result <=24  & result >=20) {
				System.out.println("정상");
			} else if (result < 20) {
				System.out.println("저체중");
			}else if (result <=15  & result >13) {
				System.out.println("여윔");
			}else if (result <=13  & result >=10) {
				System.out.println("영양 실조증");
			}else if(result <10); {
				System.out.println("이하는 소모증");
			}
		}
	}
}
