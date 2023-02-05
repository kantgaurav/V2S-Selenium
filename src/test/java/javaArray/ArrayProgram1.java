package javaArray;

import javax.print.attribute.standard.PrinterName;

public class ArrayProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 4, 1, 6, 2, 5 };

		// Print All the Number .Add All the Number , Reverse the Number . Find the
		// Average//

		/// Pair of two digit : which is equal to 6 ///

		// 2+4+1+6+2+5//
		// Size and Length//

		//System.out.println(a.length);

		for (int k = 0; k < a.length; k++) {

			System.out.println(" "+a[k]);
		}
		
		///display1();
		
		ArrayProgram1 ar1 = new ArrayProgram1();
		
		ar1.printName();
		
		ar1.display1();

	}
	
	
	public static void display1() {
		
		System.out.println("Function 1");
		
	}
	
	
	
	public void printName() {
		
	System.out.println("Name");	
		
	}
	
	
	// Recursion           // Factorial :   5 .  5*()   5 *4!      20 * 3!
	
	
	

	
	
}
