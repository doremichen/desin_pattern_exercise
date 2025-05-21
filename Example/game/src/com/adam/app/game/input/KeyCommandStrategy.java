/**
 * 
 */
package com.adam.app.game.input;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import com.adam.app.game.command.AttackCommand;
import com.adam.app.game.command.Command;
import com.adam.app.game.command.ExitCommand;
import com.adam.app.game.command.JumpCommand;
import com.adam.app.game.command.MoveDownCommand;
import com.adam.app.game.command.MoveLeftCommand;
import com.adam.app.game.command.MoveRightCommand;
import com.adam.app.game.command.MoveUpCommand;

/**
 * 
 * key event strategy
 * 
 * @author AdamChen
 *
 */
public enum KeyCommandStrategy {

	UP(KeyEvent.VK_UP) {

		@Override
		public Command createCommand() {
			return new MoveUpCommand();
		}
		
	},
	DOWN(KeyEvent.VK_DOWN) {

		@Override
		public Command createCommand() {
			
			return new MoveDownCommand();
		}
		
	},
	LEFT(KeyEvent.VK_LEFT) {

		@Override
		public Command createCommand() {
			
			return new MoveLeftCommand();
		}
		
	},
	RIGHT(KeyEvent.VK_RIGHT) {

		@Override
		public Command createCommand() {
			
			return new MoveRightCommand();
		}
		
	},
	A(KeyEvent.VK_A) {

		@Override
		public Command createCommand() {
			
			return new AttackCommand();
		}
		
	},
	SPACE(KeyEvent.VK_SPACE) {

		@Override
		public Command createCommand() {
			
			return new JumpCommand();
		}
		
	},
	ESCAPE(KeyEvent.VK_ESCAPE) {

		@Override
		public Command createCommand() {
			
			return new ExitCommand();
		}
		
	};
	
	private final int mKeyCode;

	/**
	 * @param mKeyCode
	 */
	private KeyCommandStrategy(int mKeyCode) {
		this.mKeyCode = mKeyCode;
	}

	public int getKeyCode() {
		return mKeyCode;
	}
	
	// create command strategy
	public abstract Command createCommand();
	
	
	private static final Map<Integer, KeyCommandStrategy> lookup = new HashMap<>();

	static {
	    for (KeyCommandStrategy strategy : values()) {
	        lookup.put(strategy.getKeyCode(), strategy);
	    }
	}

	public static KeyCommandStrategy fromKeyCode(int keyCode) {
		KeyCommandStrategy strategy = lookup.get(keyCode);
	    if (strategy == null) {
	        throw new RuntimeException("No strategy for key: " + keyCode);
	    }
	    return strategy;
	}
	
	
}
