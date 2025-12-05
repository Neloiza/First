package com.mypackage;
/**
 * Head First Java, 3rd Edition (2022), p.102 - Bottles song game
 */
public class Demo {
	
	public static void bottlesSong() {
		int bottlesNum = 10;
		String word = "bottles";
		while (bottlesNum > 0) {
				System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
		System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
		System.out.println("And if one green bottle should accidentally fall,");
		bottlesNum = bottlesNum - 1;
		if (bottlesNum > 0) {
			if (bottlesNum == 1) {
				word = "bottle"; // singular, as in ONE bottle.
				}
		System.out.println("There'll be " + bottlesNum +	" green " + word + ", hanging on the wall");
		} else {
		System.out.println("There'll be no green bottles, hanging on the wall");
		} // end else
		} // end while loop
	}

	public static void main(String[] args) {
		//bottlesSong();
		new GuessGame().startGame();
	}

}
