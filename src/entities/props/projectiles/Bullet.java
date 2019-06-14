package entities.props.projectiles;

import engine.HitBox;
import entities.Actor;
import entities.props.Projectile;

public final class Bullet extends Projectile {

	public Bullet(Allegiance allegiance, HitBox hitbox, float damageModifier) {
		super(allegiance, hitbox, 30, 75, damageModifier);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void impact(Actor[] targets) {
		for (Actor target : targets) {
			int damage = (int) (baseDamage * damageModifier);
			target.getDamaged(damage);
		}
	}

}
/*
 * medium/fast fire rate
 * large variety of caliber with different effects
 */
