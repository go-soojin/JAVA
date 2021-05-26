
public class Student implements Comparable<Student> {
	String name;
	int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) { // 내가 비교할 다른 객체
		if(this.score < o.score) {
			return -1;
		}else if(this.score > o.score) {
			return 1;
		}
		return 0;
	}
}

