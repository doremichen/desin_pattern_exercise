package com.adam.design.pattern.app.character;

import com.adam.design.pattern.app.Utils;

/**
 * Singleton
 * @author AdamChen
 *
 */
public class Normal implements Character {
	
	private static class Helper {
		private static final Normal INSTANCE = new Normal("Adam Game");
	}
	
	public static Normal newInstance() {
		
		return Helper.INSTANCE;
	}
	
	
	// Game name
	private String mName;
	private int mHp;
	private int mMp;
	private String mPosition;
	
	private Normal(String mName) {
		this.mName = mName;
		this.mMp = 50;
		this.mHp = 100;
		this.mPosition = "Start";
	}

	public void move() {
		this.mPosition = "Forword";
		Log(this.mName + "@move", this.mPosition, this.mHp, this.mMp);
		
	}

	public void jump() {
		this.mMp -= 10;
		Log(this.mName + "@jump", this.mPosition, this.mHp, this.mMp);
		
	}

	public void attack() {
		this.mHp -= 5;
		Log(this.mName + "@attack", this.mPosition, this.mHp, this.mMp);
		
	}

	public void idle() {
		this.mPosition = "Idle";
		Log(this.mName + "@idle", this.mPosition, this.mHp, this.mMp);
		
	}
	
	// == MEMENTO ===
	public CharacterMemento save() {
		return new CharacterMemento(mHp, mMp, mPosition);
	}
	
	public void restore(CharacterMemento memento) {
		this.mHp = memento.getHp();
		this.mMp = memento.getMp();
		this.mPosition = memento.getPosition();
		//Log(mName, mPosition, mHp, mMp);
	}
	
	
	private void Log(String name, String position, int hp, int mp) {
		Utils.info(name + ": " + position + ", HP: " + hp + ", MP: " + mp);
	}
	

}
