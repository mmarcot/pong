package main;

import game_state.GameStateManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

import listener.PongPanelListener;
import static util.Conf.*;


/**
 * Root panel of the game instantiate by the JFrame
 * @author Mallory Marcot
 *
 */
public class PongPanel extends JPanel {

	private GameStateManager gsm;
	private GameThread game_thread;
	
	/**
	 * Constructor of the PongPanel
	 */
	public PongPanel() {
		setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		setBackground(Color.black);
		setFocusable(true);
		requestFocus();
		this.gsm = new GameStateManager();
		
		game_thread = new GameThread(this);
		game_thread.start();
		addKeyListener(new PongPanelListener(gsm));
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
		Graphics2D g2 = (Graphics2D) g.create();
		
		// anti aliasing ON :
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		gsm.getCurrentState().draw(g2);
		g2.dispose();
	}

}














