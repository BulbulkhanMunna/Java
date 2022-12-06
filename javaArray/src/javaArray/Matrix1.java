package javaArray;

import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int [][] A = new int [2][3];
		int [][] B = new int [2][3];
		
		System.out.println("Enter numbers for A matrix : ");
		
		
		// getting input for A matrix
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.printf("A[%d][%d] = ",row,col);
				A [row][col] = input.nextInt();
				
			}
			
		}
		System.out.println();
		
		// getting input for B matrix
				System.out.println("Enter elements for B matrix :");
				
						for (int row = 0; row < 2; row++) {
							for (int col = 0; col < 3; col++) {
								System.out.printf("B[%d][%d] = ",row,col);
								B [row][col] = input.nextInt();
								
							}
							
						}
						System.out.println();
		
					// printing A matrix
					System.out.println("A = ");
					for (int row = 0; row < 2; row++) {
						for (int col = 0; col < 3; col++) {
							System.out.print(" "+ A[row][col]);
							
						}
						System.out.println();
						
					}
					
		
					    System.out.println();
					
					
					// printing B matrix
					System.out.println("B = ");
					for (int row = 0; row < 2; row++) {
						for (int col = 0; col < 3; col++) {
							System.out.print(" "+ B[row][col]);
							
						}
						System.out.println();
						
					}

	}

}
