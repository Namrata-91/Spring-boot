# Spring Boot AOP
AOP (Aspect-Oriented Programming) is a programming pattern that increases modularity by allowing the separation of the cross-cutting concern. 
These cross-cutting concerns are different from the main business logic. We can add additional behavior to existing code without modification of the code itself.
Spring's AOP framework helps us to implement these cross-cutting concerns.

The cross-cutting concern can now be modularized into special classes, called aspect.

## AOP Terminology
## Aspect
An aspect is a module that encapsulates advice and pointcuts and provides crosscutting . We can implement an aspect using regular class annotated with @Aspect annotation.

## Pointcut
A pointcut is an expression that **selects one or more join points** where advice is 
executed. We can define pointcuts using **expressions or patterns**.
It works similarly to regular expressions, using the special syntax it matches methods 
with advices.

## Join point
A join point is a point in the **application** where we apply an **AOP aspect**
### Advice
The advice is an action that we take either **before or after** the method execution. The 
action is a piece of code that invokes during the program execution. There are five types of 
advices in the Spring AOP framework: before, after, after-returning, after-throwing, and around advice.


## Types of AOP Advices
There are five types of AOP advices are as follows:

* Before Advice
* After Advice
* Around Advice
* After Throwing
* After Returning

➢ Before - the advice functionality takes place **before the advised method is invoked**.

➢ After - the advice functionality takes place **after the advised method completes**.

➢ AfterReturning - returning the advice functionality takes place after **the advised 
method successfully completes**.

➢ AfterThrowing - throwing the advice functionality takes place after **the advised method 
throws an exception.**

➢ Around - the advice wraps the advised method, **providing some functionality before 
and after the advised method is invoked.**


**@EnableAspectJAutoProxy(proxyTargetClass=true)**
It enables support for handling components marked with AspectJ's @Aspect annotation. It is 
used with @Configuration annotation. We can control the type of proxy by using 
the **proxyTargetClass attribute**. Its default value is false.

**JoinPoint. getSignature()** method returns everything you need to get the actual class name, 
method name, return type and parameters for the joinpoint.
