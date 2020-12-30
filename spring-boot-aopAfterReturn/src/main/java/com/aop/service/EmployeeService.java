package com.aop.service;

import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	public int method1() {
		System.out.println("Exam  method1 return ");
		return 30;
	}
}