package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
		
	public List<Employee> getAllEmployee();
	
}
