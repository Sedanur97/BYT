package b_Money;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankTest {
	Currency SEK, DKK;
	Bank SweBank, Nordea, DanskeBank;
	
	@Before
	public void setUp() throws Exception {
		DKK = new Currency("DKK", 0.20);
		SEK = new Currency("SEK", 0.15);
		SweBank = new Bank("SweBank", SEK);
		Nordea = new Bank("Nordea", SEK);
		DanskeBank = new Bank("DanskeBank", DKK);
		SweBank.openAccount("Ulrika");
		SweBank.openAccount("Bob");
		Nordea.openAccount("Bob");
		DanskeBank.openAccount("Gertrud");
	}

	@Test
	public void testGetName() {
	
		assertEquals("Nordea",Nordea.getName());
		assertEquals("DanskeBank",DanskeBank.getName());
		assertEquals("SweBank", SweBank.getName());
	}

	@Test
	public void testGetCurrency() {
		assertEquals(DKK, DanskeBank.getCurrency());
		assertEquals(SEK,SweBank.getCurrency());
		assertEquals(SEK,Nordea.getCurrency());
	}

	@Test(expected=AccountExistsException.class)
	
	public void testOpenAccount() throws AccountExistsException, AccountDoesNotExistException {
		fail("Write test case here");
	}

	@Test
	public void testDeposit() throws AccountDoesNotExistException {
		SweBank.deposit("Bob", new Money(1000, SEK));
		assertEquals(1000, SweBank.getBalance("Bob"), 0);
	}

	@Test
	public void testWithdraw() throws AccountDoesNotExistException {
		SweBank.withdraw("Bob", new Money(1000, SEK));
		assertEquals(-1000, SweBank.getBalance("Bob"), 0);
	}
	
	@Test
	public void testGetBalance() throws AccountDoesNotExistException {
		assertEquals(0, SweBank.getBalance("Bob"), 0);
	}
	
	@Test
	public void testTransfer() throws AccountDoesNotExistException {
		SweBank.deposit("Bob", new Money(1000, SEK));
		SweBank.transfer("Bob", "Ulrika", new Money(500, SEK));
		assertEquals(500, SweBank.getBalance("Bob"), 0);
		assertEquals(500, SweBank.getBalance("Ulrika"), 0);

		SweBank.transfer("Bob", DanskeBank , "Gertrud", new Money(500, SEK));
		assertEquals(0, SweBank.getBalance("Bob"), 0);
		assertEquals((int) (500 * 0.15 / 0.20), DanskeBank .getBalance("Gertrud"), 0);
	//added. and fixed
	}
	
	@Test
	public void testTimedPayment() throws AccountDoesNotExistException {
		SweBank.deposit("Bob", new Money(1000, SEK));
		SweBank.addTimedPayment("Bob", "1", 2, 0, new Money(1000, SEK), SweBank, "Ulrika");
		SweBank.tick();

		assertEquals(0, SweBank.getBalance("Bob"), 0);
		assertEquals(1000, SweBank.getBalance("Ulrika"), 0);
	}
}
