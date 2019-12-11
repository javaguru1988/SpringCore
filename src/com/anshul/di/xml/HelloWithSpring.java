package com.anshul.di.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Spring container are three types
 * ApplicationContext is the spring container and its implementation class
 * 1. ClassPathXmlApplicationContext
 * 2. AnnotationConfigXmlApplicationContext
 * 3. GenericWebXmlApplicationContext
 * https://gist.github.com/darbyluv2code/cfb16c2fd1825a947d8faca3724b47a9
 * https://www.vogella.com/tutorials/Logging/article.html
 * we also may not able to see the red logging message due 
 * to change in the spring 5.1 * */
public class HelloWithSpring {
	public static void main(String[] args) {
		// laod the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve the bean from the spring container
		Coach coach = context.getBean("coach", Coach.class);
		// call the method on the bean
		System.out.println(coach.getDailyWorOut());
		// close the container
		context.close();
	}
}
