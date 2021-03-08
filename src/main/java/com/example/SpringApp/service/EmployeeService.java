package com.example.SpringApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringApp.dataaccess.IEmployeeDAO;
import com.example.SpringApp.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private IEmployeeDAO repo;

	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}

	public void addEmployee(Employee e) {
		repo.save(e);
	}

	public void updateEmployee(int id, Employee e) {
		repo.save(e);
	}

	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}
}
