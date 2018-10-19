package com.qa.BlackjackExample;

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class BlackjackExampleTest {

	static int x;
	@BeforeClass
	public static void before() {
		x=1;
		System.out.println("welcome to my tests");
	}

	@AfterClass
	public static void after() {
		System.out.println("tests are finished");
	}
	
	@Before
	public  void setup() {
		System.out.printf("test %d/17 have started started \n" , x);
	}
	
	@After
	public  void teardown() {
		System.out.printf("test %d/17 have started finished\n" , x);
		x ++;
	}
	
	@Test
	public void testy() {
		Blackjack b = new Blackjack();

	
		assertEquals("two invalid entries",0,b.play(-10, -3));

		
	}
	
	@Test
	public void test1() {
		Blackjack b = new Blackjack();
		assertEquals("invalid entry with a valid one",0,b.play(-10, 5));
	}
	
	@Test
	public void test2() {
		Blackjack b = new Blackjack();
		assertEquals("invalid entry with a valid one",0,b.play(-10, 30));
	}
	
	@Test
	public void test3() {
		Blackjack b = new Blackjack();
		assertEquals("two invalid entries",0,b.play(-10, 50));
	}
	
	
	@Test
	public void test4() {
		Blackjack b = new Blackjack();
		assertEquals("two valid entries",4,b.play(3, 4));
	}	
	@Test
	public void test5() {
		Blackjack b = new Blackjack();
		assertEquals("two valid entries",5,b.play(5, 2));
	}	
	@Test
	public void test6() {
		Blackjack b = new Blackjack();
		assertEquals("invalid entry with a valid one",0,b.play(5, -10));
	}	
	@Test
	public void test7() {
		Blackjack b = new Blackjack();
		assertEquals("invalid entry with a valid one",5,b.play(5, 30));
	}	
	@Test
	public void test8() {
		Blackjack b = new Blackjack();
		assertEquals("invalid entry with a valid one",0,b.play(5, 50));
	}
	

	@Test
	public void test9() {
		Blackjack b = new Blackjack();
		assertEquals("two valid entries",2,b.play(25, 2));
	}	
	
	@Test
	public void test10() {
		Blackjack b = new Blackjack();
		assertEquals("invalid entry with a valid one",0,b.play(25, -10));
	}	
	@Test
	public void test11() {
		Blackjack b = new Blackjack();
		assertEquals("invalid entry with a valid one",0,b.play(25, 30));
	}	
	@Test
	public void test12() {
		Blackjack b = new Blackjack();
		assertEquals("invalid entry with a valid one",0,b.play(25, 50));
	}


	@Test
	public void test13() {
		Blackjack b = new Blackjack();
		assertEquals("invalid entry with a valid one",0,b.play(50, 2));
	}	
	@Test
	public void test14() {
		Blackjack b = new Blackjack();
		assertEquals("invalid entry with a valid one",0,b.play(50, -30));
	}	
	@Test
	public void test15() {
		Blackjack b = new Blackjack();
		assertEquals("two invalid entries",0,b.play(50, -10));
	}	
	@Test
	public void test16() {
		Blackjack b = new Blackjack();
		assertEquals("two invalid entries",0,b.play(50, 60));
	}

}
