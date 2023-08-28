package com.krushnas.springcore.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.krushnas.springcore.annotation.config.StudentConfigArgs;
import com.krushnas.sprongcore.annotation.bean.StudentBeanArgs;

public class StudentMainArgs {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfigArgs.class);
		StudentBeanArgs student2 = (StudentBeanArgs) context.getBean("student2");

		System.out.println(student2);
		((AnnotationConfigApplicationContext) context).close();

	}

}
