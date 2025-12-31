package com.mypackage;

/**
 * From Code Magnets Ch.1, 2 p. 112, 168
 */

class DrumKit {
	boolean topHat = true;
	boolean snare = true;

	void playSnare() {
		System.out.println("bang bang ba-bang");
	}

	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}

/*
 * p. 168 Need to get: bang bang ba-bang / ding ding da-ding
 */
class DrumKitTestDrive {
	public static void main(String[] args) {

		DrumKit d = new DrumKit();
		d.playSnare();
		d.snare = false;
		if (d.snare == true) {
			d.playSnare();
		}
		d.playTopHat();
	}
}

public class Shuffle1 {

	/*
	 * p. 112
	 */
	public static void main(String[] args) {
		int x = 3;
		while (x > 0) {
			if (x > 2) {
				System.out.print("a");
			}
			x = x - 1;
			System.out.print("-");
			if (x == 2) {
				System.out.print("b c");
			}
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
		}
	}
}
