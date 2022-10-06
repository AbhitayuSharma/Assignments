package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp6ForAbsTest {
	@Test
	public void evaluatesExpression() {
		Emp6ForAbs e = new Emp6ForAbs();
		String name = e.name();
		int id = e.empid();
		assertEquals(106, id);
		assertEquals("Payal", name);
		
	}
}
