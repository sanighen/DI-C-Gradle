package log.utils;

import standarts.LoggerInterface;

public class ConsoleLogger implements LoggerInterface{

	@Override
	public void info(Object message) {
		System.out.println("######################");
		System.out.println(message);
		System.out.println("######################");
	}
	
}
