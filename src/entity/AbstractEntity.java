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
	private int x;
	/** The y coordinate of the entity (top-left corner) */
	private int y;
	/** The width of entity */
	private int width;
	/** The height of entity */
	private int height;
	
	
	public abstract void init();
	//public abstract void update();
	public abstract void move(int dx, int dy);
	public abstract void setLocation(int x, int y);
	public abstract void draw(Graphics2D g);
	public abstract boolean inBounds();
	
	
	
	
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
