package main;

import javax.swing.JFrame;

public class GameWindow {
	
	private JFrame jframe;
	
	public GameWindow(GamePanel gamepanel) {
		
		JFrame jframe = new JFrame();
		
		jframe.setSize(400, 400);
				
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
		jframe.add(gamepanel);
		
		jframe.setVisible(true);
		
	}

}
