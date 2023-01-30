package com.BikkadIT.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = classPathXmlApplicationContext.getBean("stu",Student.class);
		
		System.out.println(student);
		

	}
}
