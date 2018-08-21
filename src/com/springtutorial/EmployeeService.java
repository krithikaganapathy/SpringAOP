package com.springtutorial;

public class EmployeeService {
	
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void printEmployeeDetails() {
		System.out.println("Printing Employee Details ::");
		System.out.println("Name ::" + employee.getName());
		System.out.println("Age ::" + employee.getAge());
		System.out.println("Experience ::" + employee.getExperience());
		System.out.println("DateOfJoining ::" + employee.getDateOfJoining());
	}

}
