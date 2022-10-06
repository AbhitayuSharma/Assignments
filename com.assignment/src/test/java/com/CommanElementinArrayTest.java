package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommanElementinArrayTest {
	@Test
	public void evaluatesExpression() {
		CommanElementinArray cm = new CommanElementinArray();
		int ans = cm.same();
		assertEquals(2, ans);
		
	}
}
