package com.codegnan.javaprograms;
import java.util.Scanner;
import java.util.Arrays;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int size = sc.nextInt();
		int[] number = new int[size];
		int sum =0;
		System.out.println("enter your data");
		for(int i =number.length-1;i>=0;i--){
		  System.out.println("enter your number"+i+":");
		  number[i]=sc.nextInt();
		  
		  sum = sum+number[i];
		}
		 System.out.println("the total sum is :"+sum);
		
		 System.out.println("The entire array is: " + Arrays.toString(number));
	*/
		int[] number = {10,20,30,40,50};
		
		for(int num : number) {
			System.out.print(num+" ");
			
		}
		
		

	}

}
