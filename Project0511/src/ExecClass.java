import java.util.ArrayList;
import java.util.Collections;

public class ExecClass {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student ("가수진", 100));
		student.add(new Student ("나수진", 95));
		student.add(new Student ("다수진", 90));
		student.add(new Student ("라수진", 85));
		student.add(new Student ("마수진", 80));
		student.add(new Student ("바수진", 75));
		student.add(new Student ("사수진", 70));
		student.add(new Student ("아수진", 65));
		student.add(new Student ("자수진", 60));
		student.add(new Student ("차수진", 55));
		
		Collections.sort(student);
		
		for(int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i).name + " : " + student.get(i).score + "\n");
		}
	}
}
