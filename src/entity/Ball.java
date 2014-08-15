package entity;

import java.awt.Color;
import java.awt.Graphics2D;

import static util.Conf.*;

import java.util.Random;


/**
 * Class that d0efine a ball in the pong game
 * @author Mallory Marcot
 *
 */
public class Ball extends AbstractEntity {

	/** Moving vector on x axis */
	private int vect_x;
	/** Moving vector on y axis */
	private int vect_y;
	
	
	/**
	 * Constructor of a ball
	 * @param px Initial x of the ball
	 * @param py Initial y of the ball
	 */
	public Ball(int px, int py) {
		this.x = px;
		this.y = py;
		this.width = BALL_SIZE;
		this.height = BALL_SIZE;
		
		initVector();
	}

	
	/**
	 * Constructor of a ball, initialize the ball at middle location
	 */
	public Ball() {
		this.width = BALL_SIZE;
		this.height = BALL_SIZE;
		
		setMiddleLocation();
		initVector();
	}
	

	private void initVector() {
		// random vect_x and vect_y generation :
		Random rand_gen = new Random();
		this.vect_x = rand_gen.nextInt();
		while(vect_x < 0.3)
			this.vect_x = rand_gen.nextInt();
		this.vect_y = rand_gen.nextInt();
	}
	
	
	/**
	 * Method that set the moving vector
	 * @param vect_x Moving in x
	 * @param vect_y Moving in y
	 */
	public void setVector(int vect_x, int vect_y) {
		this.vect_x = vect_x;
		this.vect_y = vect_y;
	}
	
	
	/**
	 * Put the ball in the middle of the screen
	 */
	public void setMiddleLocation() {
		this.x = SCREEN_WIDTH/2 - width/2;
		this.y = SCREEN_HEIGHT/2 - height/2;
	}
	
	
	/**
	 * Method that set the moving vector in x
	 * @param vect_x Moving in x	
	 */
	public void setVectorX(int vect_x) {
		this.vect_x = vect_x;
	}
	
	
	/**
	 * Update the logical part of a ball such as moving
	 */
	public void update() {
		x += vect_x;
		y += vect_y;
	}
	
	
	@Override
	public void init() {}

	
	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.white);
		g.fillOval(x, y, width, height);
	}

	
}
