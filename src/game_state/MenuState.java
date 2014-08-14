package game_state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;


public class MenuState extends AbstractGameState {
	
	private String title = "PONG";
	private String[] options = {"Start game", "Scores", "Exit"};
	private Font title_font = new Font("Century Gothic", Font.PLAIN, 70);
	private Font options_font = new Font("Century Gothic", Font.PLAIN, 30);
	
	private int selectedOption = 0;
	
	
	
	/**
	 * Constructor of main menu
	 */
	public MenuState() {
		
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
		// title :
		g.setColor(Color.white);
		g.setFont(title_font);
		g.drawString(title, 400, 150);
		
		// options :
		g.setFont(options_font);
		for(int i = 0; i<options.length; i++) {
			if(i == selectedOption)
				g.setColor(Color.yellow);
			else 
				g.setColor(Color.white);
			
			g.drawString(options[i], 400, 250+35*i);
		}
	}
	

	@Override
	public void keyPressed(KeyEvent key) {
		if(key.getKeyCode() == KeyEvent.VK_DOWN) {
			if(selectedOption >= options.length-1) 
				selectedOption = 0;
			else
				selectedOption++;
		}
		else if(key.getKeyCode() == KeyEvent.VK_UP) {
			if(selectedOption <= 0 ) 
				selectedOption = options.length-1;
			else
				selectedOption--;
		}
	}

	@Override
	public void keyReleased(KeyEvent key) {
		// TODO Auto-generated method stub
		
	}
}
