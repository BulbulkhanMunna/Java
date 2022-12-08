package javaArray;

import java.util.Iterator;
import java.util.Scanner;

public class Adding_Diagonal_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int[][] A = new int[3][3];
		int sumOfDiagonalElements = 0;
		int sumOfUpperTriangleElements = 0;
		int sumOfLowerTriangleElements = 0;

		// Input Matrix
		System.out.print("Enter Matrix elements :");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				A[row][col] = input.nextInt();

			}

		}

		// Print A matrix
		System.out.print("A =");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print("\t" + A[row][col]);

			}
			System.out.println();

		}
		System.out.println();

		// Adding Diagonal,upperTriangle,lowerTriangle matrix elements
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {

				if (row == col) {
					sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];

				}

				if (row < col) {
					sumOfUpperTriangleElements = sumOfUpperTriangleElements + A[row][col];

				}

				if (row > col) {
					sumOfLowerTriangleElements = sumOfLowerTriangleElements + A[row][col];

				}

			}

		}

		System.out.println("Sum of diagonal elements : " + sumOfDiagonalElements);
		System.out.println("Sum of sumOfUpperTriangleElements elements : " + sumOfUpperTriangleElements);
		System.out.println("Sum of sumOfLowerTriangleElements elements : " + sumOfLowerTriangleElements);

	}

}
