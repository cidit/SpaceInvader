package engine;

/**
 * This class represents a length and a direction on a two-dimensional plane
 * using integers,
 * 
 * @author cidit
 *
 */
public class Vector {
	Coordinate initialPoint;
	int xProjection, yProjection;

	/**
	 * Constructor for a mutable vector.
	 * 
	 * @param initialPoint
	 * @param terminalPoint
	 */
	public Vector(Coordinate initialPoint, Coordinate terminalPoint) {
		this.initialPoint = initialPoint;
		setTerminalPoint(terminalPoint);
	}

	/**
	 * Constructor for a mutable vector.
	 * 
	 * @param xProjection
	 * @param yProjection
	 */
	public Vector(int xProjection, int yProjection) {
		this.xProjection = xProjection;
		this.yProjection = yProjection;
	}

	public void setInitialPoint(Coordinate initialPoint) {
		this.initialPoint = initialPoint;
	}

	public void moveInitialPoint(Coordinate initialPoint) {
		Coordinate tmpTerminal = getTerminalPoint();
		setInitialPoint(initialPoint);
		xProjection = initialPoint.x - tmpTerminal.x;
		yProjection = initialPoint.y - tmpTerminal.y;
	}

	public void setTerminalPoint(Coordinate terminalPoint) {
		if (initialPoint == null) {
			setInitialPoint(new Coordinate(terminalPoint.x - xProjection, terminalPoint.y - yProjection));
		} else {
			xProjection = initialPoint.x - terminalPoint.x;
			yProjection = initialPoint.y - terminalPoint.y;
		}

	}

	public Coordinate getInitialPoint() {
		return initialPoint;
	}

	public Coordinate getTerminalPoint() {
		return new Coordinate(initialPoint.x + xProjection, initialPoint.y + yProjection);
	}

	public void setProjections(int xProjection, int yProjection) {
		this.xProjection = xProjection;
		this.yProjection = yProjection;
	}

	public int getXProjection() {
		return xProjection;
	}

	public int getYProjection() {
		return yProjection;
	}

	public float getMagnitude() {
		return Coordinate.distance(initialPoint, getTerminalPoint());
	}

	public Vector getOpposite() {
		return new Vector(-xProjection, -yProjection);
	}

	public void add(Vector vector) {
		xProjection += vector.xProjection;
		yProjection += vector.yProjection;
	}

	public void subtract(Vector vector) {
		xProjection -= vector.xProjection;
		yProjection -= vector.yProjection;
	}

	public void multiplyByScalar(float scalar) {
		xProjection = (int) (xProjection * scalar);
		yProjection = (int) (yProjection * scalar);
	}

	public static float scalarProduct(Vector a, Vector b) {
		return a.xProjection * b.xProjection + a.yProjection * b.yProjection;
	}

}
