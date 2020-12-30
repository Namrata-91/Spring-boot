package com.aop.service;

import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

	public String method() {
		System.out.println("Service Method execute ");
		String name=null;
		System.out.println(name.length());
		return "NullPointerException occurs";
		
	}
}