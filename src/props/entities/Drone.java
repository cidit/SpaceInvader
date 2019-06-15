package props.entities;

import engine.phys.HitBox;
import props.Entity;

public abstract class Drone extends Entity {

	public Drone(Allegiance allegiance, HitBox hitbox) {
		super(allegiance, hitbox);
		
	}

}
