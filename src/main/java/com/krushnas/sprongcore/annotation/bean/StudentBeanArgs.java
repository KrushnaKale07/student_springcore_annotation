package com.krushnas.sprongcore.annotation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBeanArgs {

	int id;
	String name;
	String email;
}
