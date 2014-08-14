package game_state;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;


/**
 * Abstract class that define the model to implement for all the game states
 * @author Mallory Marcot
 *
 */
public abstract class AbstractGameState {
	
	protected GameStateManager gsm;
	
	/**
	 * Initialize ressources of the state
	 */
	public abstract void init();
	
	/**
	 * Updating the logical part of the state
	 */
	public abstract void update();
	
	/**
	 * Rendering the state
	 * @param g Graphical context
	 */
	public abstract void draw(Graphics2D g);
	
	/**
	 * Defines events to do when key is pressed
	 * @param key The Key pressed
	 */
	public abstract void keyPressed(KeyEvent key);
	
	/**
	 * Defines events to do when key is released
	 * @param key The Key released
	 */
	public abstract void keyReleased(KeyEvent key);
}










