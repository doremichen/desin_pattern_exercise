package com.adam.design.pattern.app.command;

import com.adam.design.pattern.app.character.Character;
import com.adam.design.pattern.app.character.Normal;

// Command interface
public abstract class Command {
	// initial character (receiver)
	protected Character mCharacter = Normal.newInstance();
	
	public Normal getCharacter() {
		return (Normal) mCharacter;
	}
	// command request
	public abstract void execute();
    public abstract void undo();
}
