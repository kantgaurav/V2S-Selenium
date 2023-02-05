package stringBuilderPro;

import java.util.Scanner;

public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0, y=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		x = sc.nextInt();
		
		System.out.println("Enter Second Number: " );
		y=sc.nextInt();
		x = x+y;
		
		y=x-y;
		
		x =x-y;//x+y-x
		
		System.out.println(x);
		
		System.out.println(y);
		sc.close();
		
		
		
		

	}

}
