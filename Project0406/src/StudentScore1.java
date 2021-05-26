
public class StudentScore1 {
	String name;
	int midScore;
	int finalScore;
	int total;
	double average;

	StudentScore1 (String name, int midScore, int finalScore){
		this.name=name;
		this.midScore= midScore;
		this.finalScore = finalScore;
		this.total = midScore + finalScore;
		this.average = total / (double)2;
	}
	
	public String toString() {
		return  this.name + "총점 : " + this.total + ", 평균 : " + this.average;
	}
}	
