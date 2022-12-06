package javaArray;

import java.util.Iterator;
import java.util.Scanner;

public class sum_average {

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
       
	}

}
