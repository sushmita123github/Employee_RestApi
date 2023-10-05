package com.Assignment.project.EmployeeService;

import java.util.List;

import com.Assignment.project.model.Employee;

public interface EmployeeService {

	public String createEmployee(Employee employee);
	public String updateEmployee(long employeeId,Employee employee);
	public String deleteEmployee(long employeeId);
	public Employee getEmployee(long employeeId);
	public List<Employee> getAllEmployee();
	
}