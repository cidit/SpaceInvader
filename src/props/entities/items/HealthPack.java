package props.entities.items;

import engine.phys.HitBox;
import props.entities.Item;
import props.entities.actors.Player;

public class HealthPack extends Item {

	private int heal;

	public HealthPack(HitBox hitbox, int heal) {
		super(hitbox);
		this.heal = heal;
	}

	@Override
	public void onPickup(Player p) {
		p.getHealed(heal);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
