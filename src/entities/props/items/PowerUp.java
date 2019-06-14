package entities.props.items;

import entities.props.Item;

public class PowerUp extends Item {

	public enum Bonus {
		INVINCIBLE, SPEEDBOOST, DAMAGEUP, LIFESTEAL;
	}

	public enum Malus {
		STUNNED, HEATING, DEFENSELESS
	}
	// STUNNED is the effect applied when shot with an EMP. movement speed and fire
	// rate are slowed down
	// HEATING is the effect applied when shot with a Laser. damage accumulates
	// exponentially.
	// DEFENSELESS deactivates the drones and the main weapon.
}
