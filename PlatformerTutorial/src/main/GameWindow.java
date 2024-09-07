package main;

import javax.swing.JFrame;

public class GameWindow {
	
	private JFrame jframe;
	
	public GameWindow(GamePanel gamepanel) {
		
		JFrame jframe = new JFrame();
						
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
		jframe.add(gamepanel);
		
		jframe.setResizable(false);
		
		jframe.pack();
		
		jframe.setVisible(true);
		
		jframe.setLocationRelativeTo(null);
	}

}
