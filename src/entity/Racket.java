package entity;

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

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean inBounds(int px, int py) {
		// TODO Auto-generated method stub
		return false;
	}

}
