package test5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class rolltest {
	Dice test5;
	@ Before
	public void setop(){
		test5 = new Dice();
	}


	@Test
	public void testrolletest(){
		int value = test5.roll();
		boolean result = value >=1 && value <=6;
		assertEquals(true,result);
	}
}


