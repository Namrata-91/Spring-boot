/*
 * package com.ex.config;
 * 
 * import org.springframework.amqp.core.Binding; import
 * org.springframework.amqp.core.BindingBuilder; import
 * org.springframework.amqp.core.DirectExchange; import
 * org.springframework.amqp.core.Queue; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * @Configuration public class RabbitMQDirectConfig {
 * 
 * @Bean Queue bookQueue() { return new Queue("bookQueue", false); }
 * 
 * @Bean Queue libraryQueue() { return new Queue("libraryQueue", false); }
 * 
 * @Bean Queue shopQueue() { return new Queue("shopQueue", false); }
 * 
 * @Bean DirectExchange exchange() { return new
 * DirectExchange("direct-exchange"); }
 * 
 * @Bean Binding bookBinding(Queue bookQueue, DirectExchange exchange) { return
 * BindingBuilder.bind(bookQueue).to(exchange).with("book"); }
 * 
 * @Bean Binding libraryBinding(Queue libraryQueue, DirectExchange exchange) {
 * return BindingBuilder.bind(libraryQueue).to(exchange).with("library"); }
 * 
 * @Bean Binding shopBinding(Queue shopQueue, DirectExchange exchange) { return
 * BindingBuilder.bind(shopQueue).to(exchange).with("shop"); }
 * 
 * }
 */