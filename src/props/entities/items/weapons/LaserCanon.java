package props.entities.items.weapons;

import engine.phys.HitBox;
import props.entities.Actor;
import props.entities.Projectile;
import props.entities.actors.Player;
import props.entities.items.Weapon;
import props.entities.projectiles.Laser;

public class LaserCanon extends Weapon {

	public LaserCanon(HitBox hitbox, Actor owner, int clipCapacity, int cooldownAfterFire) {
		super(hitbox, owner, clipCapacity, cooldownAfterFire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Laser fire() {
		if (fireCondition()) return new Laser();
		return null;
	}

}
