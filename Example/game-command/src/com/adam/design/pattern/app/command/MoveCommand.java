/**
 * 
 */
package com.adam.design.pattern.app.command;

import com.adam.design.pattern.app.Utils;

/**
 * @author AdamChen
 *
 */
public class MoveCommand extends Command {

	private static final String NAME = MoveCommand.class.getSimpleName();
	
	public void execute() {
		Utils.info(NAME + ": " + "execute ======");
		this.mCharacter.move();
		
	}

	public void undo() {
		Utils.info(NAME + ": " + "undo ======");
		this.mCharacter.idle();
		
	}

}
