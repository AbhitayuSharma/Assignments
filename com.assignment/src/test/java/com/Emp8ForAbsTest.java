package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp8ForAbsTest {
	@Test
	public void evaluatesExpression() {
		Emp8ForAbs e = new Emp8ForAbs();
		int id = e.empid();
		String name = e.name();
		assertEquals(108, id);
		assertEquals("Shivam", name);
		
	}
}
