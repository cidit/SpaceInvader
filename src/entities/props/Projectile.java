package entities.props;

import engine.HitBox;
import entities.Prop;

public abstract class Projectile extends Prop {

	protected int damage;
	
	public Projectile(Allegiance allegiance, HitBox hitbox) {
		super(allegiance, hitbox);
		// TODO Auto-generated constructor stub
	}

	public abstract void impact();
	
}
