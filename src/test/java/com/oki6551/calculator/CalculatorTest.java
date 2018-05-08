package com.oki6551.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest{
	private Calculator calculator = new Calculator();
	/*
	*@Test
	*/
	public void testMul(){
		assertEquals(5, calculator.mul(2,3));
	}
}
