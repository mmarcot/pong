package entity;

import java.awt.Graphics2D;
import static util.Conf.*;


/**
 * Class that define a ball in the pong game
 * @author Mallory Marcot
 *
 */
public class Ball extends AbstractEntity {

	
	/**
	 * Constructor of a ball
	 * @param px Initial x of the ball
	 * @param py Initial y of the ball
	 */
	public Ball(int px, int py) {
		this.x = px;
		this.y = py;
		this.width = BALL_SIZE;
		this.height = width;
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
