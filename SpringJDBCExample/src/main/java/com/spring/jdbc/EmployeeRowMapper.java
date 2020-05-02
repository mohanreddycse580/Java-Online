package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setEnpNo(rs.getInt(1));
		employee.setEmpName(rs.getString(2));
		employee.setEmpSalary(rs.getString(3));
		return employee;
	}

}
