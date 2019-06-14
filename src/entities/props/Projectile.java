package entities.props;

import engine.HitBox;
import entities.Actor;
import entities.Prop;

public abstract class Projectile extends Prop {

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
