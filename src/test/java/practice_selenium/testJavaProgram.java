package practice_selenium;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import collectionProgram.ConvertLis_tStrToList_Int;

public class testJavaProgram {
	
	WebDriver driver= new ChromeDriver();
	//Default CONSTRCTRI=UCOT/.//
	
	//nO argument constructor// 
	
	//def
	
	StudentCla st = new StudentCla();// compiler// 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Actions act = new Actions(driver);
		
		String dt= "Credentials Professional : Profile Personal Health History : Covid Vaccination";
		
		
		String[] cc=RemoveSpecialCharFromString.returnStringArray(dt, ":")	;
		
		System.out.println(cc[1]);
		
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList("1", "2"));
		
		//ArrayList<String> al = new ArrayList<String>(myList);
		
		ConvertLis_tStrToList_Int.convertStrListToListInt(myList, Integer::parseInt);
		
		System.out.println("List of Integer: " + myList);
		
		
		
		
		//instant variable // object 
		//static : Class Variable // 
		// static block //
		//Default constructor 
		//
		
		//No parameter constructor , default contrctrutor 
//		String str = "Race";
//		
//		String str2 = "Care";
//		//static 
//		StudentCla st = new StudentCla();
//		StudentCla st1 = new StudentCla();
//	System.out.println(st);
//		
//		st.name = "Bishnu";
//		st1.name= "Badgu";
//		int z=st.setRollNumber(88);
//		System.out.println(z);
//		System.out.println(st.getRollNumber());
		///CHAR Length SAME:
		// CHNAGE to lowercase 
		//
		
	
		
	
		
		
		

	}

}
