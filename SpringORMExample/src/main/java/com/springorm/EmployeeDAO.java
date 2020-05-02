package com.springorm;

import org.springframework.orm.hibernate3.HibernateTemplate;

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
