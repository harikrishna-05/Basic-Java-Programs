package com.codegnan.javaprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("TestData:");
		int num = sc.nextInt();
		if(num % 2 ==0 ) {
			System.out.println(num+"is  an even integer");
		}
		else {
			System.out.println(num+"is an odd integer");

			
		}

	}

}
