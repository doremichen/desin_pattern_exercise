/**
 * 
 */
package com.adam.design.pattern.app.input;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.adam.design.pattern.app.Utils;
import com.adam.design.pattern.app.command.AttackCommand;
import com.adam.design.pattern.app.command.JumpCommand;
import com.adam.design.pattern.app.command.MoveCommand;
import com.adam.design.pattern.app.invoker.CommandInvoker;

/**
 * @author AdamChen
 *
 */
public class DirectionKeyExample extends JFrame implements KeyListener {

    private CommandInvoker mCmdInvoker;
    // command
    private MoveCommand mMoveCmd;
    private AttackCommand mAttackCmd;
    private JumpCommand mJumpCmd;
	
	
	public DirectionKeyExample() throws HeadlessException {
		super();
		this.setTitle("Arrow Key Listener");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.addKeyListener(this);  // 設定鍵盤監聽器
        this.setFocusable(true);    // 確保 JFrame 能接收焦點
        
        //initial cmd
        this.mCmdInvoker = new CommandInvoker();
        this.mMoveCmd = new MoveCommand();
        this.mAttackCmd = new AttackCommand();
        this.mJumpCmd = new JumpCommand();
        
        
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent arg0) {
		int key = arg0.getKeyCode();
        switch (key) {
	        case KeyEvent.VK_ENTER:
	        	Utils.info("Enter key pressed");
	        	this.mCmdInvoker.executeCommand(this.mAttackCmd);
	        	break;
            case KeyEvent.VK_UP:
                System.out.println("Up key pressed");
                this.mCmdInvoker.executeCommand(this.mMoveCmd);
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("Down key pressed");
                this.mCmdInvoker.executeCommand(this.mJumpCmd);
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("Left key pressed");
                this.mCmdInvoker.undo();
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("Right key pressed");
                break;
        }

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

}
