package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp2ForInterTest {
	@Test
	public void evaluatesExpression() {
		Emp2ForInter e = new Emp2ForInter();
		int id = e.empid();
		String name = e.name();
		assertEquals(102, id);
		assertEquals("Abhishek", name);
		
	}
}
