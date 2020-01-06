package com.cts.spring.qualifier;

public class SMSService implements MessageService{
	@Override
	public void sendMessage() {
		System.out.println("SMSService implementation");
	}
}
