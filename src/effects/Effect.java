package effects;

import engine.util.Counter;
import props.entities.Actor;

public abstract class Effect {
	
	protected Counter timer;
	
	public Effect(long length) {
		timer = new Counter(length);
	}
	
	public abstract void apply(Actor e);
	
	public abstract <T extends Effect> void upgrade(T  e);

}

//public enum Effect {
//	INVINCIBLE, 
//	SPEEDBOOST, 
//	DAMAGEUP, 
//	LIFESTEAL,
//	STUNNED,
//	HEATING,
//	DEFENSELESS;
//}
// STUNNED is the effect applied when shot with an EMP. movement speed and fire
// rate are slowed down
// HEATING is the effect applied when shot with a Laser. damage accumulates
// exponentially. / applies an effect of weakness that gradually increases.
// DEFENSELESS deactivates the drones and the main weapon.
