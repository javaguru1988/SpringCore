package com.anshul.ioc;

public class MyApp {

	public static void main(String[] args) {
		 /*one of the best coding practice in java is coding to an interface
		 in this example coach interface will implemented by two classes
		  lies baseballcoach and tenniscoach which makes to work with any type 
		  of coach but its not configurable so to avoid this we will use spring 
		  IOC*/
		Coach coach = new TennisCoach();
		System.out.println(coach.getDailyWorOut());
		
		

	}

}
