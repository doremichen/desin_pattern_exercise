package com.adam.app.game.command;

import java.util.Stack;

import com.adam.app.game.tools.ToastManager;
import com.adam.app.game.tools.Utils;

public class CommandInvoker {

	// command stack
	private Stack<Command> mHistory = new Stack<>();
	
	// listener of ui message
	public interface UIMessageListener {
		public void onMessage(String msg);
	}
	
	
	// ui message listener
	private UIMessageListener mListener;
	
	// set ui message listener
	public void setMessageListener(UIMessageListener listener) {
		this.mListener = listener;
	}
	
	public void executeCmd(Command cmd) {
		cmd.execute();
		// push to history
		this.mHistory.push(cmd);
		
		NotifyUI(cmd);
		
	}
	
	public void undo() {
		// check history
		if (this.mHistory.isEmpty()) {
			Utils.info("No Command in history");
			// show toast
			ToastManager.showToast("No Command in history", 1000L);
			return;
		}
		
		// pop command from history
		Command cmd = this.mHistory.pop();
		cmd.undo();
		
		NotifyUI(cmd);
	}
	
	private void NotifyUI(Command cmd) {
		// check cmd in notify ui group
		if (cmd instanceof INotifyUI) {
			if (this.mListener == null) {
				throw new RuntimeException("No ui message listener!!!");
			}
			// get message
			String msg = ((INotifyUI)cmd).getMessage();
			if ((msg == null) || (msg.isEmpty())) {
				throw new RuntimeException("msg is null or empty!!!");
			}
			
			// response message to ui
			this.mListener.onMessage(msg);	
		}
	}
}
