/**
 * 
 */
package com.adam.app.game.command;

/**
 * 
 * attack command
 * 
 * @author AdamChen
 *
 */
public class AttackCommand extends Command implements INotifyUI{

	private String action = "Idle";
	
	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#execute()
	 */
	public void execute() {
		action = "Fire";
	}

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#undo()
	 */
	public void undo() {
		action = "Idle";
	}

	@Override
	public String getMessage() {
		return action;
	}

}
