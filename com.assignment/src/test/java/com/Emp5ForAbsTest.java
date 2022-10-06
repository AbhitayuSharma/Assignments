package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp5ForAbsTest {
	@Test
	public void evaluatesExpression() {
		Emp5ForAbs e = new Emp5ForAbs();
		String name = e.name();
		int id = e.empid();
		assertEquals(105, id);
		assertEquals("Vaishnavi", name);
		
	}
}
