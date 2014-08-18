package util;


/**
 * Configuration class
 * @author Mallory Marcot
 *
 */
public class Conf {

	/** the screen width */
	public static final int SCREEN_WIDTH = 1000;
	/** the screen height */
	public static final int SCREEN_HEIGHT = 600;
	
	/** ball size (width and height) */
	public static final int BALL_SIZE = 15;
	/** the racket width */
	public static final int RACKET_WIDTH = 10;
	/** the racket height */
	public static final int RACKET_HEIGHT = 100;
	
	/** wanted FPS */
	public static final int TARGET_FPS = 100;
	
	/** number of pixels to move for each loop */
	public static final int SPEED_RACKET = 5;
	public static final int SPEED_BALL = 3;
	
	// Variations of balls vectors when touching a racket :
	public static final double VECTOR_Y_VARIATION_UP_DOWN = 0.2;
	public static final double VECTOR_Y_VARIATION_UP_MID_DOWN_MID = 0.1;
	public static final double VECTOR_Y_VARIATION_MID = 0;
	public static final double VECTOR_X_VARIATION_UP_DOWN = 0.2;
	public static final double VECTOR_X_VARIATION_UP_MID_DOWN_MID = 0.1;
	public static final double VECTOR_X_VARIATION_MID = 0;
	
}







