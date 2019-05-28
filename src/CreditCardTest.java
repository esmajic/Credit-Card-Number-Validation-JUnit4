import static org.junit.Assert.*;
import org.junit.Test;

public class CreditCardTest {
	
	

	@Test
	public void testIsValid() {
		boolean condition = CreditCard.isValid(5196081888500645L);
		assertTrue(condition);
	}
	
	@Test
	public void testGetPrefix() {
		long result = CreditCard.getPrefix(5196081888500645L, 16);
		assertEquals(5196081888500645L, result);;
	}
	
	@Test
	public void testGetSize() {
		int result = CreditCard.getSize(5196081888500645L);
		assertEquals(16, result);
	}
	
	@Test
	public void testPrefixMatched() {
		boolean condition = CreditCard.prefixMatched(5196081888500645L, 16);
		assertFalse(condition);
	}
	
	@Test
	public void testSumOfOddPlace() {
		int result = CreditCard.sumOfOddPlace(5196081888500645L);
		assertEquals(42, result);
	}
	
	@Test
	public void testGetDigit() {
		int result = CreditCard.getDigit(8);
		assertEquals(8, result);
	}
	@Test
	public void testSumOfDoubleEvenPlace() {
		int result = CreditCard.sumOfDoubleEvenPlace(5196081888500645L);
		assertEquals(28, result);
	}
}
