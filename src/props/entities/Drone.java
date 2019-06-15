package props.entities;

import engine.phys.HitBox;
import props.Entity;

public abstract class Drone extends Entity {
	
	protected Actor owner;

	public Drone(Allegiance allegiance, HitBox hitbox, Actor owner) {
		super(allegiance, hitbox);
		this.owner = owner;
	}

}
