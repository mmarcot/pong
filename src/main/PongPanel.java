package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import static util.Conf.*;


/**
 * Root panel of the game instantiate by the JFrame
 * @author Mallory Marcot
 *
 */
public class PongPanel extends JPanel {

	
	/**
	 * Constructor of the PongPanel
	 */
	public PongPanel() {
		setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		setBackground(Color.black);
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
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g = (Graphics2D) g;
		
		//TODO
	}
}














