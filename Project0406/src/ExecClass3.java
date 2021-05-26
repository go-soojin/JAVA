import java.util.Arrays;

public class ExecClass3 {
	public static void main(String[] args) {
		StudentScore1[] student = { new StudentScore1("고수진", 95, 80), new StudentScore1("김은혜", 100, 90),
				new StudentScore1("이혜진", 90, 95), new StudentScore1("RM", 70, 90), new StudentScore1("진", 60, 75),
				new StudentScore1("슈가", 95, 80), new StudentScore1("제이홉", 50, 75), new StudentScore1("지민", 65, 100),
				new StudentScore1("뷔", 100, 100), new StudentScore1("정국", 85, 75) };

		int totalmidScore = 0;
		int totalfinalScore = 0;
		int total = 0;
		for (int i = 0; i < student.length; i++) {
			totalmidScore = totalmidScore + student[i].midScore;
			totalfinalScore = totalfinalScore + student[i].finalScore;
			total = total + student[i].total;			
		}
		
		double avgmidScore = (double)totalmidScore / student.length;
		double avgfinalScore = (double)totalfinalScore / student.length;
		double average = (double)total / student.length;
		
		System.out.println("중간고사 총점 : " + totalmidScore + ", 중간고사 평균 : " + avgmidScore);
		System.out.println("기말고사 총점 : " + totalfinalScore + ", 기말고사 평균 : " + avgfinalScore);
		System.out.println("전체 총점 : " + total + ", 전체 평균 : " + average);
		
		for(int i = 0; i < student.length; i++) {
			for(int j = i + 1; j < student.length; j++) {
				if(student[i].total < student[j].total) {
					StudentScore1 temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(student));
	}
}
