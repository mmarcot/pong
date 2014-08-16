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
	
	
	/**
	 * Move racket up
	 */
	public void up() {
		y -= RACKET_MOVE_PX;
	}
	
	
	/**
	 * Move racket down
	 */
	public void down() {
		y += RACKET_MOVE_PX;
	}
	
	
	@Override
	public void init() {}



	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
		
	}

}
