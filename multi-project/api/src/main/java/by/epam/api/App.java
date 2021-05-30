package by.epam.api;

import by.epam.core.IncorrectDataException;
import by.epam.core.Utils;

public class App {

	public static final String NUMBER_1 = "15";
	public static final String NUMBER_2 = "12";

	public static void main(String[] args) throws IncorrectDataException {
		System.out.println(Utils.isAllPositiveNumbers(NUMBER_1, NUMBER_2));
	}
}
