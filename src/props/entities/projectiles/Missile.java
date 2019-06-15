package props.entities.projectiles;

import engine.Coordinate;
import engine.HitBox;
import props.entities.Actor;
import props.entities.Projectile;

public final class Missile extends Projectile {

	private final static int BLAST_RADIUS = 50; // TODO stub value

	public Missile(Allegiance allegiance, HitBox hitbox, float damageModifier) {
		super(allegiance, hitbox, 100, 200, damageModifier);
	}

	@Override
	public void impact(Actor[] targets) {
		for (Actor target : targets) {
			float distance = Coordinate.distance(this.getCoordinate(), target.getCoordinate());
			int damage = (int) (baseDamage * damageModifier / distance);
			target.getDamaged(damage);
		}

	}

}
/*
 * explodes high damage that reduces with distance low fire rate
 */