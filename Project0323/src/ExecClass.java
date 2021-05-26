
public class ExecClass {
	public static void main(String[] args) {
		Exec4 box1 = new Exec4();
		Exec4 box2 = new Exec4();
		
		box1.deposit(100);
		box1.deposit(100);
		box2.deposit(200);
		box2.deposit(500);
		box1.withdraw();
		box2.withdraw();
	}
}
