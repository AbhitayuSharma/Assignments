package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Emp1ForAbsTest {
	@Test
	public void evaluatesExpression() {
		Emp1ForAbs e = new Emp1ForAbs();
		int id = e.empid();
		String name = e.name();
		String dep = e.department();
		int phone = e.phoneno();
		assertEquals(101, id);
		assertEquals("Abhi", name);
		assertEquals("IT", dep);
		assertEquals(121212, phone);
		
	}

}
