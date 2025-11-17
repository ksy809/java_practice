package event;

import character.Player;

public class FoodEvent extends Event{

	@Override
	public String name() {
		return "먹거리 발견";
	}

	@Override
	public void trigger(Player player) {
		int heal = 50; //TODO 시간 남으면 랜덤으로 조정,,, 음식도 랜덤으로 나오게...
		int before = player.getCurrentHp();
		int after = player.healAndGet(heal);
		int recovered = after - before;

	    System.out.println("[먹거리] HP +" + recovered + " 회복! (HP " + before + " -> " + after + ")");

		if(recovered == 0) {
			// 풀피라서 hp가 회복이 안 됐을 경우
			System.out.println(player.getName() + "의 HP가 이미 최대라서 먹거리 효과가 적용되지 않았다!");
		}

	}

}
