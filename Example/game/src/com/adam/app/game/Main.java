/**
 * 
 */
package com.adam.app.game;

import javax.swing.SwingUtilities;

import com.adam.app.game.ui.GameFrame;

/**
 * @author AdamChen
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// start game ui
		SwingUtilities.invokeLater(new Runnable(){

			@Override
			public void run() {
				new GameFrame();
				
			}
			
		});

	}

}
