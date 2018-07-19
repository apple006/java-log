package com.zhiliao.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 之 helloword
 *
 * @author zhangqh
 * @date 2018年7月19日
 */
public class DemoHelloword {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(DemoHelloword.class);
		logger.debug("Hello world.");

	}
}
