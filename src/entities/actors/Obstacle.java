package entities.actors;

import engine.HitBox;
import entities.Actor;

public abstract class Obstacle extends Actor {

	public Obstacle(HitBox hitbox, int max_health) {
		super(Allegiance.NONE, hitbox, max_health);
		// TODO Auto-generated constructor stub
	}

}
