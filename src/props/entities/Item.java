package props.entities;

import engine.phys.HitBox;
import props.Entity;
import props.entities.actors.Player;

public abstract class Item extends Entity {

	public Item(HitBox hitbox) {
		super(Allegiance.PASSIVE, hitbox);
	}

	public abstract void onPickup(Player p);
}
