package main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends JPanel{

	public GamePanel() {
		
	}
	 
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		// x, y, width and height
		g.fillRect(100, 100, 200, 50);
	}
}
