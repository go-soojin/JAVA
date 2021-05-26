import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = 1000- N;
		int count = 0;
		int[] arr = { 500, 100, 50, 10, 5, 1 };

		for (int i = 0; i <arr.length; i++) {
			if(1000-N >= arr[i]) {
				count += M/arr[i];
				M = M%arr[i];
			}
		}
		System.out.println(count);
	}
}
