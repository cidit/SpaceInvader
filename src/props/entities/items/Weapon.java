package props.entities.items;

import engine.phys.HitBox;
import engine.util.Counter;
import engine.util.Updatable;
import props.entities.Actor;
import props.entities.Item;
import props.entities.Projectile;
import props.entities.actors.Player;

public abstract class Weapon extends Item implements Updatable {

	private Actor owner;

	private final int clipCapacity;
	private int clipSize = 0;

	private Counter cooldownAfterFire;

	protected final int base_damage;

	public Weapon(HitBox hitbox, Actor owner, int clipCapacity, int cooldownAfterFire, int base_damage) {
		super(hitbox);
		this.owner = owner;
		this.clipCapacity = clipCapacity;
		this.cooldownAfterFire = new Counter(cooldownAfterFire);
		this.base_damage = base_damage;
	}

	public void refillClip(int quantity) {
		clipSize += quantity;
		if (clipSize > clipCapacity)
			clipSize = clipCapacity;
	}

	public abstract <T extends Projectile> T fire();

	protected boolean fireCondition() {
		if (clipSize == 0 || !cooldownAfterFire.isExpired())
			return false;
		clipSize--;
		cooldownAfterFire.reset();
		return true;
	}

	protected Actor getOwner() {
		return owner;
	}

	@Override
	public void update() {
		cooldownAfterFire.count();
	}

	@Override
	public void onPickup(Player p) {
		p.setWeapon(this);
	}
}
