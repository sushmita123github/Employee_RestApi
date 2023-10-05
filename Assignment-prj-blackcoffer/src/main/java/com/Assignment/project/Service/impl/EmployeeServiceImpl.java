package com.Assignment.project.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.project.EmployeeService.EmployeeService;
import com.Assignment.project.model.Employee;
import com.Assignment.project.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public String createEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "success";
	}

	@Override
	public String updateEmployee(long employeeId,Employee employee) {
		Employee existing_employee=employeeRepository.getById(employeeId);
		existing_employee.setE_name(employee.getE_name());
		existing_employee.setE_phone(employee.getE_phone());
		existing_employee.setE_age(employee.getE_age());
		return "successfully updated";
	}

	@Override
	public String deleteEmployee(long employeeId) {
		employeeRepository.deleteById(employeeId);
		return "success";
	}

	@Override
	public Employee getEmployee(long employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	

	
}
