package by.epam.util;

import org.apache.commons.lang3.math.NumberUtils;

public final class StringUtils {

	private StringUtils() {
	}

	public static boolean isPositiveNumber(String number) {
		if (!NumberUtils.isCreatable(number)) {
			return false;
		}
		Number num = NumberUtils.createNumber(number);
		return num.doubleValue() > 0;
	}
}
