package com.techchefs.springcore.beans;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import lombok.Data;

@Data
public class CourseBean {
	private int courseId;
	private String name;
	private String faculty;
}
