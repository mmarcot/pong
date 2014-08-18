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
	protected double x;
	/** The y coordinate of the entity (top-left corner) */
	protected double y;
	/** The width of entity */
	protected int width;
	/** The height of entity */
	protected int height;
	
	
	/**
	 * Initialize the entity (loading ressources)
	 */
	public abstract void init();

	/**
	 * Draw the entity
	 * @param g Graphic context
	 */
	public abstract void draw(Graphics2D g);
	
	
	/**
	 * Update the logical part of entity
	 */
	public abstract void update();
	
	
	
	/**
	 * Set the location to absolute x and y
	 * @param x The x to set
	 * @param y The y to set
	 */
	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y;
	}	
	
	
	/**
	 * Is the parameter point in bounds of our entity ?
	 * @param px The x to test
	 * @param py The y to test
	 * @return True or false
	 */
	public boolean inBounds(double px, double py) {
		if(px > x && px < x+width && py > y && py < y+height)
			return true;
		else
			return false;
	}
	
	
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	/**
	 * @return the y
	 */
	public double getY() {
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
