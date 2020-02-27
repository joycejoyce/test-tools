package io.github.joycejoyce.logmsg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogMsg 
{
	final static Logger logger = LoggerFactory.getLogger(LogMsg.class);
	public static final String HELLO_WORLD = "HELLO_WORLD";
	
	public static void main(String[] args) {
		loggingHelloWorld();
	}

	public static void loggingHelloWorld() {
		logger.info(HELLO_WORLD);
	}
    
}
