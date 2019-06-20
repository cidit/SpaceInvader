package props.entities.items.weapons;

import engine.phys.HitBox;
import props.entities.Actor;
import props.entities.Projectile;
import props.entities.items.Weapon;
import props.entities.projectiles.EMP;

public class PulseGun extends Weapon {

	public PulseGun(HitBox hitbox, Actor owner) {
		super(hitbox, owner, ???, ???, ???);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EMP fire() {
		if (fireCondition()) return new EMP();
		return null;
	}

}
