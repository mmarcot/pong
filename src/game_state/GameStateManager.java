package game_state;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


/**
 * Deals with game states 
 * @author Mallory Marcot
 *
 */
public class GameStateManager {
	/** list of game states */
	private ArrayList<AbstractGameState> game_states;
	
	/** the current game state */
	private int currentState;
	/** integer constant for the main menu state */
	public static final int MAIN_MENU = 0;
	/** integer constant for the game state */
	public static final int GAME = 1;
	/** integer constant for the scoreboard state */
	public static final int SCORE= 2;
	
	
	/**
	 * Constructor of the game state manager 
	 */
	public GameStateManager() {
		this.game_states = new ArrayList<AbstractGameState>();
		this.currentState = MAIN_MENU;
		
		game_states.add(new MenuState());
	}
	
	
	/**
	 * Update the current state
	 */
	public void update() {
		game_states.get(currentState).update();
	}
	
	
	
	/**
	 * Draw the current state
	 */
	public void draw(Graphics2D g2) {
		game_states.get(currentState).draw(g2);
	}
	
	
	/**
	 * Check input corresponding to the current state
	 * @param key The key to check
	 */
	public void keyPressed(KeyEvent key) {
		game_states.get(currentState).keyPressed(key);
	}
	
	
	/**
	 * Check input corresponding to the current state
	 * @param key The key to check
	 */
	public void keyReleased(KeyEvent key) {
		game_states.get(currentState).keyReleased(key);
	}
	
	
	/**
	 * @param nstate The state to set 
	 */
	public void setCurrentState(int nstate) {
		currentState = nstate;
		game_states.get(currentState).init();
	}
	
	
	/**
	 * @return The current state
	 */
	public int getCurrentState() {
		return currentState;
	}
}













