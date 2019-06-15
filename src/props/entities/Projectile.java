package props.entities;

import engine.HitBox;
import props.Entity;

public abstract class Projectile extends Entity {

	protected int baseDamage;
	protected int fireRate;
	protected float damageModifier;
	
	public Projectile(Allegiance allegiance, HitBox hitbox, int baseDamage, int fireRate, float damageModifier) {
		super(allegiance, hitbox);
		this.baseDamage = baseDamage;
		this.fireRate = fireRate;
		this.damageModifier = damageModifier;
	}

	public abstract void impact(Actor[] targets);
	
}
