package com.valtech.training;

import static org.junit.Assert.*;

import org.junit.Test;



public class ArithmeticImplTest {

	@Test
	public void testAdd() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(5, a.add(2, 3));
		assertEquals(5, a.add(3, 2));
		
	}

	@Test

	public void testSub() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(1, a.sub(3, 2));
		assertEquals(2, a.sub(5, 3));
	}
	
	@Test

	public void testmul() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(6, a.mul(3, 2));
		assertEquals(15, a.mul(5, 3));
	}
	
	@Test

	public void testdiv() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(1, a.div(3, 2));
		assertEquals(1, a.div(5, 3));
	}
}
