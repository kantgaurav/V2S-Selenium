package practice_selenium;

import java.util.Random;

public class RandomEmailCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		String userName = "test";
	    String emailAdd= userName+randomInt+"@yopmail.com";
	    System.out.println(emailAdd);
		 

	}

}
