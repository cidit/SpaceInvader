package props.entities.actors;

import engine.phys.HitBox;
import props.entities.Actor;
import props.entities.Item;
import props.entities.Projectile;
import props.entities.items.AmmoBox;
import props.entities.items.HealthPack;

public abstract class Player extends Actor {
	
	private int ammoCount;
	private Projectile ammoType;

	public Player(HitBox hitbox, int max_health) {
		super(Allegiance.FRIENDLY, hitbox, max_health);
		// TODO Auto-generated constructor stub
	}
	
	public void pickUp(Item i) {
		i.onPickup(this);
	}

	public <T> void refillAmmo(int quantity) {
		// TODO Auto-generated method stub
		
	}

}
