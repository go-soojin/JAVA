import java.util.Scanner;

public class ExecClass5 {
	public static void main(String[] args) {
		System.out.println("숫자(정수)를 입력해주세요.");
		
		Scanner s1 = new Scanner(System.in);
		int userNumber = s1.nextInt();
		
		System.out.println("입력받은 숫자는 " + userNumber + "입니다.");
		
		boolean isPrime = true;
		// 소수의 특징 나와 1밖에 없다. 10
		// 소수를 찾기위한 로직을찍
		// 소수의 조건은 사용자가 입력한 데이터 기준 
		// 2~사용자 입력값-1 까지 나누기연산 시 나머지가 0이 발생하지 않아야 한다.
		for(int i = 0; i < userNumber; i++) {
			if (i < 2) {
				continue;
			}
			if (userNumber % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("소수입니다.");
			
		}
		
	}
}
