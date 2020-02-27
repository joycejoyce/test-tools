package io.github.joycejoyce.logappender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class ClassThatLogs 
{
    private static final Logger logger = LoggerFactory.getLogger(ClassThatLogs.class);
	public static final String HELLO_WORLD = "Hello World!";
	
	public static void main(String[] args) {
        System.out.println("Hello World!");
    }

	public static void loggingHelloWorld() {
		logger.info(HELLO_WORLD);
	}
}
