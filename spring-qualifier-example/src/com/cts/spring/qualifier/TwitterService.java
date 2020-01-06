package com.cts.spring.qualifier;

public class TwitterService implements MessageService{
	@Override
	public void sendMessage() {
		System.out.println("TwitterService implementation");
	}

}
