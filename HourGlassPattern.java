package com.codegnan.patternexamples;

public class HourGlassPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;  // size of the hourglass (should be odd for symmetry)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print stars on the boundary of hourglass shape
                if (j == i || j == n - 1 - i) {
                    System.out.print("*");
                } else if (i == 0 || i == n - 1) {
                    // Print stars on the top and bottom rows
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

	}

}
