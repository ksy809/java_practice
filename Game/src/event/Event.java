package event;

import character.Player;

public abstract class Event {
	public abstract String name();
	public abstract void trigger(Player player);
}
