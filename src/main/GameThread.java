package main;

import static util.Conf.*;


public class GameThread extends Thread {
	
	/** Reference to PongPanel instance */
	private PongPanel pong_panel;
	
	
	/**
	 * Constructor of a game thread
	 * @param pp Reference to PongPanel instance
	 */
	public GameThread(PongPanel pp) {
		this.pong_panel = pp;
	}

	@Override
	public void run() {
		super.run();
		
		while(true) {
			pong_panel.update();
			pong_panel.repaint();
			try {
				Thread.sleep(1000/TARGET_FPS);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}








