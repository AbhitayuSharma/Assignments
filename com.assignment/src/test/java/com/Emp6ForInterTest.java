package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp6ForInterTest {
	@Test
	public void evaluatesExpression() {
		Emp6ForInter e = new Emp6ForInter();
		int id = e.empid();
		String name = e.name();
		assertEquals(106, id);
		assertEquals("Payal", name);
		
	}
}
