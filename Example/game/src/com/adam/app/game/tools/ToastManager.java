package com.adam.app.game.tools;

import java.awt.Component;
import java.awt.Window;

import javax.swing.SwingUtilities;

public class ToastManager {
	
	// Componet
	private static Component sContext;
	
	public static void initialize(Component context) {
		sContext = context;
	}
	
	public static void showToast(String msg, long durationMills) {
		if (sContext == null) {
			throw new RuntimeException("No initial toast!!!");
		}
		
		// get window
	    Window window = sContext instanceof Window? (Window)sContext: SwingUtilities.getWindowAncestor(sContext);
		if (window == null) {
			throw new RuntimeException("No window!!!");
		}
		// new toast
		new Toast(window, msg, durationMills);
	}
	
	
	public static void showToast(Component context, String msg, long durationMills) {
		// get window
		Window window = context instanceof Window? (Window)context: SwingUtilities.getWindowAncestor(context);
		if (window == null) {
			Utils.info("No window!!!");
		}
		// new toast
		new Toast(window, msg, durationMills);
	}
}
