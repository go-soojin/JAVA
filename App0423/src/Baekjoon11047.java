import java.io.FileInputStream;
import java.util.Scanner;

public class Baekjoon11047 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/coin1.txt"));
		Scanner sc = new Scanner(System.in);
		

		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		int []arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = N-1; i >=0; i-- ) {
			if(M >= arr[i]) {
				count += M/arr[i];
				M = M%arr[i];
			}
		}
		System.out.println(count);
	}
}
