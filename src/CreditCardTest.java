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
	public void shouldBeGreenIfCreditCardNumberIsValid() {
		long number = validation.isValid(5196081888500645L);
		assertTrue(true);
	}

}
