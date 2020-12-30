/*
 * package com.ex.config;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.amqp.core.Binding; import
 * org.springframework.amqp.core.BindingBuilder; import
 * org.springframework.amqp.core.Queue; import
 * org.springframework.amqp.core.TopicExchange; import
 * org.springframework.context.annotation.Bean;
 * 
 * @Configuration public class RabbitMQTopicConfig {
 * 
 * @Bean Queue adminQueue() { return new Queue("adminQueue", false); }
 * 
 * @Bean Queue userQueue() { return new Queue("userQueue", false); }
 * 
 * @Bean Queue customerQueue() { return new Queue("customerQueue", false); }
 * 
 * @Bean Queue allQueue() { return new Queue("allQueue", false); }
 * 
 * @Bean TopicExchange topicExchange() { return new
 * TopicExchange("topic-exchange"); }
 * 
 * @Bean Binding adminBinding(Queue adminQueue, TopicExchange topicExchange) {
 * return BindingBuilder.bind(adminQueue).to(topicExchange).with("queue.admin");
 * }
 * 
 * @Bean Binding userBinding(Queue userQueue, TopicExchange topicExchange) {
 * return BindingBuilder.bind(userQueue).to(topicExchange).with("queue.user"); }
 * 
 * @Bean Binding customerBinding(Queue customerQueue, TopicExchange
 * topicExchange) { return
 * BindingBuilder.bind(customerQueue).to(topicExchange).with("queue.customer");
 * }
 * 
 * @Bean Binding allBinding(Queue allQueue, TopicExchange topicExchange) {
 * return BindingBuilder.bind(allQueue).to(topicExchange).with("queue.*"); }
 * 
 * }
 */