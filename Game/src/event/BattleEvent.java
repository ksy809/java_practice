package event;

import character.Monster;
import character.Player;
import static util.KoreanUtil.josa;

public class BattleEvent extends Event {

	@Override
	public String name() {
		return "전투";
	}

	@Override
	public void trigger(Player player) {
		Monster m = Monster.randomMonster();
		System.out.println("[전투발생] " + josa(m.getName(),"이","가") + " 나타났다!");

		while (!player.isDead() && !m.isDead()) {
			player.attack(m);
			if (m.isDead()) {
				break;
			}
			m.attack(player);
		}
		System.out.println(player.isDead() ? "[패배] 모험 실패..." : "[승리] 전투에서 승리했다!");

	}

}
