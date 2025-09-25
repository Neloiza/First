package com.mypackage;

public class PhraseOMatic {

	public static void main(String[] args) {
		
		int loopingTimes = 12;
		// make three sets of words to choose from.
		String[] wordListOne = {"agnostic", "opinionated",
		"voice activated", "haptically driven", "extensible",
		"reactive", "agent based", "functional", "AI enabled",
		"strongly typed", "design thinking"};
		
		String[] wordListTwo = {"loosely coupled", "six sigma",
		"asynchronous", "event driven", "pub-sub", "IoT", "cloud native",
		"service oriented", "containerized", "serverless",
		"microservices", "distributed ledger", "ERP"};
		
		String[] wordListThree = {"framework", "library",
		"DSL", "REST API", "repository", "pipeline", "service mesh",
		"architecture", "perspective", "design", "orientation", "machine learning"};
		
		// find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		System.out.println("Phrase-O-Matic: " + oneLength + " / " + twoLength + " / " + threeLength);
		int x = loopingTimes;
		int rand1, rand2, rand3;
		
		// to generate three random numbers
		java.util.Random randomGenerator = new java.util.Random();
		while (x > 0) {
		//not including the number that we give it
		rand1 = randomGenerator.nextInt(oneLength);		
		rand2 = randomGenerator.nextInt(twoLength);
		rand3 = randomGenerator.nextInt(threeLength);
		
		// now build and print out the phrase
		System.out.println(loopingTimes + 1 - x-- + ": What we need is a(an)... " + wordListOne[rand1] + " / " +
				wordListTwo[rand2] + " / " + wordListThree[rand3]);
		}
	}

}
