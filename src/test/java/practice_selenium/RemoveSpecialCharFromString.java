package practice_selenium;

public class RemoveSpecialCharFromString {
	
	
public static String[] returnStringArray(String str, String specialChar) {
	
	
	
	String[] newVal= null;

	if(specialChar.contentEquals(":")) {


		newVal= str.split("\\:");

	}else {
		
		if(specialChar.contentEquals(",")) {


			newVal= str.split(",");
			
		}
		
		else {
			
			if(specialChar.contentEquals(".")) {


				newVal= str.split(".");
				
			}
			
		}
	}

	return newVal;

}
}
