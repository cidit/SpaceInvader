package entities;

import engine.Coordinate;
import engine.Dimension;
import engine.HitBox;
import engine.Vector;

/**
 * This class defines the characteristics of an Entity.
 * 
 * @author cidit
 *
 */
public abstract class Entity {

	protected Allegiance allegiance;
	protected HitBox hitbox;
	protected Vector movement;

	public Entity(Allegiance allegiance, HitBox hitbox) {
		this.allegiance = allegiance;
		this.hitbox = hitbox;
		this.movement = new Vector(0, 0);
	}

	public Allegiance getAllegiance() {
		return allegiance;
	}

	public Coordinate getCoordinate() {
		return hitbox.getCoordinate();
	}
	
	public Dimension getDimension() {
		return hitbox.getDimension();
	}

	// TODO restrict access if necessary
	public Vector getMovement() {
		return movement;
	}
	
	public void move() {
		Coordinate now = hitbox.getCoordinate();
		int nextX = now.getX() + movement.getXProjection();
		int nextY = now.getY() + movement.getYProjection();
		hitbox.move(new Coordinate(nextX, nextY));
	}
	
	public void teleport(Coordinate coordinate) {
		hitbox.move(coordinate);
	}

	/**
	 * All the allegiance an Entity can have.
	 * 
	 * @FRIENDLY Will not harm player and other friendlies. Will harm enemies.
	 * @HOSTILE Will harm player and friendlies. Will not harm enemies.
	 * @NEUTRAL Will not harm anyone unless attacked. In which case, it will defend
	 *          itself.
	 * @NONE Will harm everyone. Will focus on the entity dealing the most damage.
	 * @PASSIVE Will never harm anyone.
	 * 
	 * @author cidit
	 *
	 */
	public enum Allegiance {
		FRIENDLY, HOSTILE, NEUTRAL, NONE, PASSIVE;
	}

}