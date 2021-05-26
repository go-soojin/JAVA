
public class TotalNum1 {
	public static void main(String[] args) {
		System.out.println(add(100));
	}
	
	public static int add (int n) {
		if (n >= 200) 
			return 200;
		
		return add(n+1)+n;

	}
}
