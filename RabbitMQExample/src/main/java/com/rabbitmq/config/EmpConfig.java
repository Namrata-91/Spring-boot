package com.rabbitmq.config;

/*import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;*/

//import com.rabbitmq.client.AMQP.Queue;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class EmpConfig {
	@Value("${code.rabbitmq.queue}")
	String queueName;
	@Value("${code.rabbitmq.exchange}")
	String exchange;
	@Value("${code.rabbitmq.routingkey}")
	private String routingkey;
	//Create bean for queue
	@Bean
	Queue queue() {
		return new Queue(queueName, false);
	}

	//Create bean for exchange
	@Bean
	DirectExchange exchange() {
		return new DirectExchange(exchange);
	}

	//Binding  queue and exchange in routing key 
	@Bean
	Binding binding(Queue queue, DirectExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(routingkey);
	}

	
	//Create bean for MessageConverter before sending a message convert to JSON format
	@Bean
	public MessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	//Create AmqpTemplate use for sending a message
	public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(jsonMessageConverter());
		return rabbitTemplate;
	}
}
