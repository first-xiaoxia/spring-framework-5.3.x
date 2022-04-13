package com.nj;

import com.nj.selfEditor.Customer;
import com.nj.selfElement.ValueSet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-${userName}.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-bean-configuration.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:selfEditor.xml");
		System.out.println("启动spring了");
		Customer bean = context.getBean(Customer.class);
		System.out.println(bean);
	}
}
