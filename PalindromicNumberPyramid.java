package com.codegnan.patternexamples;

public class PalindromicNumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4; // number of rows

        for (int i = 1; i <= n; i++) {
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Move to next line
            System.out.println();
        }

	}

}
