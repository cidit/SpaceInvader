package props.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import engine.geom.Coordinate;
import props.Entity;

public interface Seeking {

	public default Entity aquireTarget(Entity[] possibleTargets) {
		List<Entity> entities = new ArrayList<Entity>(Arrays.asList(possibleTargets));
		entities.sort((e1, e2) -> {
			return Coordinate.distance(e1.getCoordinate(), this) - Coordinate.distance(e2.getCoordinate(), this);
		});
		return entities.get(0);
	}
	
}
