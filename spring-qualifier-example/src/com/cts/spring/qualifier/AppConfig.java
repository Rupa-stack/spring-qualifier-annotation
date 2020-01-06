package com.cts.spring.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cts.spring.qualifier")
public class AppConfig {
	
	@Bean(name="emailService")
	public MessageService emailService()
	{
		return new EmailService();
	}
	
	@Bean(name="twitterService")
	public MessageService twitterService()
	{
		return new TwitterService();
	}
	
	@Bean(name="smsService")
	public MessageService smsService()
	{
		return new SMSService();
	}
	
	@Bean
	public MessageProcessor messageProcessor()
	{
		return new MessageProcessorImpl(twitterService());
	}

}
