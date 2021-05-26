import java.util.Scanner;

public class ExecClass2 {
	public static void main(String[] args) {
		Scanner k1 = new Scanner(System.in);
		int korScore1 = k1.nextInt();
		Scanner e1 = new Scanner(System.in);
		int engScore1 = e1.nextInt();
		Scanner m1 = new Scanner(System.in);
		int mathScore1 = m1.nextInt();
		
		Scanner k2 = new Scanner(System.in);
		int korScore2 = k2.nextInt();
		Scanner e2 = new Scanner(System.in);
		int engScore2 = e2.nextInt();
		Scanner m2 = new Scanner(System.in);
		int mathScore2 = m2.nextInt();
		
		
		Exec2 s1 = new Exec2(k1, k2);
				
		Exec2 s2 = new Exec2(e1, e2);
	}
}
