package props.entities.items.weapons;

import engine.phys.HitBox;
import props.entities.Actor;
import props.entities.Projectile;
import props.entities.items.Weapon;
import props.entities.projectiles.Missile;

public class MissileLauncher extends Weapon {

	public MissileLauncher(HitBox hitbox, Actor owner) {
		super(hitbox, owner, ???, ???, ???);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Missile fire() {
		if (fireCondition()) return new Missile();
		return null;
	}

}
