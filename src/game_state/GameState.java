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
	private Ball ball;
	
	
	/**
	 * Constructor of the game state 
	 */
	public GameState(GameStateManager gsm) {
		this.gsm = gsm;
		
		racket_left = new Racket(10, 10);
		racket_right = new Racket(SCREEN_WIDTH - 10 - RACKET_WIDTH, 10);
		ball = new Ball();
	}

	@Override
	public void init() {}

	@Override
	public void update() {
		
		// update entities :
		ball.update();
		racket_left.update();
		racket_right.update();
		
//		if(racket_left.inBounds(ball.getX(), ball.getY()) ||
//				racket_left.inBounds(ball.getX(), ball.getY()+BALL_SIZE)) {
//			ball.setVectorX(-ball.getVect_x());
//		}
//		else if(racket_right.inBounds(ball.getX()+BALL_SIZE, ball.getY()) ||
//				racket_right.inBounds(ball.getX()+BALL_SIZE, ball.getY()+BALL_SIZE)) {
//			ball.setVectorX(-ball.getVect_x());
//		}
//		
//		if(ball.getY() <= 0)
//			ball.setVectorY(-ball.getVect_y());
//		else if(ball.getY()+BALL_SIZE >= SCREEN_HEIGHT)
//			ball.setVectorY(-ball.getVect_y());
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
		else if(key.getKeyCode() == KeyEvent.VK_Z) 
			racket_left.setMoving_up(true);
		else if(key.getKeyCode() == KeyEvent.VK_S)
			racket_left.setMoving_down(true);
		else if(key.getKeyCode() == KeyEvent.VK_UP)	
			racket_right.setMoving_up(true);
		else if(key.getKeyCode() == KeyEvent.VK_DOWN)
			racket_right.setMoving_down(true);
	}

	@Override
	public void keyReleased(KeyEvent key) {
		if(key.getKeyCode() == KeyEvent.VK_Z) 
			racket_left.setMoving_up(false);
		else if(key.getKeyCode() == KeyEvent.VK_S)
			racket_left.setMoving_down(false);
		else if(key.getKeyCode() == KeyEvent.VK_UP)	
			racket_right.setMoving_up(false);
		else if(key.getKeyCode() == KeyEvent.VK_DOWN)
			racket_right.setMoving_down(false);
	}

}
