package serviceimpl;

import java.util.ArrayList;
import java.util.List;

import model.Employee;
import service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> employeelist = new ArrayList<Employee>();
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeelist.add(employee);
		

	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeelist;
	}

}
