package com.rhm.pattern.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;


/**
 * Demo class with nothing more than a Q/A dialog
 * This object is being observed by the Console !
 * @author John
 * @version 1.0
 */
public class Game extends Observable {

	public Game() {
		//
	}
	
	/**
	 * Starting game sequence
	 */
	public void startGame() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's up man ! Say your name");
		
		System.out.println("good job " + sc.nextLine());
		
		System.out.println("Game over ! - click enter now");
		
		// waiting user input :
		sc.hasNext();
		
		// Tell the others we finished !!
		this.setChanged();
		this.notifyObservers();
		
	}

	@Override
	public void addObserver(Observer obs) {
		
		super.addObserver(obs);
		System.out.println("Adding observer to Game class...");
		
		
	}

}
