package com.codegnan.patternexamples;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		//upper part of diamond
		for(int i=1;i<=rows;i++) {//outer loop for rows(1-5)
			//inner loop1:print leading spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");	//two spaces	
				}
			//inner loop for printing stars
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(" *");
			}
			System.out.println();//new line after each row
			
		}

	}

}
