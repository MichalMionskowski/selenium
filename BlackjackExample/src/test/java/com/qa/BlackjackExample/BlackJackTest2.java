package com.qa.BlackjackExample;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BlackJackTest2 {

	@Parameters 
	public static List<Object[]> data(){
		return Arrays.asList(new Object[][] {{0,-10,-3},{0,-10,5},{0,-10,30},{0,-10,50},{4,3,4}});
	}
	
	private int expected;
	private int first;
	private int second;
	
	public  BlackJackTest2(int expected, int first , int second) {
		this.expected = expected;
		this.first = first;
		this.second = second;
	}
	
	@Test
	public void test() {
		Blackjack b = new Blackjack();
		assertEquals(expected, b.play(first, second));
	}
	
}
