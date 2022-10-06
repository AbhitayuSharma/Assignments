package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp8ForInterTest {
	@Test
	public void evaluatesExpression() {
		Emp8ForInter e = new Emp8ForInter();
		String name = e.name();
		int id = e.empid();
		assertEquals(108, id);
		assertEquals("Shivam", name);
		
	}
}
