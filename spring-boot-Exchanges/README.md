# RabbitMQ Implement Exchange Types
RabbitMQ we have the following types of Exchanges-
* Direct Exchange
* Fanout Exchange
* Topic Exchange
* Header Exchange

# Direct Exchange
Based on **the routing key a message is sent to the queue** having the **same routing key
specified in the binding rule.**

**The routing key of exchange and the binding queue have to be an exact match.**
A message is sent to exactly one queue.

# Fanout Exchange
The message is **routed to all the available bounded queues.**
The routing key if provided is **completely ignored.**

# Topic Exchange
Using regular expressions like wildcard we can send the exchange to **multiple bound queues.**

# Header Exchange
In this type of exchange the **routing queue is selected based on the criteria
specified in the headers instead of the routing key.**

This is similar to topic exchange type, but here we can specify complex criteria for
selecting routing queues.
