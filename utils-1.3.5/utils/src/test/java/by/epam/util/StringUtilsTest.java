package by.epam.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	public static final String NUMBER = "134";

	@Test
	public void testIsPositiveNumber() {
		Assertions.assertTrue(StringUtils.isPositiveNumber(NUMBER));
	}
}
