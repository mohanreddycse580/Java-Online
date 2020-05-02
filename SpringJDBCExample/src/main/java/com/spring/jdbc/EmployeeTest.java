package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDAO empDao = (EmployeeDAO) context.getBean("employeDao");

		// Insert
		/*
		 * Employee employee1=new Employee(100,"Mohan","10000"); Employee employee2=new
		 * Employee(101,"Ramesh","20000"); Employee employee3=new
		 * Employee(102,"Raju","30000"); Employee employee4=new
		 * Employee(103,"Krishna","40000");
		 * 
		 * empDao.saveEmployee(employee1); empDao.saveEmployee(employee2);
		 * empDao.saveEmployee(employee3); empDao.saveEmployee(employee4);
		 */

		// Update
		Employee employeeupdate = new Employee(101, "MohanReddy", "50000");
		int updatedRecords = empDao.updateEmployee(employeeupdate);
		System.out.println("Updated Records :" + updatedRecords);

		// Delete
		int deleteRecords = empDao.deleteEmployee(101);
		System.out.println("Delete Records :" + deleteRecords);

		// Select All Objects
		List<Employee> employeeList = empDao.findAll();
		System.out.println(employeeList);

		//
		Employee employee = empDao.findOne(100);
		System.out.println(employee);

	}

}
