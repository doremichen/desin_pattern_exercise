/**
 * 
 */
package com.adam.app.game.command;

/**
 * 
 * Jump command
 * 
 * @author AdamChen
 *
 */
public class JumpCommand extends Command implements INotifyUI{

	private String action = "Idle";
	
	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#execute()
	 */
	public void execute() {
		action = "jump";
	}

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#undo()
	 */
	public void undo() {
		action = "idle";
	}

	@Override
	public String getMessage() {
		return action;
	}

}
