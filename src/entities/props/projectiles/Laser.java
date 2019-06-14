package entities.props.projectiles;

import engine.HitBox;
import entities.Actor;
import entities.props.Projectile;

public final class Laser extends Projectile {

	public Laser(Allegiance allegiance, HitBox hitbox, float damageModifier) {
		super(allegiance, hitbox, 4, 1, damageModifier);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void impact(Actor[] targets) {
		for (Actor target : targets) {
			// TODO has to figure out how to do effects first
		}
	}

}
/*
 * continuous fire
 * exponential damage in correlation with exposure
 */
