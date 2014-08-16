package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import static util.Conf.*;

import java.util.Random;


/**
 * Class that d0efine a ball in the pong game
 * @author Mallory Marcot
 *
 */
public class Ball extends AbstractEntity implements Runnable {

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
	

	/**
	 * Initialize the vector of moving with random values
	 */
	private void initVector() { 
		final int MAX = 5;
		
		// random generator :
		Random rand_gen = new Random();
		
		// vect_x :
		this.vect_x = rand_gen.nextInt(MAX);
		this.vect_x = rand_gen.nextBoolean() ? -vect_x : vect_x;
		while(vect_x == 0) {
			this.vect_x = rand_gen.nextInt(MAX);
			this.vect_x = rand_gen.nextBoolean() ? -vect_x : vect_x;
		}
		
		// vext_y :
		this.vect_y = rand_gen.nextInt(MAX);
		this.vect_y = rand_gen.nextBoolean() ? -vect_y : vect_y;
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
	 * Method that set the moving vector in y
	 * @param vect_y Moving in y	
	 */
	public void setVectorY(int vect_y) {
		this.vect_y = vect_y;
	}
	
	
	@Override
	public void run() {
		while(true) {
			x += vect_x;
			y += vect_y;
			try {
				Thread.sleep(1000/TARGET_FPS);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	@Override
	public void init() {}

	
	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.white);
		g.fillOval(x, y, width, height);
	}

	
}
