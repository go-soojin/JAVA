import java.util.Arrays;

public class ExecClass2 {
	public static void main(String[] args) {

		StudentScore [] s = {new StudentScore ("고수진", 95, 80), new StudentScore("김은혜", 100, 90),
							new StudentScore("이혜진", 90, 95), new StudentScore("RM", 70, 90),
							new StudentScore("진", 60, 75), new StudentScore("슈가", 95, 80),
							new StudentScore("제이홉", 50, 75), new StudentScore("지민", 65, 100),
							new StudentScore("뷔", 100, 100), new StudentScore("정국", 85, 75)};
		
		int totalMiddleScore = 0;
		int totalFinalScore = 0;
		int totalScore = 0;
		for(int i = 0; i < s.length;i++) {
			totalMiddleScore = totalMiddleScore + s[i].midterm;
			totalFinalScore = totalFinalScore + s[i].finalexam;
			totalScore = totalScore + s[i].totalScore;
		}
		
		double avgMiddleScore = (double)totalMiddleScore / s.length;
		double avgFinalScore = (double)totalFinalScore / s.length;
		double avgTotalScore = (double)totalScore / s.length;
		
		System.out.println("중간고사 총점 : " + totalMiddleScore + ", 중간고사 평균 : " + avgMiddleScore);
		System.out.println("기말고사 총점 : " + totalFinalScore + ", 기말고사 평균 : " + avgFinalScore);
		System.out.println("전체 총점 : " + totalScore + ", 전체 평균 : " + avgTotalScore);
		
		for(int i = 0; i < s.length; i++) {
			for(int j = i + 1; j < s.length; j++) {
				if (s[i].totalScore < s[j].totalScore) {
					StudentScore temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}
}
