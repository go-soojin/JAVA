import java.util.Arrays;
import java.util.Random;

public class selectionSort {
	public static void main(String[] args) {
		int[] array = new int[20];
		Random r1 = new Random();
	
		for (int i = 0; i < array.length; i++) {
			array[i] = r1.nextInt(1001);
		}
		int tmp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
