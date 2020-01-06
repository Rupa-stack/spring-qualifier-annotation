package com.cts.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor{

	private MessageService messageService;
	
	//setter based dependency injection
	@Autowired
	@Qualifier("TwitterService")
	public MessageService getMessageService() {
		return messageService;
	}


	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	//constructor based D.I
    @Autowired
	public MessageProcessorImpl(@Qualifier("TwitterService")MessageService messageService) {
		super();
		this.messageService = messageService;
	}


	@Override
	public void processMessage(String msg) {
		
		messageService.sendMessage(); //System.out.println(msg);
	}
	
	
}
