package props.entities.actors;

import engine.HitBox;
import props.entities.Actor;

public abstract class Enemy extends Actor {

	public Enemy(HitBox hitbox, int max_health) {
		super(Allegiance.HOSTILE, hitbox, max_health);
		// TODO Auto-generated constructor stub
	}

}
