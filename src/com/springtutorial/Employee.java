package com.springtutorial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	private Integer age;
	private String name;
	private Integer experience;
	private Date dateOfJoining;

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Integer getExperience() {
		return experience;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) throws ParseException {
		this.dateOfJoining = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfJoining);
	}


}
