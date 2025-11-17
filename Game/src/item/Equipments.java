package item;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import item.code.EquipmentData;

public class Equipments {
private final Map<Slot, Equipment> equipments;
	
	public Equipments() {
		equipments = new HashMap<Slot, Equipment>();
		equipments.put(Slot.WEAPON, EquipmentData.BASIC_WEAPON.create());
	}
	
	public void equip(Equipment equipment) {
		equipments.put(equipment.getSlot(), equipment);
	}
	
	public void unEquip(Slot slot) {
		if(slot.equals(Slot.WEAPON)) {
			equipments.put(Slot.WEAPON, EquipmentData.BASIC_WEAPON.create());
			return; // 무기는 기본 무기로 교체하고 제거하지 않음
		}
		equipments.remove(slot);
	}
	
	public Collection<Equipment> findAll(){
		return equipments.values();
	}
	
	public Optional<Equipment> findBySlot(Slot slot) {
		return Optional.of(equipments.get(slot));
	}

}
