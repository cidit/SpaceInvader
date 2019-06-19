package props.entities.items.weapons;

import engine.phys.HitBox;
import props.entities.Actor;
import props.entities.Projectile;
import props.entities.items.Weapon;
import props.entities.projectiles.Bullet;

public class BulletGun extends Weapon {

	public BulletGun(HitBox hitbox, Actor owner, int clipCapacity, int cooldownAfterFire) {
		super(hitbox, owner, clipCapacity, cooldownAfterFire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Bullet fire() {
		if (fireCondition()) return new Bullet();
		return null;
	}

}
