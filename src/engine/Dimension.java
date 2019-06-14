package engine;

/**
 * This class represents a rectangular area using integers.
 * 
 * @author cid
 *
 */
public final class Dimension {

	final int width, height;

	/**
	 * Constructor for an immutable rectangle.
	 * 
	 * @param width
	 * @param height
	 */
	public Dimension(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return width + ";" + height;
	}

}
