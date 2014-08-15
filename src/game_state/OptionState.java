package game_state;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;


/**
 * Class that define the score game state
 * @author Mallory Marcot
 *
 */
public class OptionState extends AbstractGameState {
	
	
	/**
	 * COnstructor of the score state
	 */
	public OptionState(GameStateManager gsm) {
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
		g.setColor(Color.red);
		g.drawOval(0, 0, 300, 300);
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
