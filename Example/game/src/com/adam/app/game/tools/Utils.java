package com.adam.app.game.tools;

public final class Utils {
	
	public static interface SizeOfWindow {
		int WIDTH = 1024;
		int HIGH = 800;
	}
	
	public static interface SizeOfCircle {
		int WIDTH = 20;
		int HIGH = 20;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}

}
