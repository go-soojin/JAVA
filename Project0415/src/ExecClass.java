import java.util.Arrays;
import java.util.Random;

public class ExecClass {
	public static void main(String[] args) {
		Student[] class1 = {
			new Student("고수진"),
			new Student("김수진"),
			new Student("최수진"),
			new Student("박수진"),
			new Student("조수진"),
			new Student("이수진"),
			new Student("신수진"),
			new Student("임수진"),
			new Student("홍수진"),
			new Student("송수진")
		};
		Random random = new Random();
		int Sum = 0;
		float Avg = 0;
	
		for(int i = 0; i < class1.length; i++) {
			class1[i].middleScore = random.nextInt(1001);
			class1[i].finalScore = random.nextInt(1001);
			Sum += class1[i].middleScore + class1[i].finalScore;
			Avg = Sum  / (float)(2*class1.length);
		}
		System.out.println(Arrays.toString(class1));
		System.out.println("총합 : " + Sum );
		System.out.println("평균 : " + Math.round(Avg *10)/ (double)10);
	
		for(int i = 0; i < class1.length; i ++) {
			int rank = 1;
			for(int j = 0; j < class1.length; j ++) {
				if(class1[i].Sum <class1[j].Sum ) {
					rank++;
				}
			}
			System.out.println(class1[i].name + " 등수 : " + rank );
			rank = 1;
		}
	
	}
}
