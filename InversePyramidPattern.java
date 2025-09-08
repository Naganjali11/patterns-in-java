package com.codegnan.patternexamples;

public class InversePyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=rows-1;i>=1;i--) {
			//inner loop 1:print leading spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			//inner loop2 :print stars
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(" *");//space followed by *
				
			}
			System.out.println();
		}


	}

}
