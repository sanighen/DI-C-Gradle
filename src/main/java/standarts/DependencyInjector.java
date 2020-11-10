package standarts;

import java.lang.reflect.Field;

import main.NumberProcessor;

public class DependencyInjector {

	public void resolve(NumberProcessor np, LoggerInterface logger) {

		Class<? extends NumberProcessor> classRef = np.getClass();

		Field[] fileds = classRef.getDeclaredFields();

		for (Field field : fileds) {
			if (field.getType().getName().equals(LoggerInterface.class.getName()))
				np.setLogger(logger);
		}

	}

}
