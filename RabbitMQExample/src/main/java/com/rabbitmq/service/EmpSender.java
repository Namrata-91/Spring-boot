package com.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rabbitmq.model.EmpModel;

@Service
public class EmpSender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${code.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${code.rabbitmq.routingkey}")
	private String routingkey;
	
	public void send(EmpModel emp) {
		amqpTemplate.convertAndSend(exchange, routingkey, emp);
		System.out.println("Send msg = " + emp);
	    
	}
	

}
