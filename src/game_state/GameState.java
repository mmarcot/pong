package game_state;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;


/**
 * Class that defines all the mandatory methods to implements by a game state
 * @author Mallory Marcot
 *
 */
public class GameState extends AbstractGameState {
	
	
	/**
	 * Constructor of the game state 
	 */
	public GameState(GameStateManager gsm) {
		this.gsm = gsm;
	}

	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.green);
		g.drawRect(0, 0, 200, 100);
	}

	@Override
	public void keyPressed(KeyEvent key) {
		if(key.getKeyCode() == KeyEvent.VK_ESCAPE) {
			gsm.setCurrentState(GameStateManager.MENU);
		}
	}

	@Override
	public void keyReleased(KeyEvent key) {
		// TODO Auto-generated method stub
		
	}

}
