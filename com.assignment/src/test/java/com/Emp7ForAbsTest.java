package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp7ForAbsTest {
	@Test
	public void evaluatesExpression() {
		Emp7ForAbs e = new Emp7ForAbs();
		int id = e.empid();
		String name = e.name();
		assertEquals(107, id);
		assertEquals("Saynam", name);
		
	}
}
