package entities.props;

import engine.HitBox;
import entities.Prop;

public abstract class Drone extends Prop {

	public Drone(HitBox hitbox) {
		super(Allegiance.FRIENDLY, hitbox);
		
	}

}
