package com.adam.design.pattern.app.invoker;

import com.adam.design.pattern.app.character.CharacterMemento;
import com.adam.design.pattern.app.command.Command;

public class CommandHistoryEntry {
	private Command mCmd;
	private CharacterMemento mCmdMemo;
	public CommandHistoryEntry(Command mCmd, CharacterMemento mCmdMemo) {
		super();
		this.mCmd = mCmd;
		this.mCmdMemo = mCmdMemo;
	}
	public Command getCmd() {
		return mCmd;
	}
	public CharacterMemento getCmdMemo() {
		return mCmdMemo;
	}
	
	
	
}
