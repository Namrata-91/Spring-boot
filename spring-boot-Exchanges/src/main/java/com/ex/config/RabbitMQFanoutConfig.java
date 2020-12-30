/*
 * package com.ex.config;
 * 
 * import org.springframework.amqp.core.Binding; import
 * org.springframework.amqp.core.BindingBuilder; import
 * org.springframework.amqp.core.FanoutExchange; import
 * org.springframework.amqp.core.Queue; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * @Configuration public class RabbitMQFanoutConfig {
 * 
 * @Bean Queue windowsQueue() { return new Queue("windowsQueue", false); }
 * 
 * @Bean Queue linuxQueue() { return new Queue("linuxQueue", false); }
 * 
 * @Bean Queue macQueue() { return new Queue("macQueue", false); }
 * 
 * @Bean FanoutExchange exchange() { return new
 * FanoutExchange("fanout-exchange"); }
 * 
 * @Bean Binding windowsBinding(Queue windowsQueue, FanoutExchange exchange) {
 * return BindingBuilder.bind(windowsQueue).to(exchange); }
 * 
 * @Bean Binding linuxBinding(Queue linuxQueue, FanoutExchange exchange) {
 * return BindingBuilder.bind(linuxQueue).to(exchange); }
 * 
 * @Bean Binding macBinding(Queue macQueue, FanoutExchange exchange) { return
 * BindingBuilder.bind(macQueue).to(exchange); }
 * 
 * }
 */