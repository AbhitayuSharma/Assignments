package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp1ForInterTest {
	@Test
	public void evaluatesExpression() {
		Emp1ForInter e = new Emp1ForInter();
		int id = e.empid();
		String name = e.name();
		assertEquals(101, id);
		assertEquals("Abhishek", name);
		
	}
}
