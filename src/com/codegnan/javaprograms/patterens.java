package com.codegnan.javaprograms;

public class patterens {

	public static void main(String[] args) {
		int row =10;
		// TODO Auto-generated method stub
		for(int i =0; i<row;i++) {
			for(int j =0;j<row-i-1;j++) {
				
				
				System.out.print(" ");
				
				}
			for(int k=0;k<=i;k++) {
				System.out.print(""
						+ "* ");
			}
			System.out.println();

			}
		for(int i=0;i<row-1;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<row-i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		}

	}


