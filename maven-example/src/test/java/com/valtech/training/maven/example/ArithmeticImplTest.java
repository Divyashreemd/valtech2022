package com.valtech.training.maven.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticImplTest {

	@Test
	public void testAdd() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(5, a.add(2, 3));
		assertEquals(5, a.add(3, 2));
		assertEquals(3, a.add(0, 3));
		assertEquals(3, a.add(3, 0));
		assertEquals(5, a.add(-2, 7));
		assertEquals(5, a.add(7, -2));
		assertEquals(0, a.add(0, 0));
	}

	@Test

	public void testSub() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(1, a.sub(3, 2));
		assertEquals(2, a.sub(5, 3));
		assertEquals(3, a.sub(3, 0));
		assertEquals(9, a.sub(7, -2));
		assertEquals(0, a.sub(0, 0));
	}

	@Test

	public void testmul() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(6, a.mul(3, 2));
		assertEquals(15, a.mul(5, 3));
		assertEquals(0, a.mul(3, 0));
		assertEquals(-14, a.mul(7, -2));
		assertEquals(0, a.mul(0, 0));
	}
    
	@Test

	public void testdiv() {
		Arithmetic a = new ArithmeticImpl();
		assertEquals(3, a.div(6,2));
		assertEquals(5, a.div(15, 3));
		assertEquals(5, a.div(20,4));
		assertEquals(4, a.div(8, 2));
		assertEquals(8, a.div(32, 4));
		try {
			a.div(3, 0);
			fail("AirthmeticException was expected with '/ by zero'");
		}catch(ArithmeticException  ae) {
			
		}
	}

}
