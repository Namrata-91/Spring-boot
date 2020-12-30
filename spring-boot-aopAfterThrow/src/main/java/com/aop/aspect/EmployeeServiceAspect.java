package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

	// implementing after returning advice
	@AfterThrowing(pointcut = "execution(* com.aop.service.EmployeeService.method())", throwing = "error")
	public void AfterThrowingMethod(JoinPoint jp, Throwable error) {
		System.out.println("AfterThrowingMethod method running =   " + jp.getSignature().getName());
		System.out.println("Get error message...  " + error);
	}
}