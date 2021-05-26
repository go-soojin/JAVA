
public class StudentScore {
	String name;
	int midterm;
	int finalexam;
	int totalScore;
	
	StudentScore(String name, int midterm, int finalexam){
		this.name = name;
		this.midterm = midterm;
		this.finalexam = finalexam;
		this.sumScore();		
	}

	public void sumScore() {
		this.totalScore = this.midterm + this.finalexam;
	}

	public String toString() {
		return this.name + " : " + this.totalScore;
	}
}
