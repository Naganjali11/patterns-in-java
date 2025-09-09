package com.codegnan.patternexamples;

public class InverseDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int n = 7; // Diamond size

		        // Top half (including center row)
		        for (int i = 0; i < n; i++) {
		            // Left stars
		            for (int j = 0; j < n - i; j++) {
		                System.out.print("*");
		            }
		            // Spaces in the center (separated)
		            int spaceCount = 2 * i + 1;
		            for (int j = 0; j < spaceCount; j++) {
		                System.out.print(" ");
		            }
		            // Right stars
		            for (int j = 0; j < n - i; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		        // Bottom half
		        for (int i = n - 2; i >= 0; i--) {
		            // Left stars
		            for (int j = 0; j < n - i; j++) {
		                System.out.print("*");
		            }
		            // Spaces in the center (separated)
		            int spaceCount = 2 * i + 1;
		            for (int j = 0; j < spaceCount; j++) {
		                System.out.print(" ");
		            }
		            // Right stars
		            for (int j = 0; j < n - i; j++) {
		                System.out.print("*");
		            }
		            System.out.println();

		        }  

	}

}
