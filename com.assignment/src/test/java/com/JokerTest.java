package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JokerTest {
	@Test
	public void evaluatesExpression() {
		Joker j = new Joker();
		String ans = j.dancing("Joker1", "Kuchipudi");
		assertEquals("Joker1 is Dancing Kuchipudi", ans);
		
	}
}
