package listener;

import game_state.GameStateManager;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongPanelListener implements KeyListener {

	private GameStateManager gsm;
	
	
	/**
	 * Constructor of a PongPanel listener
	 * @param gsm Reference to the game state manager
	 */
	public PongPanelListener(GameStateManager gsm) {
		this.gsm = gsm;
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		gsm.getCurrentState().keyPressed(e);
	}


	@Override
	public void keyReleased(KeyEvent e) {
		gsm.getCurrentState().keyReleased(e);
	}


	@Override
	public void keyTyped(KeyEvent e) {}

}
