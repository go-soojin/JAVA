import java.util.Arrays;

public class Quiz1 {
	public static void main(String[] args) {
		int arr[][] = { { 10, 33, 44 }, { 27, 5, 98 } };
		String name = "";
		int Sum = 0;
		double Avg = 0;
		
		System.out.println("  Name         Quiz1   Quiz2   Quiz3   Sum  Avg");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		for (int i = 0; i < arr.length; i++) {
			name = (i == 0) ? "Student1" : "Student2";
			System.out.print(" " + name + "     ");
			for (int j = 0; j < arr[i].length; j++) {
				int tempN = arr[i].length;
				System.out.print(arr[i][j] + "      ");
				if(j == tempN-1) {
					for(int k = 0; k < arr[i].length; k++) {
						Sum = Sum + arr[i][j];
					}
					Avg = (double)Sum / tempN;
					System.out.print(Sum + "   " + Avg);
				}
			}
			System.out.println();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.print("tot");
		int [] sum = new int[3];
		for(int i = 0; i <3; i++) {
			for(int j = 0; j < arr.length; j++) {
				sum[i] = sum[i] + arr[j][i];
			}
		}
		System.out.println("           "+sum[0]+ "     " + sum[1] + "     "+ sum[2]);
	}
}