
public class Team {
	String team;
	int salesTeam = 0;
	int devTeam = 0;
	int hrTeam = 0;
	
	Team(String team){
		this.team = team;
	}
	
	@Override
	public String toString() {
		String printString = this.team + "\n"
				+ "영업팀 인원 : " + this.salesTeam +"명\n"
				+ "개발팀 인원 : " + this.devTeam +"명\n"
				+ "인사팀 인원 : " + this.hrTeam +"명\n";
		return printString;
	}
	
}

