/**
 * 
 */
package com.adam.design.pattern.app.invoker;

import java.util.LinkedList;
import java.util.Queue;

import com.adam.design.pattern.app.command.Command;

/**
 * simulator ai command
 * 
 * @author AdamChen
 *
 */
public class AICommandInvoker {
	
	private Queue<Command> mQueue = new LinkedList<>();
	
	// equeue
	public void enqueue(Command cmd) {
		this.mQueue.add(cmd);
	}
	
	// run
	public void runAll() {
		while (!this.mQueue.isEmpty()) {
			Command cmd = this.mQueue.poll();
			cmd.execute();
		}
	}
}
