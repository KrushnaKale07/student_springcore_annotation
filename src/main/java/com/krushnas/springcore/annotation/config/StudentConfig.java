package com.krushnas.springcore.annotation.config;

import org.springframework.context.annotation.Bean;

import com.krushnas.sprongcore.annotation.bean.StudentBean;

public class StudentConfig {

	@Bean // Method level annotation
	public StudentBean getStudent() {
		StudentBean student1 = new StudentBean();
		student1.setId(1);
		student1.setName("Ajay");
		student1.setEmail("ajay@yahoo.com");
		return student1;
	}
}
