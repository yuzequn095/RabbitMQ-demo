package com.spring.MQ;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
	@Autowired
	private AmqpTemplate rabbit;
	
	public void send(){
		String context = "hello" + new Date();
		this.rabbit.convertAndSend("test", context);
		System.out.println("Send: " + context);
	}
}
