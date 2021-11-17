package b_Money;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	Currency SEK, DKK, NOK, EUR;
	Money SEK100, EUR10, SEK200, EUR20, SEK0, EUR0, SEKn100;
	
	@Before
	public void setUp() throws Exception {
		SEK = new Currency("SEK", 0.15);
		DKK = new Currency("DKK", 0.20);
		EUR = new Currency("EUR", 1.5);
		SEK100 = new Money(10000, SEK);
		EUR10 = new Money(1000, EUR);
		SEK200 = new Money(20000, SEK);
		EUR20 = new Money(2000, EUR);
		SEK0 = new Money(0, SEK);
		EUR0 = new Money(0, EUR);
		SEKn100 = new Money(-10000, SEK);
	}

	@Test
	public void testGetAmount() {
		assertEquals(20000, SEK200.getAmount(), 0);
	}

	@Test
	public void testGetCurrency() {
		assertEquals(EUR, EUR10.getCurrency());
		assertEquals(EUR, EUR10.getCurrency());
		assertEquals(SEK,SEK100.getCurrency());
		assertEquals(SEK,SEK200.getCurrency());
		assertEquals(EUR,EUR20.getCurrency());
	}

	@Test
	public void testToString() {
		System.out.println(EUR20);
	}

	@Test
	public void testGlobalValue() {
		//fail("Write test case here");
		assertEquals((int)(10000 * 0.15), SEK100.universalValue(), 0);
	}

	@Test
	public void testEqualsMoney() {
		//fail("Write test case here");
		Money eur = new Money(1000, EUR);
		assertTrue(EUR.equals(EUR10));
		assertTrue( SEK100.equals(EUR10));
	}

	@Test
	public void testAdd() {
		//fail("Write test case here");
		Money added = EUR10.add(SEK100);
		int sum = (int)((1000) + (10000 * 0.15 / 1.5));
		assertEquals(sum, added.getAmount(), 0);
	}

	@Test
	public void testSub() {
		//fail("Write test case here");
		Money subbed = SEK200.sub(SEK100);
		int res = (int) (20000 - 10000 * 0.15 / 0.15);
		assertEquals(res, subbed.getAmount(), 0);
	}

	@Test
	public void testIsZero() {
		//fail("Write test case here");
		assertTrue(EUR0.isZero());
		assertFalse("not 0 " ,SEK100.isZero());
	}

	@Test
	public void testNegate() {
		//fail("Write test case here")
		assertEquals(-1000, EUR10.negate().getAmount(), 0);
		assertEquals(Integer.valueOf(-0),SEK0.negate().getAmount());
		assertEquals(Integer.valueOf(-10000),SEK100.negate().getAmount());
		}

	@Test
	public void testCompareTo() {
		//fail("Write test case here");
		assertEquals("they should be more",-1, SEK100.compareTo(EUR20));
		assertEquals("they should be more",-1, EUR10.compareTo(SEK200));
	}
}
