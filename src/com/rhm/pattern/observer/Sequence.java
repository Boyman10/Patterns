package com.rhm.pattern.observer;

import java.util.Scanner;

/**
 * Sequence class to ask for user input and do action
 * @author John
 * @version 1.0.0
 */
public class Sequence {

	private String propAttr;
	
	/**
	 * Empty constructor for the class
	 */
	public Sequence() {
		
		
	}
	
	/**
	 * Starting sequence here
	 */
	public void startSequence() {
		
		Scanner sc = new Scanner(System.in);
		int read = 0;
		
		System.out.println("Please pick up the right game (1 for s, 2 for m) :");
		
		// Loop until the game is chosen
		do {
			try {			
				
				read = Integer.parseInt(sc.nextLine());
			
			} catch (Exception e) {
				System.out.println("Choose between 1 and 2 !");
			}
			
		} while (read != 1 && read != 2);
		
		
		switch(read) {
		
		case 1:
			Game game = new Game();
		
		}
	}
}
