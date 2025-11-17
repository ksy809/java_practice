package item.code;

import item.Equipment;
import item.Slot;

public enum EquipmentData {
	BASIC_WEAPON("ÁÖ¸Ô",1,1,Slot.WEAPON,"ÁÖ¸ÔÀ» ÈÖµÎ¸¨´Ï´Ù."),
	WOOD_SWORD("¸ñ°Ë",10,1,Slot.WEAPON,"¸ñ°ËÀ» ÈÖµÎ¸¨´Ï´Ù."),
	WOOD_AXE("³ª¹«µµ³¢",10,1,Slot.WEAPON,"³ª¹«µµ³¢¸¦ ÈÖµÎ¸¨´Ï´Ù."),
	KATANA("Ä«Å¸³ª",30,1,Slot.WEAPON,"½­- Ä«Å¸³ª¸¦ ÈÖµÎ·ì´Ï´Ù."),
	
	WOOD_ARMOR("³ª¹«°©¿Ê",1,10,Slot.ARMOR,""),
	WOOD_BOOTS("³ª¹«ºÎÃ÷",1,10,Slot.BOOTS,""),
	STON_ARMOR("µ¹°©¿Ê",1,20,Slot.ARMOR,"");
	
	private String name;
	private int atk;
	private int def;
	private Slot slot;
	private String effect;
	
	private EquipmentData(String name, int atk, int def, Slot slot, String effect) {
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.slot = slot;
		this.effect = effect;
	}
	
	public Equipment create() {
		return new Equipment(name, atk, def, slot, effect);
	}

}
