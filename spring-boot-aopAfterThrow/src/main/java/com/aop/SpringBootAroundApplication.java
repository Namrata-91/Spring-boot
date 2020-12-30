package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.aop.service.EmployeeService;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootAroundApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAroundApplication.class, args);
		// Fetching the employee object from the application context.
		EmployeeService obj = context.getBean(EmployeeService.class);
		obj.method();
		System.out.println("Execute application class ");
	}
}