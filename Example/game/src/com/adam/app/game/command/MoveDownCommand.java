/**
 * 
 */
package com.adam.app.game.command;

/**
 * 
 * move down command
 * 
 * @author AdamChen
 *
 */
public class MoveDownCommand extends Command {

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#execute()
	 */
	public void execute() {
		this.mGame.moveDown();

	}

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#undo()
	 */
	public void undo() {
		this.mGame.moveUp();

	}

}
