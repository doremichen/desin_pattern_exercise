/**
 * 
 */
package com.adam.app.game.command;

import javax.swing.JOptionPane;

/**
 * 
 * Exit command
 * 
 * @author AdamChen
 *
 */
public class ExitCommand extends Command {

	private static boolean sAlreadyExecute = false;
	
	
	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#execute()
	 */
	public void execute() {
		
		// already execute so do nothing!!!
		if (sAlreadyExecute) return;
		// update flag
		sAlreadyExecute = true;
		
		
		// show dialog
		int result = JOptionPane.showConfirmDialog(null, 
				"Are you sure to exit this application?", 
				"Ok", 
				JOptionPane.YES_NO_OPTION);
		
		if (result == JOptionPane.YES_OPTION) {
			System.exit(0);
		} else {
			sAlreadyExecute = false; // press cancel in comfirm dialog need to update flag as false.
		}
	
	}

	/* (non-Javadoc)
	 * @see com.adam.app.game.commend.Command#undo()
	 */
	public void undo() {
		// EMPTY
	}

}
