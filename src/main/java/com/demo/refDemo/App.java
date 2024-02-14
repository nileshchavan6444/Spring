package com.demo.refDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		Student student = new Student();	
		
		Address address = new Address();
		List<String> subjects = new ArrayList<>();
		subjects.add("Math");
		subjects.add("English");
		subjects.add("Marathi");
		
		address.setHouseNo("123");
		address.setPinCode(412101);
		
		student.setId(111);
		student.setName("Nilesh");		
		student.setAddress(address);
		student.setSubject(subjects);
		System.out.println(student);
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("studentspring.xml");
	Student student1 = (Student)context.getBean("student");
	System.out.println("student1 ====== " + student1);
	}

}
