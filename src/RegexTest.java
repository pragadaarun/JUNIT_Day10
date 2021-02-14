import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RegexTest {

	@Test
	public void checkFirstNameTestShouldReturnTrue() {
		
		boolean result = Regex.userFirstNameRegex();
		assertEquals(true, result);
	}
	
	@Test
	public void checkFirstNameTestShouldReturnFalse() {
		
		boolean result = Regex.userFirstNameRegex();
		assertEquals(false, result);
	}
	@Test
	public void checkLastNameTestShouldReturntrue()
	{
		boolean result = Regex.userLastNameRegex();
		assertEquals(true, result);

	}
	@Test
	public void checkLastNameTestShouldReturnFalse() {
		
		boolean result = Regex.userLastNameRegex();
		assertEquals(false, result);
	}
	
	@Test
    public void checkEmailTestShouldReturnTrue()
	{
		boolean result = Regex.userEmailRegex();
		assertEquals(true, result);

	}
	@Test
	public void checkEmailTestShouldReturnFalse() {
		
		boolean result = Regex.userEmailRegex();
		assertEquals(false, result);
	}

	
	@Test
	public void checkPhoneNumberTestShouldReturnTrue()
	{
		boolean result = Regex.userPhoneNumberRegex();
		assertEquals(true, result);

	}
	@Test
	public void isCheckPhoneNumberTestShouldReturnFalse() {
		
		boolean result = Regex.userPhoneNumberRegex();
		assertEquals(false, result);
	}

	@Test
	public void checkPasswordTestShouldReturnTrue()
	{
		boolean result = Regex.userPasswordRegex();
		assertEquals(true, result);

	}
	@Test
	public void checkPasswordTestShouldReturnFalse() {
		
		boolean result = Regex.userPasswordRegex();
		assertEquals(false, result);
	}


}