package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.mongo.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Employee save(@RequestBody Employee employee) {
		if(employee.getId()==null || employee.getId() == 0)
			employee.setId( ((int)employeeRepository.count())+1);
		return employeeRepository.save(employee);
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Employee update(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String update(@PathVariable Integer id) {
		 employeeRepository.deleteById(id);
		 return "Successfully deleted !!!";
	}
	

}
