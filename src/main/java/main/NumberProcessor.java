package main;

import standarts.LoggerInterface;

public class NumberProcessor {

	private LoggerInterface logger;

	public int divide(int number, int divider) {

		if (divider == 0) {
			if (logger != null)
				// logger.info("number " + number + " division by zero!");
				logger.info(String.format("Number %d division by zero!", number));
			return 0;
		} else {

			if (number % divider != 0) {
				if (logger != null)
					// logger.info("number " + number + " divided by " + divider + " precision
					// loss");
					logger.info(String.format("Number %d divided by %d precision loss", number, divider));
			}
			return number / divider;
		}
	}

	public void setLogger(LoggerInterface logger) {
		this.logger = logger;
	}

}
