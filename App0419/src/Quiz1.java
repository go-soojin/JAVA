import java.io.FileInputStream;
import java.util.Scanner;

class Quiz1 {

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));

		int n, m, k, sum = 0;
		int[][] map;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n + 1][m + 1];

		int x1, y1, x2, y2 = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			sum = 0;
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			for (int a = x1; a <= x2; a++) {
				for (int b = y1; b <= y2; b++) {
					sum +=map[a][b];
				}
			}
			System.out.println(sum);
		}

	}
}
