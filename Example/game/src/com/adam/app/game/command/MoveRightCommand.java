/**
 * 
 */
package com.adam.app.game.command;

/**
 * 
 * move left command
 * 
 * @author AdamChen
 *
 */
public class MoveRightCommand extends Command {

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#execute()
	 */
	public void execute() {
		this.mGame.moveLeft();

	}

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#undo()
	 */
	public void undo() {
		this.mGame.moveRight();

	}

}
