package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp5ForInterTest {
	@Test
	public void evaluatesExpression() {
		Emp5ForInter e = new Emp5ForInter();
		int id = e.empid();
		String name = e.name();
		assertEquals(105, id);
		assertEquals("Vaishnavi", name);
		
	}
}
