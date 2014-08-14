package main;

import javax.swing.JFrame;


/**
 * Main class, create the JFrame
 * @author Mallory Marcot
 *
 */
public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame("Pong");
		window.setContentPane(new PongPanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
	}

}
