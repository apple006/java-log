package com.zhiliao.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.util.ContextInitializer;

public class DemoReadConfig01 {
	
	public static void main(String[] args) {
		
		// 设置系统变量logback.configurationFile值  logback会读取该系统配置 后边源码解析会具体讲到这一块
		System.setProperty(ContextInitializer.CONFIG_FILE_PROPERTY, "config/logback01.xml");
		
		Logger logger = LoggerFactory.getLogger(DemoHelloword.class);
		logger.debug("Hello world.");
	
	}
}
