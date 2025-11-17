import java.util.Random;
import java.util.Scanner;

import character.Player;
import event.BattleEvent;
import event.Event;
import event.FoodEvent;
import event.TreasureEvent;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("플레이어 닉네임을 입력하세요 >> ");
		String name = sc.nextLine().trim();
		if(name.isEmpty()) {
			name ="용사";
		}

		Player player = new Player(name, 300, 30, 10);

		System.out.println("=== 모험 시작 ===");
		for (int day = 1; day <= 8; day++) {
		    System.out.println("\n[Day " + day + "]");

		    Event event;
		    if (day == 8) {
		        event = new BattleEvent(); // 8일차는 무조건 전투
		    } else {
		        int pick = r.nextInt(3);
		        switch (pick) {
		            case 0:
		                event = new TreasureEvent();
		                break;
		            case 1:
		                event = new FoodEvent();
		                break;
		            default:
		                event = new BattleEvent();
		                break;
		        }
		    }

		    System.out.println("이벤트: " + event.name());
		    event.trigger(player);

		    if (player.isDead()) {
		        System.out.println("모험이 여기서 끝났습니다.");
		        return;
		    }

		    if (day < 8) {  
		        System.out.println("\n엔터를 누르면 다음 날로 진행합니다...");
		        sc.nextLine(); // 엔터 입력 대기
		    }
		}

		System.out.println("\n=== 8일 모험 종료! 생존 성공! ===");

		sc.close();
	}
}
