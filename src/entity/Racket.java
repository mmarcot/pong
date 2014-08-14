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

	@Override
	public void init() {}

	@Override
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

	@Override
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.drawRect(x, y, width, height);
	}

	@Override
	public boolean inBounds(int px, int py) {
		if(px > x && px < x+width && py > y && py < y+height)
			return true;
		else
			return false;
	}

}
