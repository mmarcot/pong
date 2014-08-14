package game_state;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;


/**
 * Abstract class that define the model to implement for all the game states
 * @author Mallory Marcot
 *
 */
public abstract class GameState {
	
	protected GameStateManager gsm;
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(Graphics2D g);
	public abstract void keyPressed(KeyEvent key);
	public abstract void keyReleased(KeyEvent key);
}