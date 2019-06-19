package props.entities.items;

import engine.phys.HitBox;
import props.entities.Item;
import props.entities.Projectile;
import props.entities.actors.Player;

public class AmmoBox extends Item {
	
	private int quantity;

	public AmmoBox(HitBox hitbox, int quantity) {
		super(hitbox);
		this.quantity = quantity;
	}

	@Override
	public void onPickup(Player p) {
		p.refillAmmo(quantity);
	}
	
}
