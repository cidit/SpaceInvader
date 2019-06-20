package props;

import engine.geom.Coordinate;
import engine.geom.Dimension;
import engine.geom.Vector;
import engine.phys.HitBox;

/**
 * This class represents an object that that occupies a space and can move.
 * 
 * @author cidit
 *
 */
public abstract class Prop {

	private HitBox hitbox;
	protected Vector movement;
	
	public Prop(HitBox hitbox) {
		this.hitbox = hitbox;
		this.movement = new Vector(0, 0);
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
	
}