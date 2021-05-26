
public class Student {
	String name;
	int middleScore;
	int finalScore;
	int totalScore;
	double Avg;
	int rank;
	
	Student(String name){
		this.name = name;
	}
	
	Student(String name, int middleScore, int finalScore){
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
	}
	
	public void sumScore() {
		this.totalScore = this.middleScore + this.finalScore;
		this.Avg = this.totalScore/(double)2;
	}
	
	@Override
	public String toString() {
		return "" + this.name + " (" + this.middleScore + ", "
				+this.finalScore + ")";
	}
	
	
}
