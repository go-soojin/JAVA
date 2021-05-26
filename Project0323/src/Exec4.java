
public class Exec4 {
	int coins = 0; 
	public void deposit(int coin) {  // 돈을 넣음
		coins = coins + coin;
	}
	
	public void withdraw() {  // 모든 돈을 찾음 (현재는 실제 인출이 안되니까 화면에 출력하는 것으로 구현)
		System.out.println("모든 돈 : " + coins);
	}
}
