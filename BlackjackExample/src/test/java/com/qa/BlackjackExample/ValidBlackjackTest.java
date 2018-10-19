package com.qa.BlackjackExample;


import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ValidBlackjackTest {
	@Test
	public void test4() {
		Blackjack b = new Blackjack();
		assertEquals("valid entries",4,b.play(3, 4));
	}	
	@Test
	public void test5() {
		Blackjack b = new Blackjack();
		assertEquals("valid entries",5,b.play(5, 2));
	}	

	@Test
	public void test6() {
		Blackjack b = new Blackjack();
		assertEquals("valid entries",14,b.play(3, 14));
	}	
	@Test
	public void test7() {
		Blackjack b = new Blackjack();
		assertEquals("valid entries",15,b.play(15, 2));
	}	
}
