package props.entities;

import engine.geom.Vector;
import engine.phys.HitBox;
import props.Entity;

public abstract class Projectile extends Entity {

	private int damage;

	public Projectile(Allegiance allegiance, HitBox hitbox, Vector movement, int damage) {
		super(allegiance, hitbox);
		this.movement.add(movement);
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

}
