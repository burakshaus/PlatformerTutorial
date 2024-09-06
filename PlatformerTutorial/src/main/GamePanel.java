package main;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel{
	
	private MouseInputs mouseInputs;
	private int xDelta = 100, yDelta = 100;
	
	public GamePanel() {
		
		mouseInputs = new MouseInputs(this);
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(new MouseInputs(this));
		addMouseMotionListener(mouseInputs);
	}
	
	public void changedXDelta(int value) {
		this.xDelta += value;
		repaint();
	}
	
	public void changedYDelta(int value) {
		this.yDelta += value;
		repaint();
	}
	
	public void setRectPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
		repaint();
	}
	 
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		// x, y, width and height
		g.fillRect(xDelta, yDelta, 200, 50);
	}
}
