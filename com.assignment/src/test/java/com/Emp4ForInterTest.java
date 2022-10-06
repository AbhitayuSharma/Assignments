package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp4ForInterTest {
	@Test
	public void evaluatesExpression() {
		Emp4ForInter e = new Emp4ForInter();
		String name = e.name();
		int id = e.empid();
		assertEquals(104, id);
		assertEquals("Akanksha", name);
		
	}
}
