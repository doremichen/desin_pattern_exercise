package com.adam.design.pattern.app.character;

// Character state memento
public class CharacterMemento {

	private final int mHp;
	private final int mMp;
	private final String mPosition;
	
	public CharacterMemento(int hp, int mp, String position) {
		super();
		this.mHp = hp;
		this.mMp = mp;
		this.mPosition = position;
	}

	public int getHp() {
		return mHp;
	}

	public int getMp() {
		return mMp;
	}

	public String getPosition() {
		return mPosition;
	}
	
}
