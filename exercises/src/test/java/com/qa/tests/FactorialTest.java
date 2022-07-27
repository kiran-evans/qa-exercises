package com.qa.tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.exercises.Runner;

public class FactorialTest {
	
	@Test
	public void testFactorials() {
		assertEquals("5!", Runner.factorials(120));
		assertEquals("Not factorial", Runner.factorials(150));
	}
}
