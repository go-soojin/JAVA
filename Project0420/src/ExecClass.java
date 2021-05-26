import java.util.ArrayList;

public class ExecClass {
	public static void main(String[] args) {
		Student[] s1 = {new Student ("홍길동", 500), new Student("둘리",300), new Student("또치", 200)};
		
		Student[] s2 = new Student[3];
		s2[0] = new Student("도우너", 300);
		s2[1] = new Student("마이클", 100);
		s2[2] = new Student("희동이", 50);
		
		ArrayList<Student> s3 = new ArrayList<Student>();
		s3.add(new Student("이순신", 900));
		s3.add(new Student("이성계", 400));
		
		s3.get(0).name = "김구";  // s2[0]
		s3.get(1).middleScore = 500;  
		
		for(int i = 0; i <s3.size(); i++) {
			System.out.println(s3.get(i).name + "의 중간고사 점수 : " + s3.get(i).middleScore);
		}
	}
}
