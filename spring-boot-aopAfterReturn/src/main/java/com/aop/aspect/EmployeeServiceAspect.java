package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

	//implementing after returning advice     
	@AfterReturning(pointcut="execution(* com.aop.service.EmployeeService.method1())",returning="marks")  
	public void AfterMethod(JoinPoint jp,int marks) {
	  
		System.out.println("EmployeeService excute Service class method =   "+jp.getSignature().getName());
		System.out.println("AfterReturning Excute AfterMethod object value  "+marks);
	}  
}