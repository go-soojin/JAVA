import java.io.FileInputStream;
import java.util.Scanner;

public class Quiz1_1 {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		
		int n, m, k, sum = 0;
		int[][] map ;
		Scanner scanner = new Scanner(System.in);
		
		n=scanner.nextInt();
		m=scanner.nextInt();
		map = new int[n+1][m+1];
		
		int x1, y1, x2, y2 = 0;
		for(int i = 1; i <=n; i++) {
			for(int j = 1; j <= m; j++) {
				map[i][j] = scanner.nextInt();
			}
		}
		k=scanner.nextInt();
		for(int i = 0; i < k; i++) {
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
			for(int a = x1; a <=x2; a++) {
				for(int b= y1; b<=y2; b++) {
					sum += map[a][b];
				}
			}
			System.out.println(sum);
		}
	}	
}
