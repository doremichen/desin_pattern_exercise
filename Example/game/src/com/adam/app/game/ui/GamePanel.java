/**
 * 
 */
package com.adam.app.game.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.adam.app.game.model.GameCharacter;
import com.adam.app.game.tools.Utils;
import com.adam.app.game.tools.Utils.SizeOfCircle;
import com.adam.app.game.tools.Utils.SizeOfWindow;

/**
 * 
 * Game ui component
 * 
 * @author AdamChen
 *
 */
public class GamePanel extends JPanel {

	// Game character
	private GameCharacter mCharacter = GameCharacter.getInstance();

	//background
	private BufferedImage mBackground;
	
	
	/**
	 * 
	 * initial setting
	 * 
	 * @param mCharacter
	 */
	public GamePanel() {
		
		try {
			this.mBackground = ImageIO.read(this.getClass().getResource("/resource/map.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(SizeOfWindow.WIDTH, SizeOfWindow.HIGH));
	}

	/**
	 * draw game component
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// draw background
		if (this.mBackground == null) {
			throw new RuntimeException("No background!!!");
		}
		
		g.drawImage(this.mBackground, 0, 0, this.getWidth(), this.getHeight(), this);
		
		// set color
		g.setColor(Color.BLUE);
		// draw
		int x = this.mCharacter.getX();
		int y = this.mCharacter.getY();
		Utils.info("x: " + x + " width: " + SizeOfWindow.WIDTH);
		Utils.info("y: " + y + " hight: " + SizeOfWindow.HIGH);
		
		g.fillOval(x, y, SizeOfCircle.WIDTH, SizeOfCircle.HIGH);
	}
	
}
