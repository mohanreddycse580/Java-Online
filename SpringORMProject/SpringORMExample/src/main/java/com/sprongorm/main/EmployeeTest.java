package com.sprongorm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sprongorm.bean.Employee;
import com.sprongorm.service.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeService employeeService = (EmployeeService) context.getBean("empService");
		
		// CURD operations
		Employee employee = new Employee();
		employee.setEmpNo(100);
		employee.setEmpName("Laxmi");

		employeeService.addEmployee(employee);

	}

}
