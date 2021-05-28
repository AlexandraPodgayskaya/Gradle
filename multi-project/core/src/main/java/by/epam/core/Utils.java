package by.epam.core;

import java.util.Arrays;

import by.epam.util.StringUtils;

public final class Utils {

	private Utils() {
	}

	public static boolean isAllPositiveNumbers(String... str) {
		return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
	}
}
