package log.utils;

import standarts.LoggerInterface;

public class ProxyLogger implements LoggerInterface {

	private LoggerInterface realLogger;

	public ProxyLogger(Class<?> loggerClass) {
		
	}

	@Override
	public void info(Object message) {
		if (realLogger == null) {
			realLogger = new ConsoleLogger();
			realLogger.info(message);
			realLogger = null;
		}
	}

}
