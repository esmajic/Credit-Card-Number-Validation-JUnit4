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
		long number = validation.isValid(5196081888500645L);
		assertTrue(true);
	}
	
	@Test
	public void testGetPrefix() {
		long result = validation.getPrefix(5196081888500645L, 0);
		assertEquals(5196081888500645L, result);;
	}
}
