package entities;

/**
 * This class defines the characteristics of an Entity.
 * 
 * @author cidit
 *
 */
public abstract class Entity {
	
	protected Allegiance allegiance;

	public Entity(Allegiance allegiance) {
		this.allegiance = allegiance;
	}

}