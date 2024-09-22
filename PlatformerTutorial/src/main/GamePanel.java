package main;

import javax.imageio.ImageIO;
import static utils.Constants.PlayerConstants.*;
import static utils.Constants.Directions.*;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class GamePanel extends JPanel{
	
	private MouseInputs mouseInputs;

	private Game game;

	public GamePanel(Game game) {
		mouseInputs = new MouseInputs(this);
		setPanelSize();
		this.game = game;
		
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(new MouseInputs(this));
		addMouseMotionListener(mouseInputs);
	}

	private void setPanelSize() {
		Dimension size = new Dimension(1280, 750);
		setPreferredSize(size);
	}
	
	public void updateGame() {
	
		
	}
	 
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);		

		game.render(g);
	}

	public Game getGame() {
		return game;
	}
	
}
