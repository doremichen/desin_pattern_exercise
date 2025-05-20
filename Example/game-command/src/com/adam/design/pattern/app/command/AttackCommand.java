/**
 * 
 */
package com.adam.design.pattern.app.command;

import com.adam.design.pattern.app.Utils;

/**
 * @author AdamChen
 *
 */
public class AttackCommand extends Command {

	private static final String NAME = AttackCommand.class.getSimpleName();
	
	public void execute() {
		Utils.info(NAME + ": " + "execute ======");
		this.mCharacter.attack();
		
	}

	public void undo() {
		Utils.info(NAME + ": " + "undo ======");
		this.mCharacter.idle();
		
	}

}
