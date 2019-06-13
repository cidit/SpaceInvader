package entities;

/**
 * All the allegiance entities can have.
 * 
 * @FRIENDLY Will not harm player and other friendlies. Will harm enemies.
 * @HOSTILE Will harm player and friendlies. Will not harm enemies.
 * @NEUTRAL Will not harm anyone unless attacked.
 * @NONE Will harm everyone. Will focus on the entity dealing the most damage.
 * @PASSIVE Will not harm anyone.
 * 
 * @author cidit
 *
 */
public enum Allegiance {
	FRIENDLY, HOSTILE, NEUTRAL, NONE, PASSIVE;
}
