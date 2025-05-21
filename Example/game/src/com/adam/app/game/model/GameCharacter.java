package com.adam.app.game.model;

import com.adam.app.game.tools.Utils.SizeOfCircle;
import com.adam.app.game.tools.Utils.SizeOfWindow;

// singleton
public class GameCharacter {
	
	private static class Helper {
		private static final GameCharacter INSTANCE = new GameCharacter();
	}
	
	private GameCharacter() {}
	
	// get instance
	public static GameCharacter getInstance() {
		return Helper.INSTANCE;
	}
	
	private interface X_BOUNDARY {
		int UPPER = SizeOfWindow.WIDTH - SizeOfCircle.WIDTH;
		int LOWER = 0;
	}
	
	private interface Y_BOUNDARY {
		int UPPER = SizeOfWindow.HIGH - SizeOfCircle.HIGH;
		int LOWER = 0;
	}
	
	
	// x
	private int mX = 100;
	// y
	private int mY = 100;
	
	public void moveUp() {
		this.mY -= 10;
		
		if (this.mY < Y_BOUNDARY.LOWER) {
			this.mY = Y_BOUNDARY.LOWER;
		}
		
	}
	
	public void moveDown() {
		this.mY += 10;
		
		if (this.mY > Y_BOUNDARY.UPPER) {
			this.mY = Y_BOUNDARY.UPPER;
		}
	}
	
	public void moveLeft() {
		this.mX += 10;
		
		if (this.mX > X_BOUNDARY.UPPER) {
			this.mX = X_BOUNDARY.UPPER;
		}
	}
	
	public void moveRight() {
		this.mX -=10;
		
		if (this.mX < X_BOUNDARY.LOWER) {
			this.mX = X_BOUNDARY.LOWER;
		}
	}
	
	
    // update coordinates
	public void setX(int x) {
		this.mX = x;
	}
	
	public void setY(int y) {
		this.mY = y;
	}

	// get x value
	public int getX() {
		return mX;
	}
	
	// gety value
	public int getY() {
		return mY;
	}
	
	
	
}
