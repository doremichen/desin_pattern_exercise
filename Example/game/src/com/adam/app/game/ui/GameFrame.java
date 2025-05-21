/**
 * 
 */
package com.adam.app.game.ui;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.adam.app.game.command.Command;
import com.adam.app.game.command.CommandInvoker;
import com.adam.app.game.command.CommandInvoker.UIMessageListener;
import com.adam.app.game.input.KeyCommandStrategy;
import com.adam.app.game.tools.ToastManager;
import com.adam.app.game.tools.Utils.SizeOfWindow;

/**
 * 
 * Game UI
 * 
 * @author AdamChen
 *
 */
public class GameFrame extends JFrame implements KeyListener, UIMessageListener {
	
	// Game component
	private GamePanel mPanel = new GamePanel();
	// Game command invoker
	private CommandInvoker mInvoker = new CommandInvoker();
	

	/**
	 * 
	 * initial game ui
	 * 
	 * @throws HeadlessException
	 */
	public GameFrame() throws HeadlessException {
		// set title
		this.setTitle("Adam Game");
		// set size
		//this.setSize(SIZE.WIDTH, SIZE.HIGH);
		this.setResizable(false);
		// add game componet
		this.add(this.mPanel);
		// pack screen size to fit the size of content. 
		this.pack();
		// set close operation
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set location
		this.setLocationRelativeTo(null);
		// enable visible
		this.setVisible(true);
		
		// add key listener
		this.addKeyListener(this);
		// set focus
		this.setFocusable(true);
		
		// initialize toast
		ToastManager.initialize(this.mPanel);
		// set ui message listener
		this.mInvoker.setMessageListener(this);
			
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent event) {
		
		// get keycode
		int keyCode = event.getKeyCode();
		
		// press z key to do undo
		if (keyCode == KeyEvent.VK_Z) {
			this.mInvoker.undo();
			this.mPanel.repaint();
			return;
		}
		
		// execute key event command
		KeyCommandStrategy strategy = KeyCommandStrategy.fromKeyCode(keyCode);
		this.mInvoker.executeCmd(strategy.createCommand());
		this.mPanel.repaint();
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMessage(String msg) {
		// show toast
		ToastManager.showToast(msg, 1000L);
		
	}

}
