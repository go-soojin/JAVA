import java.util.Arrays;
import java.util.Random;

public class Exec3 {
	public static void main(String[] args) {
		int[] score = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		insertNumber(score); // score에 점수를 넣어줘
		int total = calcScore(score); // score의 총합을 구해줘
		System.out.println("총합 : " + total);
		
//		int[] score2 = new int[20];
//		insertNumber(score2);
//		System.out.println(Arrays.toString(score2));
	}
	
	public static void insertNumber(int[] s) {
		Random r1 = new Random();
		for (int i = 0; i < s.length; i++) {
			s[i] = r1.nextInt(101);
		}
		System.out.println(Arrays.toString(s)); // 확인
	}
	
	public static int calcScore(int[] s) {
		int total = 0;
		for (int i = 0; i < s.length; i++) {
			total = total + s[i];
		}
//		System.out.println("총합 : " + total);
		return total;
	}
}