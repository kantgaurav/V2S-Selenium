package stringBuilderPro;

public class TwoDimensionArr {

	public static void main(String args[]) {
		 int i,j,k=0;

	       int a[][]=new int[2][3];                                                        
	     
	        for(i=0;i<2;i++)
	        {
	           for(j=0;j<3;j++)
	           {
	               a[i][j]=k;
	               k++;
	               System.out.print(a[i][j]+ " ");
	           }
	          System.out.println();
	      }

	    }
}

