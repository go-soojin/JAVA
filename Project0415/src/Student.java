
public class Student {
	String name;
	int middleScore;
	int finalScore;
	int Sum;
	double Avg;
	
	Student(){
		
	}
	
	Student(String name){
		this.name = name;
		
	}
	
	Student(String name, int middleScore, int finalScore){
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
	}
	public void Sum () {
		this.Sum = this.middleScore+ this.finalScore;
		this.Avg = this.Sum/(double)2;
	}
	
	
	@Override
	public String toString(){
		return"" + this.name
				+" (" + this.middleScore + ", "
				+ this.finalScore + ")";
	}

}
