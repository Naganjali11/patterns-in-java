package com.codegnan.patternexamples;

public class ButterflyPattern {

	public static void main(String[] args) {
		int rows=5;
		//Part1:upper part of butterfly pattern expanding wings
		for(int i=1;i<=rows;i++) {//outer for loop controls the current row number
			//inner for loop1:print stars for the left wings
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			//inner for loop2:print spaces in middle gap formula2*rows-i
			int spaces=2*(rows-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			//inner forloop3: print stars for right wing
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		//part 2:lower part of butterfly
		for(int i=rows;i>=1;i--) {
			//inner forloop1:print stars for left wing
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			//inner forloop2: for spaces
			int spaces=2*(rows-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			//inner forloop3: print stars on right wing
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}
