package main;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class GameWindow {
	
	private JFrame jframe;
	
	public GameWindow(GamePanel gamePanel) {
		
		JFrame jframe = new JFrame();
						
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
		jframe.add(gamePanel);
		
		jframe.setResizable(false);
		
		jframe.pack();
		
		jframe.setVisible(true);
		
		jframe.setLocationRelativeTo(null);
		jframe.addWindowFocusListener(new WindowFocusListener() {
			@Override 
			public void windowLostFocus(WindowEvent e) {
				gamePanel.getGame().windowFocusLost();
			}
			
			public void windowGainedFocus(WindowEvent e) {
				
			}
		});
	}

}
