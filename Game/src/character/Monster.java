package character;

import java.util.Random;
import static util.KoreanUtil.josa;

public class Monster extends Character{
	public Monster(String name, int hp, int atk, int def) {
		super(name, hp, atk, def);
	}
	
	@Override
	public void attack(Character target) {
		int damage = atk;
		System.out.println(josa(name,"이 ","가 ") + josa(target.getName(),"을 ","를 ") + "공격했다!" + "(" + damage + " 데미지)");
		target.takeDamage(atk);
	}
	
	@Override
	public void takeDamage(int damage) {
	    currentHp = Math.max(0, currentHp - damage);
	    System.out.println(josa(name, "이", "가") + " " 
	        + damage + " 데미지를 입었다! (남은 HP: " + currentHp + ")");
	}
	
	public static Monster randomMonster() {
		String[] names = {"슬라임","고블린","늑대"};
		int[] hps = {200,250,300};
		int[] atks = {20,25,30};
		int[] defs = {10,10,10};
		
		Random r = new Random();
		int idx = r.nextInt(names.length);
		return new Monster(names[idx], hps[idx], atks[idx], defs[idx]);
	}

}
