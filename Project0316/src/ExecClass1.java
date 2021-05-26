
public class ExecClass1 {
	public static void main(String[] args) {
//		int number1 = 8;
//		for (int i = 0; i < 9; i++) {
//			int number2 = i + 1;
//			int resultNumber = number1 * number2;
//			System.out.println("" + number1 + " X " + number2 + " = " + resultNumber);
//		}

//		int i =0;
//		while (i < 9) {
//			int number2 = i +1;
//			int resultNumber = number1 * number2;
//			System.out.println(""+ number1 + " X "+ number2 + " = " + resultNumber);
//		
//			i++;
//		}

		for (int i = 0; i < 10; i++) {
			 int number = i + 1;
			
			 if (number %2 == 1) {
				 continue;
			 } 
			 if (number == 10) {
				 break;
			 }
			 System.out.println(number);
		}
	}
}



