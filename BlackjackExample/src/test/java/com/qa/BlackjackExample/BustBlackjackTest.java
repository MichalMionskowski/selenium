package com.qa.BlackjackExample;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BustBlackjackTest {
	@Test
	public void test7() {
		Blackjack b = new Blackjack();
		assertEquals("Bust entry",5,b.play(5, 30));
	}
	@Test
	public void test11() {
		Blackjack b = new Blackjack();
		assertEquals("Bust entry",0,b.play(25, 30));
	}	
	
	@Test
	public void test9() {
		Blackjack b = new Blackjack();
		assertEquals("Bust entry",2,b.play(25, 2));
	}	
	
}
