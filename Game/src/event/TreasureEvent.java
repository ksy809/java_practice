package event;

import character.Player;
import item.Equipment;
import static util.KoreanUtil.josa;

import java.util.Scanner;

public class TreasureEvent extends Event{
	@Override
	public String name() {
		return "보물 상자";
	}

	@Override
	public void trigger(Player player) {
		Equipment eq = Equipment.random();
		Scanner sc = new Scanner(System.in);
		System.out.print("[보물상자] " + josa(eq.getName(),"을","를")+" 발견했다! 착용할까?(y/n) >> ");
		String input = sc.nextLine().trim().toLowerCase();
		
		if(input.equals("y")) {
			player.equip(eq);
		} else {
			System.out.println(josa(eq.getName(),"을","를") + " 그냥 두고 지나쳤다...");
		}
		
	}
}
