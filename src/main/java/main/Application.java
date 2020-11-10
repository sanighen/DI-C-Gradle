package main;

import log.utils.ConsoleLogger;
import log.utils.ProxyLogger;
import standarts.DependencyInjector;

public class Application {

	public static void main(String[] args) {

		NumberProcessor numberProcessor = new NumberProcessor();

		new DependencyInjector().resolve(numberProcessor, new ProxyLogger(ConsoleLogger.class));

		int res = numberProcessor.divide(10, 5);
		System.out.println(">>>>> " + res);
		res = numberProcessor.divide(11, 5);
		System.out.println(">>>>> " + res);
		res = numberProcessor.divide(10, 0);
		System.out.println(">>>>> " + res);
		

	}

}
