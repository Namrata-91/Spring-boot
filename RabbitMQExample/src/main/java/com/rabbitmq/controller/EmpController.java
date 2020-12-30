package com.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.model.EmpModel;
import com.rabbitmq.service.EmpSender;

@RestController
@RequestMapping(value = "/rabbit")
public class EmpController {
	
	@Autowired
	EmpSender rabbitMQSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName,@RequestParam("empId") int empId) {
	//Create employee object send to rabbitmq
	EmpModel emp=new EmpModel();
	emp.setEmpId(empId);
	emp.setEmpName(empName);
	rabbitMQSender.send(emp);
		return "Message sent to the RabbitMQ  Successfully";
	}

	
	
	
	

}
