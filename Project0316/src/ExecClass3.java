
public class ExecClass3 {
	public static void main(String[] args) {
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 9; j++) {
//				int number1 = i + 1;
//				int number2 = j + 1;
//				int result = number1 * number2;
//
//				System.out.println("" + number1 + " X " + number2 + " = " + result);
//			}
//		}
//
		for (int i = 0; i < 9; i++) {
			int number1 = i + 1;
			System.out.println("\n\n" + number1 + "단");
			for (int j = 0; j < 9; j++) {
				int number2 = j + 1;
				int result = number1 * number2;
				System.out.println("" + number1 + " X " + number2 + " = " + result);
			}
		}

	}
}
