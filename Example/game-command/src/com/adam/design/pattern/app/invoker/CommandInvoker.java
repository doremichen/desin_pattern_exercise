/**
 * 
 */
package com.adam.design.pattern.app.invoker;

import java.util.Stack;

import com.adam.design.pattern.app.Utils;
import com.adam.design.pattern.app.character.CharacterMemento;
import com.adam.design.pattern.app.character.Normal;
import com.adam.design.pattern.app.command.Command;

/**
 * invoker interface
 * 
 * @author AdamChen
 * 
 */
public class CommandInvoker {

	// command history
	private Stack<CommandHistoryEntry> mHistory = new Stack<>();

	// execute command
	public void executeCommand(Command cmd) {
		// execute
		cmd.execute();
		// save to memento
		CharacterMemento memo = cmd.getCharacter().save();

		// push to history
		this.mHistory.push(new CommandHistoryEntry(cmd, memo));
	}

	// undo
	public void undo() {
		// check cmd in history
		if (this.mHistory.isEmpty()) {
			Utils.info("No command in history!!!");
			return;
		}

		// restore
		CommandHistoryEntry lastHistoryCmd = this.mHistory.pop();
		Command lastCmd = lastHistoryCmd.getCmd();
		lastCmd.undo();
		//restore
		lastCmd.getCharacter().restore(lastHistoryCmd.getCmdMemo());

	}

}
