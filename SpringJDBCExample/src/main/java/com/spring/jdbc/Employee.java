package com.spring.jdbc;

public class Employee {
	
	private  int enpNo;
	private String empName;
	private String empSalary;
	public int getEnpNo() {
		return enpNo;
	}
	public void setEnpNo(int enpNo) {
		this.enpNo = enpNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [enpNo=" + enpNo + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	public Employee(int enpNo, String empName, String empSalary) {
		super();
		this.enpNo = enpNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Employee() {
		super();
	}
	
	

}
