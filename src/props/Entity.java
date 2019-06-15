package props;

import engine.HitBox;

/**
 * This class defines the characteristics of an Entity.
 * 
 * @author cidit
 *
 */
public abstract class Entity extends Prop {

	private Allegiance allegiance;

	public Entity(Allegiance allegiance, HitBox hitbox) {
		super(hitbox);
		this.allegiance = allegiance;
	}

	public Allegiance getAllegiance() {
		return allegiance;
	}

	/**
	 * All the allegiance an Entity can have.
	 * 
	 * @FRIENDLY Will not harm player and other friendlies. Will harm enemies.
	 * @HOSTILE Will harm player and friendlies. Will not harm enemies.
	 * @NEUTRAL Will not harm anyone unless attacked. In which case, it will defend
	 *          itself.
	 * @NONE Will harm everyone. Will focus on the entity dealing the most damage.
	 * @PASSIVE Will never harm anyone.
	 * 
	 * @author cidit
	 *
	 */
	public enum Allegiance {
		FRIENDLY, HOSTILE, NEUTRAL, NONE, PASSIVE;
	}
	
}