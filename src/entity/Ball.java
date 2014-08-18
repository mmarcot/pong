package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import static util.Conf.*;

import java.util.Random;


/**
 * Class that define a ball in the pong game
 * @author Mallory Marcot
 *
 */
public class Ball extends AbstractEntity {

	/** Moving vector on x axis */
	private double vect_x;
	/** Moving vector on y axis */
	private double vect_y;
	

	
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
		// random generator :
		Random rand_gen = new Random();
		
		// vect_x :
		this.vect_x = 1 + rand_gen.nextDouble();
		this.vect_x = rand_gen.nextBoolean() ? -vect_x : vect_x;
		
		// vext_y :
		this.vect_y = 1 + rand_gen.nextDouble();
		this.vect_y = rand_gen.nextBoolean() ? -vect_y : vect_y;
	}
	
	
	@Override
	public void update() {
		x += vect_x;
		y += vect_y;
	}
	
	
	/**
	 * Method that set the moving vector
	 * @param vect_x Moving in x
	 * @param vect_y Moving in y
	 */
	public void setVector(double vect_x, double vect_y) {
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
	public void setVectorX(double vect_x) {
		this.vect_x = vect_x;
	}
	
	
	/**
	 * Method that set the moving vector in y
	 * @param vect_y Moving in y	
	 */
	public void setVectorY(double vect_y) {
		this.vect_y = vect_y;
	}
	
	
	@Override
	public void init() {}

	
	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.white);
		g.fillOval((int)x, (int)y, width, height);
	}
	
	
	/**
	 * @return the vect_x
	 */
	public double getVect_x() {
		return vect_x;
	}


	/**
	 * @return the vect_y
	 */
	public double getVect_y() {
		return vect_y;
	}
	
	
	/**
	 * @return The ball's center 
	 */
	public Point getCenter() {
		double center_x = x + width/2;
		double center_y = y + height/2;
		
		return new Point((int)center_x, (int)center_y);
	}
	
}
