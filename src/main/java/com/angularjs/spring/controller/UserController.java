package com.angularjs.spring.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.angluarjs.spring.model.Employee;

/**
 * Handles requests for the Employee service.
 */
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String createEmployee(Model model) {
		return "home";
	}

	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmployees() {
		
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Lukman");
		emp.setCreatedDate(new Date());
		empList.add(emp);
		
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setName("Shareef");
		emp1.setCreatedDate(new Date());
		empList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(3);
		emp2.setName("Mohammad");
		emp2.setCreatedDate(new Date());
		empList.add(emp2);
		return empList;
	}
	

	
}
