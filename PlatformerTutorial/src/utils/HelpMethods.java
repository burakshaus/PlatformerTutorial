package utils;

import main.Game;

public class HelpMethods {
	
	public static boolean CanMoveHere(float x, float y, int width, int height, int [][] lvlData) {
		
		
		
	}
	
	private static boolean IsSolid(float x, float y, int [][] lvlData) {
		if(x < 0 || x > Game.GAME_WIDTH) {
			return true;
		}
		if (x < 0 || y > Game.GAME_HEIGHT) {
			return true;
		}
		
		float xIndex = x / Game.TILES_SIZE;
		float yIndex = y / Game.TILES_SIZE;
		
		int value = lvlData[(int)xIndex][(int)yIndex];
	}
}
