package com.pluralsight.collection;
import java.awt.*;
import java.net.URI;

public class FullList {
	public static void handleListFull() {
		System.out.println("List is full. Opening purchase page...");
		try {openPurchasePage();}
		catch (Exception e) {System.out.println("Could not open purchase page.");}
	}
	// when you wanna give up.........
	private static void openPurchasePage() throws Exception {
		Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
	}
}