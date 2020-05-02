package com.sprongorm.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.sprongorm.bean.Employee;

public class EmployeeDAO {

	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	

	public HibernateTemplate getTemplate() {
		return template;
	}


	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		template.save(employee);
	}

}
