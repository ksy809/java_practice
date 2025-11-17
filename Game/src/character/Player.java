package character;

import item.Equipment;
import item.Equipments;
import static util.KoreanUtil.josa;

public class Player extends Character{
	private final Equipments equipments = new Equipments();
	public Player(String name, int hp, int atk, int def) {
		super(name, hp, atk, def);
	}

	@Override
	public void attack(Character target) {
        int damage = atk;
        for (Equipment eq : equipments.findAll()) {
            damage = eq.calAttackWeight(damage); // 장비별로 증폭
        }
        
        System.out.println(josa(name,"이 ","가 ") + josa(target.getName(),"을","를") + " 공격! (" + damage + " 데미지)");

        target.takeDamage(damage);
    		
	}
	
	@Override
	public void takeDamage(int damage) {
		 // 들어온 damage를 장비 방어 가중치로 감소
        int finalDamage = damage;
        for (Equipment eq : equipments.findAll()) {
            finalDamage = eq.calDefenceWeight(finalDamage);
        }
        finalDamage = Math.max(0, finalDamage - def); // 기본 방어력도 반영
        currentHp = Math.max(0, currentHp - finalDamage);
        System.out.println(josa(name, "이", "가") + " " 
                + finalDamage + " 데미지를 받음. (남은 HP: " + currentHp + ")");
   		
	}


	public void equip(Equipment eq) {
		 equipments.equip(eq);
	        System.out.println("[장비장착] " + josa(eq.getName(),"을","를") +" 장착했다!");
	    		
	}

	public int healAndGet(int amount) {
		currentHp = Math.min(hp, currentHp + amount);
	    return currentHp;
	}

}
