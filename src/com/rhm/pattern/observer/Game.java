package com.rhm.pattern.observer;

import java.util.Scanner;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

/**
 * Demo class with nothing more than a Q/A dialog
 * This object is being observed by the Console !
 * @author John
 * @version 1.0
 */
public class Game implements Observable {

	public Game() {
		startGame();
	}
	
	/**
	 * Starting game sequence
	 */
	public void startGame() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's up man !");
		
		System.out.println("good job " + sc.nextLine());
		
		System.out.println("Game over ! - click enter now");
		
		// waiting user input :
		sc.hasNext();
		
	}

	@Override
	public void addListener(InvalidationListener arg0) {

			System.out.println("Adding listener to Game class...");
		
	}

	@Override
	public void removeListener(InvalidationListener arg0) {
		// TODO Auto-generated method stub
		
	}
}
