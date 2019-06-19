package props.entities;

import engine.phys.HitBox;
import props.Entity;
import props.entities.items.AmmoBox;
import props.entities.items.HealthPack;

/**
 * This class represents an Entity that can die and has a status.
 * 
 * @author cidit
 *
 */
public abstract class Actor extends Entity {
	
	private final int max_health;
	private int health;
	private Status status;

	public Actor(Allegiance allegiance, HitBox hitbox, int max_health) {
		super(allegiance, hitbox);
		this.max_health = max_health;
		this.health = max_health;
		this.status = Status.ALIVE;
	}
	
	public int getMax_Health() {
		return max_health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void getDamaged(int damage) {
		if (damage <= 0) return; 
		health -= damage;
		if (health < 0) {
			health = 0; 
			status = Status.DEAD;
		}
	}
	
	public void getHealed(int heal) {
		if (heal <= 0) return;
		health += heal;
		if (health > max_health)
			health = max_health;
		if (status == Status.DEAD)
			status = Status.ALIVE;
	}
	
	public Status getStatus() {
		return status;
	}

	/**
	 * All the statuses an Actor can have
	 * 
	 * @author cidit
	 *
	 */
	public enum Status {
		ALIVE, DEAD;
	}
	
}