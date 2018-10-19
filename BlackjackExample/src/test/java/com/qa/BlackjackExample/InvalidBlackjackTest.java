package com.qa.BlackjackExample;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class InvalidBlackjackTest {
	
	
	@Test
	public void testy() {
		Blackjack b = new Blackjack();	
		assertEquals("an invalid entry",0,b.play(-10, -3));	
	}
	@Test
	public void test2() {
		Blackjack b = new Blackjack();
		assertEquals("an invalid entry",0,b.play(-10, 30));
	}
	
	@Test
	public void test3() {
		Blackjack b = new Blackjack();
		assertEquals("an invalid entry",0,b.play(-10, 50));
	}
	
	@Test
	public void test6() {
		Blackjack b = new Blackjack();
		assertEquals("an invalid entry",0,b.play(5, -10));
	}	
	@Test
	public void test8() {
		Blackjack b = new Blackjack();
		assertEquals("an invalid entry",0,b.play(5, 50));
	}
	
	@Test
	public void test10() {
		Blackjack b = new Blackjack();
		assertEquals("an invalid entry",0,b.play(25, -10));
	}	
	@Test
	public void test12() {
		Blackjack b = new Blackjack();
		assertEquals("an invalid entry",0,b.play(25, 50));
	}

	@Test
	public void test13() {
		Blackjack b = new Blackjack();
		assertEquals("an invalid entry",0,b.play(50, 2));
	}	
	
	@Test
	public void test14() {
		Blackjack b = new Blackjack();
		assertEquals("an invalid entry",0,b.play(50, -30));
	}	
	@Test
	public void test15() {
		Blackjack b = new Blackjack();
		assertEquals("an invalid entry",0,b.play(50, -10));
	}	
	@Test
	public void test16() {
		Blackjack b = new Blackjack();
		assertEquals("an invalid entry",0,b.play(50, 60));
	}
}
