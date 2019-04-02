package com.github.jitpack;

import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;

public class CalcTest extends TestCase {

	Calcul calc;
	
	protected void setUp() throws Exception {
		super.setUp();
		calc = new Calcul();
		
	}
	
	public void test (){
		
		assertTrue(calc.calcul(5, 4)==20);
		
	}

}
