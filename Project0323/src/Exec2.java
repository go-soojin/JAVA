import java.util.Random;

public class Exec2 {
	public static int testMethod(int number1, int number2) { // 형태 암기
		
		int resultNumber = number1 + number2;
		System.out.println("" + number1 + " + " + number2 + " = " + resultNumber);
		return resultNumber;
	}
	
	public static void testMethod2(int number1, int number2) {
		int resultNumber = number1 - number2;
		System.out.println("" + number1 + " - " + number2 + " = " + resultNumber);
	}

	public static void main(String[] args) {
		Random r1 = new Random();
		
		int number1 = r1.nextInt(100);
		int number2 = r1.nextInt(100);
		
		int result = testMethod(number1, number2);
		testMethod2(number1, number2);
	}
}
