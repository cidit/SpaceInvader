package props.entities;

import engine.phys.HitBox;
import props.Entity;

public abstract class Projectile extends Entity {
	
	private final int max_ammo;

	public Projectile(Allegiance allegiance, HitBox hitbox, int max_ammo) {
		super(allegiance, hitbox);
		this.max_ammo = max_ammo;
	}
	
	public int getMax_Ammo() {
		return max_ammo;
	}
}
