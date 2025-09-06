package com.codegnan.patternexamples;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
            // Print leading spaces
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for(int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
		}

	}

}
