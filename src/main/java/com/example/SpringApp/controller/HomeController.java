package com.example.SpringApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringApp.entity.Employee;
import com.example.SpringApp.service.EmployeeService;

@RestController
public class HomeController {

	@Autowired
	private EmployeeService service;

	// @RequestMapping(value = "/hello", method = RequestMethod.GET)
	@GetMapping("/hello")
	public String greeting() {
		return "Hello World Ujwal";
	}

	/*
	 * @GetMapping("/emp/{id}") public Employee getEmployee(@PathVariable int id) {
	 * return new Employee(id, "ujwal", "ujwalthakre09@gmail.com"); }
	 */

	@GetMapping("/emp/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}

	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee e) {
		service.addEmployee(e);
	}

	@PutMapping("/employees/{id}")
	public void updateEmployee(@PathVariable int id, Employee e) {
		service.updateEmployee(id, e);
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
	}
}
