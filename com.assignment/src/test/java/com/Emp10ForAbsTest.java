package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp10ForAbsTest {
	@Test
	public void evaluatesExpression() {
		Emp10ForAbs e = new Emp10ForAbs();
		String name = e.name();
		int id = e.empid();
		assertEquals(110, id);
		assertEquals("Shubham", name);
		
	}
}
