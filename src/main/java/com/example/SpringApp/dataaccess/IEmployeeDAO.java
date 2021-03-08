package com.example.SpringApp.dataaccess;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringApp.entity.Employee;

public interface IEmployeeDAO extends CrudRepository<Employee, Integer> {

}
