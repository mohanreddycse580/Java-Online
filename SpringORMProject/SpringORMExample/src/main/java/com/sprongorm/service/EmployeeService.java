package com.sprongorm.service;

import com.sprongorm.bean.Employee;
import com.sprongorm.dao.EmployeeDAO;

public class EmployeeService {

	EmployeeDAO employeeDAO;

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.addEmployee(employee);
	}

}
