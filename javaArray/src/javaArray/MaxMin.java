package javaArray;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	       
	       double [] number = new double[5];
	       double sum = 0;
	       System.out.print("Please enter 5 numbers : ");
	       
	       for (int i = 0; i < 5; i++) {
	    	    number[i] = input.nextDouble();
			
		}
	       
	       for (int i = 0; i < 5; i++) {
	    	   sum = sum + number[i];
	    	
			
		}
	       
	       System.out.println("The sum is : "+sum);
	       System.out.println("The avarage is : "+sum /number.length);
	       
	       double max = number[0];
	       double min = number[0];
	       
	       for (int i = 0; i < number.length; i++) {
	    	   if (max<number[i]) {
	    		   max = number[i];
				
			}
	    	   if (min >number[i]) {
	    		   min = number[i];
				
			}
			
		}
	       
	       System.out.println("Maximum number = "+max);
	       System.out.println("Minimum number = "+min);

	}

}
