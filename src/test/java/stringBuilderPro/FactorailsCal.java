package stringBuilderPro;

public class FactorailsCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans= returnFact(5);
				
				System.out.println(ans);

	}

	public static  int returnFact(int x) {
		
		int fact =0;
		while(x>1)
		{
	  System.out.println(x);
			
		fact = x * returnFact(x-1);
		  System.out.println(fact);
		 
		x--;
		}
		
		
		
		
		return fact;
	}
	
	

}
