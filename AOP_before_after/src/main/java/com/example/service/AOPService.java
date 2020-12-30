package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.AOPModel;

@Service
public class AOPService {

	public AOPModel createEmployee(String name, int empId) {
		AOPModel emp = new AOPModel();
		emp.setName(name);
		emp.setEmpId(empId);
		return emp;
	}
	public void deleteEmployee(String empId) {
		System.out.println("delete emp name");
	}

}
