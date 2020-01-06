package com.cts.spring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageProcessor userService = context.getBean(MessageProcessor.class);
		userService.processMessage("Twitter message sending");
	}

}
