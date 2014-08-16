package game_state;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import entity.Ball;
import entity.Racket;
import static util.Conf.*;


/**
 * Class that defines all the mandatory methods to implements by a game state
 * @author Mallory Marcot
 *
 */
public class GameState extends AbstractGameState {
	
	private Racket racket_left;
	private Racket racket_right;
	private Thread th_ball;
	private Ball ball;
	
	/**
	 * Constructor of the game state 
	 */
	public GameState(GameStateManager gsm) {
		this.gsm = gsm;
		
		racket_left = new Racket(10, 10);
		racket_right = new Racket(SCREEN_WIDTH - 10 - RACKET_WIDTH, 10);
		ball = new Ball();
		th_ball = new Thread(ball);
		th_ball.start();
	}

	@Override
	public void init() {}

	@Override
	public void update() {
		//ball.update();
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.white);
		racket_left.draw(g);
		racket_right.draw(g);
		ball.draw(g);
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
