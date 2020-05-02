package com.spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		// String query = "INSERT INTO EMP500 values(" + employee.getEnpNo() + ",'" +
		// employee.getEmpName() + "', '"
		// + employee.getEmpSalary() + "')";
		String insertQuery = "INSERT INTO EMP500(EMPNO,EMPNAME,EMPSALARY) values(?,?,?)";
		return jdbcTemplate.update(insertQuery, employee.getEnpNo(), employee.getEmpName(), employee.getEmpSalary());

	}

	public int updateEmployee(Employee employeeupdate) {
		// TODO Auto-generated method stub
		String updateQuery = " UPDATE EMP500 set EMPNAME=?, EMPSALARY=? WHERE EMPNO=?";
		return jdbcTemplate.update(updateQuery, employeeupdate.getEmpName(), employeeupdate.getEmpSalary(),
				employeeupdate.getEnpNo());
	}

	public int deleteEmployee(int empNo) {
		// TODO Auto-generated method stub

		String deleteQuery = "DELETE from EMP500 where EMPNO=?";

		return jdbcTemplate.update(deleteQuery, empNo);

	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		String query = "SELECT  * FROM  EMP500";
		return jdbcTemplate.query(query, new EmployeeRowMapper());
	}

	public Employee findOne(int empNo) {
		// TODO Auto-generated method stub

		String query = "SELECT *  FROM EMP500 where EMPNO='" + empNo + "'";

		return jdbcTemplate.queryForObject(query, new EmployeeRowMapper());

	}

}
