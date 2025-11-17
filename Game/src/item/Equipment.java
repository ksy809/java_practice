package item;

import java.util.Random;

import item.code.EquipmentData;

public class Equipment {
	private String name;
	private int atk;
	private int def;
	private Slot slot;
	private String effect;
	private Random random = new Random();

	public Equipment(String name, int atk, int def, Slot slot, String effect) {
		super();
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.slot = slot;
		this.effect = effect;
	}

	public int calAttackWeight(int damage) {
		int min = damage + atk;
		int max = damage + atk *2;
		return random.nextInt(max - min +1)+min;
	}

	public int calDefenceWeight(int damage) {
		return damage - (damage * def / 100);
	}

	public Slot getSlot() {
		return this.slot;
	}

	public String getEffect() {
		return effect;
	}

	public String getName() {
		return name;
	}

	public static Equipment random() {
		EquipmentData[] values = EquipmentData.values();
		Random random = new Random();
		int idx = random.nextInt(values.length);
		return values[idx].create();
	}

}
