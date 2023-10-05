package com.Assignment.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Assignment.project.EmployeeService.EmployeeService;
import com.Assignment.project.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
 
	@Autowired
	private EmployeeService employeeService ;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping
	public String ceateEmployeesDetails(@RequestBody Employee employee){
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping
	public List<Employee> getAllEmployeesDetails()
	{
		return employeeService.getAllEmployee();		
	}
	
	@GetMapping("{employeeId}")
	public Employee getEmployeeDetails(@PathVariable String employeeId)
	{
		return employeeService.getEmployee(Long.parseLong(employeeId));
	}
	
	@PutMapping("{employeeId}")
	public String updateEmployeeDetails(@PathVariable String employeeId,@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(Long.parseLong(employeeId),employee);
	}
	
	@DeleteMapping("{employeeId}")
	public String deleteEmployeeDetails(@PathVariable String employeeId)
	{
		return employeeService.deleteEmployee(Long.parseLong(employeeId));
	}
	
}
