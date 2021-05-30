package by.epam.core;

import java.util.Arrays;

import by.epam.util.StringUtils;

public final class Utils {

	private Utils() {
	}

	public static boolean isAllPositiveNumbers(String... str) throws IncorrectDataException {
		if (str == null || str.length == 0) {
			throw new IncorrectDataException("incorrect data");
		}
		return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
	}
}
