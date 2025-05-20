/**
 * 
 */
package com.adam.design.pattern.app.command;


import java.util.ArrayList;
import java.util.List;

/**
 * Macro specifiled commands
 * 
 * @author AdamChen
 *
 */
public class MacroCommand extends Command {
	
	// Command list
	List<Command> mCmds = new ArrayList<>();
	
	// add command to list
	public void addCommand(Command cmd) {
		this.mCmds.add(cmd);
	}
	

	@Override
	public void execute() {
		for (Command cmd: this.mCmds) {
			cmd.execute();
		}		
	}

	@Override
	public void undo() {
		for (int i = this.mCmds.size()-1; i>=0; i--) {
			this.mCmds.get(i).undo();
		}
		
	}

}
