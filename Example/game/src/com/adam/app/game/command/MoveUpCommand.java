/**
 * 
 */
package com.adam.app.game.command;

/**
 * 
 * move up command
 * 
 * @author AdamChen
 *
 */
public class MoveUpCommand extends Command {

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#execute()
	 */
	public void execute() {
		this.mGame.moveUp();

	}

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#undo()
	 */
	public void undo() {
		this.mGame.moveDown();

	}

}
