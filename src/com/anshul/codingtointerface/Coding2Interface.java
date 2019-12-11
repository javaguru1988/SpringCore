package com.anshul.codingtointerface;

/*Here we make our code loosely coupled and 
 * coding2 an interface is the best software engineering practice 
 * and we also make our code compatible with any type of code */
public class Coding2Interface {
	public static void main(String[] args) {
		Coach coach = new BaseBallCoach();
		System.out.println(coach.getDailyWorOut());
	}
}
