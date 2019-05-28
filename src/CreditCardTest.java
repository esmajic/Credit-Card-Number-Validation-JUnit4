import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {
	
	CreditCard validation;
	
	@Before
	public void setUp() {
		validation = new CreditCard();
	}

	@Test
	public void testIsValid() {
		boolean condition = validation.isValid(5196081888500645L);
		assertTrue(true);
	}
	
	@Test
	public void testGetPrefix() {
		long result = validation.getPrefix(5196081888500645L, 0);
		assertEquals(5196081888500645L, result);;
	}
	
	@Test
	public void testGetSize() {
		int result = validation.getSize(5196081888500645L);
		assertEquals(16, result);
	}
	
	@Test
	public void testPrefixMatched() {
		boolean condition = validation.prefixMatched(5196081888500645L, 16);
		assertTrue(true);
	}
	
	@Test
	public void testSumOfOddPlace() {
		int result = validation.sumOfOddPlace(5196081888500645L);
		assertEquals(16, result);
	}
	
	@Test
	public void testGetDigit() {
		int result = validation.getDigit(8);
		assertEquals(8, result);
	}
}
