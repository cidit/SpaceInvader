package engine;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * This class represents a position on a two-dimensional plane using integers.
 * 
 * @author cidit
 *
 */
public final class Coordinate {

	final int x, y;

	/**
	 * Constructor for an immutable position.
	 * @param x
	 * @param y
	 */
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static float distance(Coordinate a, Coordinate b) {
		return (float) sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
	}

	@Override
	public String toString() {
		return x + ";" + y;
	}

}
