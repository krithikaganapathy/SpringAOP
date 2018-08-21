package com.springtutorial;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectByAnnotation {
	
	@Before("execution(* com.springtutorial.EmployeeService.setEmployee(..))")
	public void beforeSetEmployee() {
		System.out.println("Before Setting Employee");
	}
	
	@After("execution(* com.springtutorial.EmployeeService.setEmployee(..))")
	public void afterSetEmployee() {
		System.out.println("After Setting Employee");
	}
	
	@AfterReturning(pointcut = "execution(* com.springtutorial.Employee.getAge(..))", returning = "number")
	public void afterReturningAge(Integer number) {
		System.out.println("Advice after getAge()" + String.valueOf(number));
	}
	
	@Around("execution(* com.springtutorial.EmployeeService.printEmployeeDetails())")
	public void aroundPrintEmployee(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("Before printing employee details...");
		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After printing employee details...");
	}
	
	

}
