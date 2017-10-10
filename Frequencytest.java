package test5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Frequencytest {
	Dice test5;
	@ Before
	public void setop(){
		test5 = new Dice();
	}

	@Test
	public void testfrequencytest(){

		int V1=0, V2=0, V3=0, V4=0, V5=0, V6=0;
		// making an instance of dice
		Dice d = new Dice();
		for (int i = 1; i <= 60000; i++) {
			//	rolling the dice
			int r = d.roll();
			//	testing r (the face value) to increase the value of each counter.
			switch (r) {
			case 1: 
				V1++;
				break;
			case 2: 
				V2++;
				break;
			case 3: 
				V3++;
				break;
			case 4: 
				V4++;
				break;
			case 5: 
				V5++;
				break;
			case 6: 
				V6++;
				break;
			}
		}
// checking the faces counter are 10000
		boolean b1 = V1 >= 9600 && V1 <= 10400;
		boolean b2 = V2 >= 9600 && V2 <= 10400;
		boolean b3 = V3 >= 9600 && V3 <= 10400;
		boolean b4 = V4 >= 9600 && V4 <= 10400;
		boolean b5 = V5 >= 9600 && V5 <= 10400;
		boolean b6 = V6 >= 9600 && V6 <= 10400;
		
// checking if all the counters are 10000 with error +-400 
		boolean result = b1 && b2 && b3 && b4 && b5 && b6;
//		
		assertEquals(true, result);
	}

}







