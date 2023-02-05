package practice_selenium;

import java.util.Scanner;

public class RemoveExtraWhiteSpacesBetweenWords{
	
	public static String removeExtraWhitespace(String str) {
		// Convert given string to a char array
		char[] c = str.toCharArray();
 
		// Output string variable
		String stringWithoutExtraWhitespaces = "";
 
		// For loop
		for (int i = 0; i < str.length(); i++) {
 
			// If current char is a whitespace, check for next char
			if (c[i] == ' ') {
				
				if(!(stringWithoutExtraWhitespaces.length()==0))
				{
					// Check if next char is a non space. If yes, append in existing string.
					if (c[i + 1] != ' ') {
						stringWithoutExtraWhitespaces = stringWithoutExtraWhitespaces + c[i];
					}
				}
				
				// Else append in new string stringWithoutExtraWhitespaces
				else
					stringWithoutExtraWhitespaces = stringWithoutExtraWhitespaces + c[i];
	 
			}
			
			//return stringWithoutExtraWhitespaces;
	 
		}
		return stringWithoutExtraWhitespaces;
	}
		public static void main(String[] args) {
	 
			// User input to trim spaces
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the string to trim extra whitespaces:");
	 
			String userInput = sc.nextLine();
	 
			sc.close();
	 
			System.out.println("You entered with spaces: \"" + userInput + "\"");
	 
			System.out.println("String after removing extra white space: \"" + removeExtraWhitespace(userInput) + "\"");
}
	}
