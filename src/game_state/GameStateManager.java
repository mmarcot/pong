package game_state;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class GameStateManager {
	/** list of game states */
	private ArrayList<GameState> game_states;
	
	private int currentState;
	public static final int MAIN_MENU = 0;
	public static final int GAME = 1;
	public static final int SCORE= 2;
	
	
	/**
	 * Constructor of the game state manager 
	 */
	public GameStateManager() {
		this.game_states = new ArrayList<GameState>();
		this.currentState = MAIN_MENU;
		
		game_states.add(new MainMenuState());
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













