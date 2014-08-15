package game_state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;


public class MenuState extends AbstractGameState {
	
	/** Game title to display */
	private String title;
	/** table of options like "start game", "option", "exit" */
	private String[] options;
	/** the title font */
	private Font title_font;
	/** the options font */
	private Font options_font;
	/** current selected option index */
	private int selectedOption;
	
	
	
	/**
	 * Constructor of main menu
	 */
	public MenuState(GameStateManager gsm) {
		this.gsm = gsm;
		
		this.title = "PONG";
		this.options = new String[3];
		this.options[0] = "Start Game";
		this.options[1] = "Option";
		this.options[2] = "Exit";
		this.title_font = new Font("Century Gothic", Font.PLAIN, 70);
		this.options_font = new Font("Century Gothic", Font.PLAIN, 30);
		
		this.selectedOption = 0;
	}

	
	@Override
	public void init() {}
	@Override
	public void update() {}

	
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
		
		else if(key.getKeyCode() == KeyEvent.VK_ENTER) {
			switch(selectedOption) {
			case 0: // Start game
				gsm.setCurrentState(GameStateManager.GAME);
				break;
			case 1: // Option
				gsm.setCurrentState(GameStateManager.OPTIONS);
				break;
			case 2: // Exit
				System.exit(0);
				break;
			}
		}
	}

	
	@Override
	public void keyReleased(KeyEvent key) {}
}











