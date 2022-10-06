package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp9ForAbsTest {
	@Test
	public void evaluatesExpression() {
		Emp9ForAbs e = new Emp9ForAbs();
		int id = e.empid();
		String name = e.name();
		assertEquals(109, id);
		assertEquals("Piyush", name);
		
	}
}
