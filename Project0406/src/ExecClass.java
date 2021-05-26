import java.util.Arrays;

public class ExecClass {
	public static void main(String[] args) {
//		Student s1 = new Student("홍길동", "서울시 마포구", "010-0000-0000",30); // property
//		Student s2 = new Student("둘리", "부산시 동구", "010-2222-2222",50); // property
		
		
		Student[] s = {new Student("홍길동", "서울시 마포구", "010-0000-0000",30)
				, new Student("둘리", "부산시 동구", "010-2222-2222",50)};
		System.out.println(Arrays.toString(s)); // s1 출력
	}
}

