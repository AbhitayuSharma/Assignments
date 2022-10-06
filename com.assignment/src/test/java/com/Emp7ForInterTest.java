package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp7ForInterTest {
	@Test
	public void evaluatesExpression() {
		Emp7ForInter e = new Emp7ForInter();
		String name = e.name();
		int id = e.empid();
		assertEquals(107, id);
		assertEquals("Saynam", name);
		
	}
}
