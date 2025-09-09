package com.codegnan.patternexamples;

public class RectangleBorderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;     // Number of rows (height)
        int columns = 6;  // Number of columns (width)

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Print * for border, otherwise space
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line after each row
        }

	}

}
