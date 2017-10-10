package test5;

import java.util.Random;

public class Dice {
	private Random rand;
	
	public Dice(){
		rand = new Random();
	}
	
	// roll the die and return the value (1-6)
	public int roll() {	
		int d = rand.nextInt(6)+1;
		return d;
	}

	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}

