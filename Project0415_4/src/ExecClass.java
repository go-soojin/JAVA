import java.util.Arrays;
import java.util.Random;

public class ExecClass {
	public static void main(String[] args) {
		Student[] class1 = { new Student("가수진"), new Student("나수진"), new Student("다수진"), new Student("라수진"),
				new Student("마수진"), new Student("바수진"), new Student("사수진"), new Student("아수진"), new Student("자수진"),
				new Student("차수진") };
		// 점수 입력받기
		Random r = new Random();
		for (int i = 0; i < class1.length; i++) {
			class1[i].middleScore = r.nextInt(101);
			class1[i].finalScore = r.nextInt(101);
		}
		System.out.println(Arrays.toString(class1));

		// 계산
		for (int i = 0; i < class1.length; i++) {
			class1[i].sumScore();
		}

		// 점수 합산
		int TotalMiddle = 0;
		int TotalFinal = 0;
		int totalScore = 0;
		double Avg = 0;
		for (int i = 0; i < class1.length; i++) {
			totalScore = totalScore + class1[i].totalScore;
			TotalMiddle = TotalMiddle + class1[i].middleScore;
			TotalFinal = TotalFinal + class1[i].finalScore;
			
		}
		Avg = (double) totalScore / class1.length;

		// 성적순으로 정렬
		for (int i = 0; i < class1.length -1; i++) {
			for (int j = i; j < class1.length; j++) {
				if (class1[i].totalScore < class1[j].totalScore) {
					Student temp = class1[i];
					class1[i] = class1[j];
					class1[j] = temp;
				}
			}
		}
		// 순위 세팅
		for (int i = 0; i < class1.length; i++) {
			if (i > 1 && class1[i - 1].totalScore == class1[i].totalScore) {
				class1[i].rank = class1[i - 1].rank;
			} else {
				class1[i].rank = i + 1;
			}
		}
		// 출력
		for (int i = 0; i < class1.length; i++) {
			System.out.println(class1[i].name + " 총점 : " + class1[i].totalScore 
					+ " (" + class1[i].rank + ")");
		}

	}
}
