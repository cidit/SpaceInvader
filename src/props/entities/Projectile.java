package props.entities;

import engine.phys.HitBox;
import props.Entity;

public abstract class Projectile extends Entity {
	
	public Projectile(Allegiance allegiance, HitBox hitbox) {
		super(allegiance, hitbox);
	}
	
}
