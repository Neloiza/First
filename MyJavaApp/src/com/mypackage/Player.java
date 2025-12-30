package com.mypackage;
/**
 * The player for the Guess game p. 156
 */
public class Player {

	int number;
	public void guess() {
		number = (int) (Math.random() * 10);
	}
}
