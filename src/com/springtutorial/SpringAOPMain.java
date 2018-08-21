package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPMain {
	
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		Employee emp = (Employee) context.getBean("employee");
		emp.setName("Latha");
		emp.setAge(25);
		emp.setExperience(4);
		emp.setDateOfJoining("05/10/2010");
		
		EmployeeService empService = (EmployeeService) context.getBean("employeeService");
		empService.setEmployee(emp);
		empService.printEmployeeDetails();
		
		Employee emp1 = (Employee) context.getBean("employee");
		emp1.setName("Cassy");
		emp1.setDateOfJoining("09/01");
		
		context.close();
			
	}
}