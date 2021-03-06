package entity;

import java.awt.Color;
import java.awt.Graphics2D;

import static util.Conf.*;


/**
 * Class that define a racket in our pong game 
 * @author Mallory Marcot
 *
 */
public class Racket extends AbstractEntity {
	
	/** Is the racket moving up ? */
	private boolean moving_up;
	/** Is the racket moving down ? */
	private boolean moving_down;
	
	// constants for collision area with the ball :
	public static final int UP_AREA = 0;
	public static final int UP_MID_AREA = 1;
	public static final int MID_AREA = 2;
	public static final int DOWN_MID_AREA = 3;
	public static final int DOWN_AREA = 4;
	
	/**
	 * Constructor of a racket
	 * @param px Initial x of the racket
	 * @param py Initial y of the racket
	 */
	public Racket(int px, int py) {
		this.x = px;
		this.y = py;
		this.width = RACKET_WIDTH;
		this.height = RACKET_HEIGHT;
		this.moving_down = false;
		this.moving_up = false;
	}

	
	@Override
	public void update() {
		if(moving_up && y-SPEED_RACKET > 0)
			y -= SPEED_RACKET;
		if(moving_down && y+RACKET_HEIGHT+SPEED_RACKET < SCREEN_HEIGHT)
			y += SPEED_RACKET;
	}
	
	
	/**
	 * Move dynamically the entity (from the current location)
	 * @param dx Dynamic x
	 * @param dy Dynamic y
	 */
	public void move(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	
	
	@Override
	public void init() {}



	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)x, (int)y, width, height);
		
	}


	/**
	 * @return the moving_up
	 */
	public boolean isMoving_up() {
		return moving_up;
	}


	/**
	 * @param moving_up the moving_up to set
	 */
	public void setMoving_up(boolean moving_up) {
		this.moving_up = moving_up;
	}


	/**
	 * @return the moving_down
	 */
	public boolean isMoving_down() {
		return moving_down;
	}


	/**
	 * @param moving_down the moving_down to set
	 */
	public void setMoving_down(boolean moving_down) {
		this.moving_down = moving_down;
	}


	/**
	 * Methods that gives you the part of the racket that the ball has touched
	 * Raise a IllegalArgumentException if the y gives in parameter are not on the racket
	 * @param y of the ball
	 * @return Constant int for area (UP, UP_MID, MID, DOWN_MID, DOWN) 
	 */
	public int getCollisionArea(double p_y) {
		double y_racket = p_y - y;
		int ret = -1;

		// exception :
		if(y_racket < 0)
			throw new IllegalArgumentException();
		
		// searching area :
		if(y_racket < 15 && y_racket >= 0)
			ret = UP_AREA;
		else if(y_racket < 35)
			ret = UP_MID_AREA;
		else if(y_racket < 65)
			ret = MID_AREA;
		else if(y_racket < 85)
			ret = DOWN_MID_AREA;
		else
			ret = DOWN_AREA;
			
		return ret;
	}
	
}













