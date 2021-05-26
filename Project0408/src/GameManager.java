import java.util.Random;
import java.util.Scanner;

public class GameManager {
	public void play() {
		Player[] player = {new PlayerType1("매"),new PlayerType1("닭"),new PlayerType1("오리"),new PlayerType1("참새"),new PlayerType1("독수리")};
		Enemy[] enemy = {new EnemyType1("정어리"), new EnemyType1("참치"), new EnemyType1("광어"), new EnemyType1("우럭"), new EnemyType1("방어")};
		
		Random r = new Random();
		for (int i = 0; i < 999999; i++) {
			System.out.println("\n\n" + (i + 1) + "턴\n");
			// Player Turn
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				int attackTarget = r.nextInt(enemy.length);
				if (player[playerIndex].isLive() && enemy[attackTarget].isLive()) {
					player[playerIndex].attack(enemy[attackTarget]);
				}
			}
			// Enemy Turn
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				int attackTarget = r.nextInt(player.length);
				if (enemy[enemyIndex].isLive() && player[attackTarget].isLive()) {
					enemy[enemyIndex].attack(player[attackTarget]);			
		}
	}
			// 게임 종료 여부 확인
			boolean isPlayerLive = false;
			for(int playerIndex = 0; playerIndex < player.length; playerIndex ++) {
				if(player[playerIndex].isLive()) {
					isPlayerLive = true;
				}
			}
			boolean isEnemyLive = false;
			for(int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex ++) {
				if(enemy[enemyIndex].isLive()) {
					isEnemyLive = true;
				}
			}
			if(isPlayerLive && !isEnemyLive) {
				System.out.println("플레이어 승리");
				break;
			} else if (!isPlayerLive && isEnemyLive) {
				System.out.println("적 승리");
				break;
			}
			
			System.out.println("턴을 진행하시려면 엔터를 누르세요.");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
}
}