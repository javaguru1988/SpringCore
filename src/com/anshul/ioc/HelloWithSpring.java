package com.anshul.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*Spring container are three types
 * ApplicationContext is the spring container and its implementation class
 * 1. ClassPathXmlApplicationContext
 * 2. AnnotationConfigXmlApplicationContext
 * 3. GenericWebXmlApplicationContext*/
public class HelloWithSpring {
	public static void main(String[] args) {
		// laod the spring configurable file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve the bean from the spring container
		Coach coach = context.getBean("coach", Coach.class);
		// call the method on the bean
		System.out.println(coach.getDailyWorOut());
		// close the container
	}
}
