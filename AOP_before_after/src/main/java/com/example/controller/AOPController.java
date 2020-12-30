package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AOPModel;
import com.example.service.AOPService;

@RestController
public class AOPController {

	@Autowired
	private AOPService employeeService;

	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)
	public AOPModel addEmployee(@RequestParam("name") String name, @RequestParam("empId") int empId) {
		return employeeService.createEmployee(name, empId);
	}

	@RequestMapping(value = "/remove/employee", method = RequestMethod.GET)
	public String removeEmployee(@RequestParam("empId") String empId) {
		employeeService.deleteEmployee(empId);
		return "Employee removed";
	}
}
