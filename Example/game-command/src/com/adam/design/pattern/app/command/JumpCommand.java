/**
 * 
 */
package com.adam.design.pattern.app.command;

import com.adam.design.pattern.app.Utils;

/**
 * @author AdamChen
 *
 */
public class JumpCommand extends Command {
	
	private static final String NAME = JumpCommand.class.getSimpleName();

	public void execute() {
		Utils.info(NAME + ": " + "execute ======");
		this.mCharacter.jump();
		
	}

	public void undo() {
		Utils.info(NAME + ": " + "undo ======");
		this.mCharacter.idle();
		
	}

}
