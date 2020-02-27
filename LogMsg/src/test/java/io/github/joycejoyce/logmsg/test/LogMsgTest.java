package io.github.joycejoyce.logmsg.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;

import io.github.joycejoyce.logmsg.LogMsg;
import uk.org.lidalia.slf4jtest.TestLogger;
import uk.org.lidalia.slf4jtest.TestLoggerFactory;

public class LogMsgTest {
	
	@Test
	public void testSl4jTest(){
		TestLogger logger = TestLoggerFactory.getTestLogger(LogMsg.class);
		
		LogMsg.loggingHelloWorld();
		assertTrue(logger.getLoggingEvents().get(0).getMessage().equals(LogMsg.HELLO_WORLD));
		
		TestLoggerFactory.clear();
	}
	
}
