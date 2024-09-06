package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyboardInputs implements KeyListener{
	
	private GamePanel gamePanel;
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_W:
				gamePanel.changedYDelta(-5);
				break;
			case KeyEvent.VK_A:
				gamePanel.changedXDelta(-5);
				break;
			case KeyEvent.VK_S:
				gamePanel.changedYDelta(5);
				break;
			case KeyEvent.VK_D:
				gamePanel.changedXDelta(5);
				break;

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
