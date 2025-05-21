package com.adam.app.game.tools;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * 
 * Toast dialog
 * 
 * @author AdamChen
 *
 */
public class Toast extends JDialog {
	public Toast(Window owner, String message, long durationMillis) {
        super(owner);
        setUndecorated(true);
        setLayout(new BorderLayout());
        setSize(200, 50);

        JLabel label = new JLabel(message, SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(new Color(0, 0, 0, 170));
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        add(label);

        setLocation(owner.getX() + (owner.getWidth() - getWidth()) / 2,
                    owner.getY() + owner.getHeight() - 100);
        setVisible(true);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                dispose();
            }
        }, durationMillis);
    }
}
