package com.springtutorial;

import org.aopalliance.intercept.Joinpoint;

public class AspectByXml {

	/**
	 * Advice to be executed before 
	 * com.springtutorial.Employee.setName(..)
	 */
	public void before() {
		System.out.println("Before setting employee details");
	}

	/**
	 * Advice to be executed after 
	 * com.springtutorial.Employee.setDateOfJoining(..)
	 */
	public void after() {
		System.out.println("After setting employee details");
	}

	/**
	 * Advice to be executed whenever exception
	 * occurs in any Employee class method execution
	 * com.springtutorial.Employee.*(..))
	 */
	public void inCaseOfException(Exception ex) {
		System.out.println("Exception thrown" + ex.toString());
	}

}
