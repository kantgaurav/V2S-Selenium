package practice_selenium;

import java.util.Random;

public class RandomFirstName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random();
	    String firstname = "James";
	    String lastname = "Bond";

	    String result;

	    result = Character.toString(firstname.charAt(0)); // First char
	    if (lastname.length() > 5)
	      result += lastname.substring(0, 5);
	    else
	      result += lastname;
	    result += Integer.toString(rnd.nextInt(99));
	    System.out.println(result);
	}

}
