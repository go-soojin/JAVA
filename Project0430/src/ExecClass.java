import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 단어를 reverse 하시오. ex) apple -> elppa 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String userInput = scanner.nextLine();
		
		StringBuffer c = new StringBuffer(userInput);
		c.reverse();
		
		String d = c.toString();
		System.out.println(d);
	}
}
