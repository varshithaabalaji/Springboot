package com.var;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("classpath:BeanConfig.xml");
		PersonIntf person =(PersonIntf)ctx.getBean("person");
		person.showPersonDetails();
		((AbstractApplicationContext)ctx).close();
		

	}

}
