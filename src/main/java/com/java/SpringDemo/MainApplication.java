package com.java.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("uyhh");
		Shape c=(Traingle)context.getBean("shape");
		c.draw();
	}
}
