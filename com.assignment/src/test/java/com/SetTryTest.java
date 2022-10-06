package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetTryTest {
	@Test
	public void evaluatesExpression() {
		SetTry st = new SetTry();
		int ans = st.lastelement();
		assertEquals(10, ans);
		
	}
}
