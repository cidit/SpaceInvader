package props.entities;

import engine.phys.HitBox;
import props.Entity;

public abstract class Drone extends Entity {
	
	protected Actor owner;

	public Drone(HitBox hitbox, Actor owner) {
		super(owner.getAllegiance(), hitbox);
		this.owner = owner;
	}

}
