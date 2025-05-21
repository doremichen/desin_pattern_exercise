/**
 * 
 */
package com.adam.app.game.command;

/**
 * 
 * move right command
 * 
 * @author AdamChen
 *
 */
public class MoveLeftCommand extends Command {

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#execute()
	 */
	public void execute() {
		this.mGame.moveRight();

	}

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#undo()
	 */
	public void undo() {
		this.mGame.moveLeft();

	}

}
