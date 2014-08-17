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
		if(moving_up && y > 0)
			y -= SPEED_RACKET;
		if(moving_down && y+RACKET_HEIGHT < SCREEN_HEIGHT)
			y += SPEED_RACKET;
	}
	
	
	/**
	 * Move dynamically the entity (from the current location)
	 * @param dx Dynamic x
	 * @param dy Dynamic y
	 */
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	
	
	@Override
	public void init() {}



	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
		
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

}
