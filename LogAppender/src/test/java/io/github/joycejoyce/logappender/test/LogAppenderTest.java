package io.github.joycejoyce.logappender.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import io.github.joycejoyce.logappender.ClassThatLogs;
import io.github.joycejoyce.logappender.LoggerTestUtil;

public class LogAppenderTest {
	
	ListAppender<ILoggingEvent> logAppender;
	//ClassThatLogs myClass;
	
	@Before
	public void setup() {
	    logAppender = LoggerTestUtil.getLogAppenderForClass(ClassThatLogs.class);

	    //myClass = new ClassThatLogs();
	}
	
	@Test
	public void testLogAppender() {
		ClassThatLogs.loggingHelloWorld();
		
		assertTrue(logAppender.list.get(0).getMessage().equals(ClassThatLogs.HELLO_WORLD));
	}
}
