package main;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel{
	
	private MouseInputs mouseInputs;
	private float xDelta = 100, yDelta = 100;
	private float xDir = 1, yDir = 1;
	private int frames = 0;
	private long lastCheck = 0;
	private Color color = new Color(120,20,50);
	private Random random;
	
	public GamePanel() {
		random = new Random();
		mouseInputs = new MouseInputs(this);
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(new MouseInputs(this));
		addMouseMotionListener(mouseInputs);
	}
	
	public void changedXDelta(int value) {
		this.xDelta += value;
		
	}
	
	public void changedYDelta(int value) {
		this.yDelta += value;
	}
	
	public void setRectPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
	}
	 
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		updateRectangel();
		
		g.setColor(color);
		// x, y, width and height
		g.fillRect((int) xDelta,(int) yDelta, 200, 50);
		
		

		
	}

	private void updateRectangel() {
		xDelta += xDir;
		if (xDelta > 400 || xDelta < 0 ) {
			xDir *= -1;
			color = getRandomColor();
		}
		yDelta += yDir;
		if (yDelta > 400 || yDelta <0) {
			yDir *= -1;
			color = getRandomColor();
		}
	}

	private Color getRandomColor() {
		int r = random.nextInt(255);
		int g = random.nextInt(255); 
		int b = random.nextInt(255);
		return new Color(r,g,b);
	}
}
