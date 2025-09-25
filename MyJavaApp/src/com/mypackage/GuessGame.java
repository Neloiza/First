package com.mypackage;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	public void startGame() {
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		System.out.println("Number to guess is " + targetNumber);
		int attempts = 1;
		
		while (true) {
			System.out.println('\n' + "Attempt #" + attempts++ + ":");
			p1.guess();
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			p1isRight = guessp1 == targetNumber;
			
			p2.guess();
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			p2isRight = guessp2 == targetNumber;
			
			p3.guess();
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			p3isRight = guessp3 == targetNumber;
			
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println('\n' + "We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println('\n' + "Game is over");
				break;
			} else {
				System.out.println("Players will have to try again...");
			}
		}
	}
}
