package com.adam.design.pattern.app;

import com.adam.design.pattern.app.command.AttackCommand;
import com.adam.design.pattern.app.command.JumpCommand;
import com.adam.design.pattern.app.command.MacroCommand;
import com.adam.design.pattern.app.command.MoveCommand;
import com.adam.design.pattern.app.input.DirectionKeyExample;
import com.adam.design.pattern.app.invoker.AICommandInvoker;
import com.adam.design.pattern.app.invoker.CommandInvoker;

public class Main {

	public static void main(String[] args) {
//		// intial invoker
//		CommandInvoker invoker = new CommandInvoker();
//		// inital command
//		MoveCommand moveCmd = new MoveCommand();
//		JumpCommand jumpCmd = new JumpCommand();
//		AttackCommand attackCmd = new AttackCommand();
//		Utils.info("== execute command by invoker =======================");
//		// execute command by invoker
//		invoker.executeCommand(moveCmd);
//		invoker.executeCommand(jumpCmd);
//		invoker.executeCommand(attackCmd);
//		// undo -----
//		invoker.undo();
//		invoker.undo();
//		//invoker.undo();
//		Utils.info("== execute command by macro command =======================");
//		MacroCommand macroCmds = new MacroCommand();
//		macroCmds.addCommand(moveCmd);
//		macroCmds.addCommand(jumpCmd);
//		macroCmds.addCommand(attackCmd);
//		Utils.info("Continue to execute!!!");
//		macroCmds.execute();
//		Utils.info("Continue to undo!!!");
//		macroCmds.undo();Utils.info("== execute command by ai command =======================");
//		AICommandInvoker aiInvoker = new AICommandInvoker();
//		// enqueue
//		aiInvoker.enqueue(moveCmd);
//		aiInvoker.enqueue(jumpCmd);
//		aiInvoker.enqueue(attackCmd);
//		// run
//		aiInvoker.runAll();
		
		new DirectionKeyExample();
		
	}

}
