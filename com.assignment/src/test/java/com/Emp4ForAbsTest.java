package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp4ForAbsTest {
	@Test
	public void evaluatesExpression() {
		Emp4ForAbs e = new Emp4ForAbs();
		int id = e.empid();
		String name = e.name();
		assertEquals(104, id);
		assertEquals("Akanksha", name);
		
	}
}
