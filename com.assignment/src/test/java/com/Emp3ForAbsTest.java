package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp3ForAbsTest {
	@Test
	public void evaluatesExpression() {
		Emp3ForAbs e = new Emp3ForAbs();
		int id = e.empid();
		String name = e.name();
		assertEquals(103, id);
		assertEquals("Akshit", name);
		
	}
}
