package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDAO empDAO = (EmployeeDAO) context.getBean("empDao");

		// CURD operations
		Employee employee = new Employee();
		employee.setEmpNo(100);
		employee.setEmpName("Laxmi");

		empDAO.addEmployee(employee);

	}

}
