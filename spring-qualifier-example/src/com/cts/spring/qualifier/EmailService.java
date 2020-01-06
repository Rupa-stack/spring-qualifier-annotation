package com.cts.spring.qualifier;

public class EmailService implements MessageService{

	@Override
	public void sendMessage() {
		System.out.println("EmailService implementation");
	}

}
