package com.zhiliao.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;

/**
 * logback 之 helloword
 *
 * @author zhangqh
 * @date 2018年7月19日
 */
public class Demo1 {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(Demo1.class);
		logger.debug("Hello world.");

		ch.qos.logback.classic.Logger rootLogger = (ch.qos.logback.classic.Logger) LoggerFactory
				.getLogger(Demo1.class);

		LoggerContext loggerContext = rootLogger.getLoggerContext();
		// we are not interested in auto-configuration
		loggerContext.reset();

		PatternLayoutEncoder encoder = new PatternLayoutEncoder();
		encoder.setContext(loggerContext);
		encoder.setPattern("%-5level [%thread]: %message%n");
		encoder.setOutputPatternAsHeader(true);
		encoder.start();

		ConsoleAppender<ILoggingEvent> appender = new ConsoleAppender<ILoggingEvent>();
		appender.setContext(loggerContext);
		appender.setEncoder(encoder);
		appender.start();

		rootLogger.addAppender(appender);

		rootLogger.debug("Message 1");
		rootLogger.warn("Message 2");

	}
}
