package com.valtech.training.simpleinterest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestImplTest {

	@Test
	public void test() {
		SimpleInterest si = new SimpleInterestImpl();
		assertEquals(12,si.computeInterest(600, 2, 1));
	}

}
