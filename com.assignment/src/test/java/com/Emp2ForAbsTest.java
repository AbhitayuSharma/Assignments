package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Emp2ForAbsTest {
	@Test
	public void evaluatesExpression() {
		Emp2ForAbs e = new Emp2ForAbs();
		int id = e.empid();String name = e.name();
		String dep = e.department();
		int phone = e.phoneno();
		assertEquals(102, id);
		assertEquals("Abhishek", name);
		assertEquals("IT", dep);
		assertEquals(121212, phone);
		
		
	}
}
