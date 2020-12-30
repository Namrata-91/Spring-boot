package com.ex.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
@Configuration
public class RabbitMQHeaderConfig {

	
	@Bean
	Queue computerQueue() {
		return new Queue("computerQueue", false);
	}

	@Bean
	Queue mechenicalQueue() {
		return new Queue("mechenicalQueue", false);
	}

	@Bean
	Queue civilQueue() {
		return new Queue("civilQueue", false);
	}

	@Bean
	HeadersExchange headerExchange() {
		return new HeadersExchange("header-exchange");
	}
	
	@Bean
	Binding computerBinding(Queue computerQueue, HeadersExchange headerExchange) {
		return BindingBuilder.bind(computerQueue).to(headerExchange).where("department").matches("computer");
	}
	
	@Bean
	Binding mechenicalBinding(Queue mechenicalQueue, HeadersExchange headerExchange) {
		return BindingBuilder.bind(mechenicalQueue).to(headerExchange).where("department").matches("mechenical");
	}
	
	@Bean
	Binding civilBinding(Queue civilQueue, HeadersExchange headerExchange) {
		return BindingBuilder.bind(civilQueue).to(headerExchange).where("department").matches("civil");
	}
	
}
