package entity;

import java.awt.Graphics2D;


/**
 * Class that defines the mandatories methods to implements for all the 
 * entities
 * @author Mallory Marcot
 *
 */
public abstract class AbstractEntity {
	
	/** The x coordinate of the entity (top-left corner) */
	protected int x;
	/** The y coordinate of the entity (top-left corner) */
	protected int y;
	/** The width of entity */
	protected int width;
	/** The height of entity */
	protected  int height;
	
	
	/**
	 * Initialize the entity (loading ressources)
	 */
	public abstract void init();
	
	/**
	 * Move dynamically the entity (from the current location)
	 * @param dx Dynamic x
	 * @param dy Dynamic y
	 */
	public abstract void move(int dx, int dy);
	
	/**
	 * Set the location to absolute x and y
	 * @param x The x to set
	 * @param y The y to set
	 */
	public abstract void setLocation(int x, int y);
	
	/**
	 * Draw the entity
	 * @param g Graphic context
	 */
	public abstract void draw(Graphics2D g);
	
	/**
	 * Is the parameter point in bounds of our entity ?
	 * @param px The x to test
	 * @param py The y to test
	 * @return True or false
	 */
	public abstract boolean inBounds(int px, int py);
	
	
	
	
	
	
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	
}
