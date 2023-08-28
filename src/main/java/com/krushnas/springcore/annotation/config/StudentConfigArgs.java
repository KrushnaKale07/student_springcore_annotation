package com.krushnas.springcore.annotation.config;

import org.springframework.context.annotation.Bean;

import com.krushnas.sprongcore.annotation.bean.StudentBeanArgs;

public class StudentConfigArgs {

	@Bean("student2")
	public StudentBeanArgs getStudent() {
		return new StudentBeanArgs(2,"Karan","karan@gmail.com");
	}
}
