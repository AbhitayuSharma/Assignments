package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp3ForInterTest {
	@Test
	public void evaluatesExpression() {
		Emp3ForInter e = new Emp3ForInter();
		String name = e.name();
		int id = e.empid();
		assertEquals(103, id);
		assertEquals("Akshit", name);
		
	}
}
