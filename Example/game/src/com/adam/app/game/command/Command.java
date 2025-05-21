package com.adam.app.game.command;

import com.adam.app.game.model.GameCharacter;

public abstract class Command {
	// Game character
	protected GameCharacter mGame = GameCharacter.getInstance();
	
	public abstract void execute();
	public abstract void undo();
	
}
