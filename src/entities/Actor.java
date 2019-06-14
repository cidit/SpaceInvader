package entities;

import engine.HitBox;

/**
 * This class represents an Entity that can die.
 * 
 * @author cidit
 *
 */
public abstract class Actor extends Entity {
	
	protected final int max_health;
	protected int health;

	public Actor(Allegiance allegiance, HitBox hitbox, int max_health) {
		super(allegiance, hitbox);
		this.max_health = max_health;
		this.health = max_health;
	}
	
	public int getMax_Health() {
		return max_health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void getDamaged(int damage) {
		health -= damage;
		health = health < 0 ? 0 : health; 
	}
	
	public void getHealed(int heal) {
		health += heal;
		health = health > max_health ? max_health : health;
	}

	/**
	 * All the statuses an Actor can have
	 * 
	 * @author cidit
	 *
	 */
	public enum Status {
		ALIVE, DEAD, INVINCIBLE;
	}
	
}