package com.krushnas.springcore.annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.krushnas.springcore.annotation.config.StudentConfig;
import com.krushnas.sprongcore.annotation.bean.StudentBean;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentBean student1 = context.getBean(StudentBean.class);

		System.out.println(student1);
		((AnnotationConfigApplicationContext) context).close();
	}
}
