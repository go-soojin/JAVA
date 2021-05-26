import com.kopo.Test;

public class ExecClass2 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		com.kopo.Test t1 = new Test();
		
//		try {
//			int b1 = Integer.parseInt("10a");
//			int a1= 10/0;
//		}catch(ArithmeticException e) {
//			System.out.println(11);
//		}catch(NumberFormatException e) {
//			System.out.println(22);
//		}catch(Exception e) {
//			System.out.println(33);
//			e.printStackTrace();
//		}
		
		try {
			t1.doAction(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
