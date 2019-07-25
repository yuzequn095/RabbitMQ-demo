package com.spring.MQ;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
public class HelloReceiver {
	@RabbitHandler
	public void process(String hello){
		System.out.println("Receiver: "  + hello);
	}
}
