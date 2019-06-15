package props.entities.actors;

import engine.HitBox;
import props.entities.Actor;

public abstract class PlayableCharacter extends Actor {

	public PlayableCharacter(HitBox hitbox, int max_health) {
		super(Allegiance.FRIENDLY, hitbox, max_health);
		// TODO Auto-generated constructor stub
	}

}
