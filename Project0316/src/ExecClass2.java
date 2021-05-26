
public class ExecClass2 {
	public static void main(String[] args) {
		int total = 0;           // 총합 변수
		int evenTotal = 0;       // 짝수합 변수
		int oddTotal = 0;		// 홀수합 변수
		for (int i = 0; i < 100; i++) {
			int number = i + 1;

			total = total + number;
			
 
		if(number %2 == 0 ) {
			evenTotal = evenTotal + number;
		} else {
			oddTotal = oddTotal + number;
		}
	}	
	System.out.println("1부터 100까지의 합은 " + total);
	System.out.println("1부터 100까지의 짝수 합은 " + evenTotal);
	System.out.println("1부터 100까지의 홀수 합은 " + oddTotal);
	}
}
