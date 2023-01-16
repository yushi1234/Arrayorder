package Arrayorder;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter order of matrix");
			int n = sc.nextInt();
			int [] [] arrA = new int[n][n];
		     
			int [] [] arrB = new int[n][n];
		     
	        int [] [] result = new int[n][n];
	     for(int i = 0; i < n; i++)
	     {
	    	 for(int j = 0; j < n; j++)
	    	 {
	    		 System.out.println("Enter value of element for  Matrix A");
	    		 arrA[i][j] =sc.nextInt();
	    	 }
	     }
	    
	    	 
	    	  for(int i = 0; i < n; i++)
	  	     {
	  	    	 for(int j = 0; j < n; j++)
	  	    	 {
	  	    		 System.out.println("Enter value of element for  Matrix B");
	  	    		 arrB[i][j] = sc.nextInt();
	  	    	 }
	  	    	 
	  	     }
	  	    		 
	  	    
	  	       
	     for(int i = 0; i < n; i++)
	     {
	    	 for(int j = 0; j < n; j++)
	    	 {
	    		 
	    		 result[i][j] = arrA[i][j] + arrB[i][j];
	    	 }
	     }
	     
	     
	     
	       
	     for(int i = 0; i < n; i++)
	     {
	    	 for(int j = 0; j < n; j++)
	    	 {
	     
	      System.out.print(result [i][j] + " ");
	    		 
	    	 }
	    	 
	    	    System.out.println();
	    	 
	     }  	 
	}

}
