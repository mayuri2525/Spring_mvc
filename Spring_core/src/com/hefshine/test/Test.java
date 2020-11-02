package com.hefshine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.util.Employee;

public class Test {
public static void main(String[] args) {
	ApplicationContext con= new ClassPathXmlApplicationContext("config.xml");
	Employee e=(Employee) con.getBean("e1");
	e.work();
	
	
}
}
