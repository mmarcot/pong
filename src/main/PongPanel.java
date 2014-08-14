package main;

import game_state.GameStateManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import static util.Conf.*;


/**
 * Root panel of the game instantiate by the JFrame
 * @author Mallory Marcot
 *
 */
public class PongPanel extends JPanel implements KeyListener, Runnable {

	private GameStateManager gsm;
	private int FPS = TARGET_FPS;
	private Thread thread;
	
	/**
	 * Constructor of the PongPanel
	 */
	public PongPanel() {
		setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		setBackground(Color.black);
		setFocusable(true);
		requestFocus();
		this.gsm = new GameStateManager();
		
		addKeyListener(this);
		thread = new Thread(this);
		thread.start();
	}
	
	
	/**
	 * Manage to initializing resources
	 */
	public void init() {
		
	}
	
	
	/**
	 * Manage to update the logical part of the game
	 */
	public void update() {
		gsm.getCurrentState().update();
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		gsm.getCurrentState().draw(g2);
	}


	@Override
	public void keyPressed(KeyEvent e) {
		gsm.getCurrentState().keyPressed(e);
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void run() {
		while(true) {
			update();
			repaint();
			try {
				Thread.sleep(1000/FPS);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}














