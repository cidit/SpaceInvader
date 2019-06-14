package entities.props.projectiles;

import engine.HitBox;
import entities.Actor;
import entities.props.Projectile;

public final class EMP extends Projectile {

	public EMP(Allegiance allegiance, HitBox hitbox, float damageModifier) {
		super(allegiance, hitbox, 20, 200, damageModifier);
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
 * medium damage
 * low fire rate
 * slows down / freezes entities in blast radius
 */