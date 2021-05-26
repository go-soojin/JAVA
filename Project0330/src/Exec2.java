import java.util.Scanner;

public class Exec2 {

	public int totalkorScore = ;
	public int totalengScore = 0;
	public int totalmathScore = 0;

	
	Exec2(int korScore, int engScore, int mathScore){
	this.totalkorScore = korScore;
	this.totalengScore = engScore;
	this.totalmathScore = mathScore;
	
	}	
	public Exec2(Scanner e1, Scanner e2) {
		// TODO Auto-generated constructor stub
	}
	public void printInfo() {
		System.out.println("국어 총점 : " + totalkorScore
			+ "영어 총점 : " + totalengScore 
			+ "수학 총점 : " + totalmathScore);
	}
	
}
