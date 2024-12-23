package com.codegnan.javaprograms;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("TestData:");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println(num+"is an positive integer");
		}
		else {
			System.out.println(num+ "is an negative integer");
		}

	}

}
