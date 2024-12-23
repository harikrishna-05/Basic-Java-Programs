package com.codegnan.javaprograms;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
         
		LeapYearOrNot s1=new LeapYearOrNot();
		//s1.isLeapYear();
		//s1.isNumberEqual();
		//s1.isAge();
		//s1.isLargestNumber();
		//s1.isQuadrant();
		//s1.isProgramPlatform();
		//s1.isArea();
		//s1.isRoot();
		//s1.isAddingNumbers();
		//s1.isFibnocchi();
		//s1.isTemparature();
		//s1.isTriangle();
		}
	
	void isLeapYear() {
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
	void isNumberEqual() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Test Data:");
		int Number1= sc.nextInt();
		int Number2= sc.nextInt();
		
		if(Number1 == Number2) {
			System.out.println("Number1 and Number2 are equal");
		}
		else {
			System.out.println("Number1 and Number2 are not equal");
		}
	}
	void isAge() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Test Data:");
		int age= sc.nextInt();
		
		if(age>=18) {
			System.out.println("you are eligible for voting");
		}
		else {
			System.out.println("you are not eligible for voting");
		}
	}
	void isLargestNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Test Data :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1>n2 && n1 > n3) {
			System.out.println(n1);
		}
		else if (n2> n1 && n2 > n3) {
			System.out.println(n2);
			
		}
		else {
			System.out.println(n3);
		}
		
	}
	void isQuadrant() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Test Data :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>0&&y>0) {
			System.out.println("The coordinate point ("+x+","+y+")"+"lies in the first quadrat");
		}
		else if (x<0&&y>0) {
			System.out.println("The coordinate point ("+x+","+y+")"+"lies in the seconnd quadrat");
		}
		else if(x<0&&y<0) {
			System.out.println("The coordinate point ("+x+","+y+")"+"lies in the third quadrat");
		}
		else {
			System.out.println("The coordinate point ("+x+","+y+")"+"lies in the fourth quadrat");
		}
	}
	void isProgramPlatform() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulation");
		System.out.print("enter two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("enter value:");
		int op = sc.nextInt();
		
		if(op ==1 ) {
			int num3 = num1 + num2 ;
			System.out.println("The addition of"+num1+"and"+num2+"is:"+ num3);
			
		}
		else if(op ==2 ) {
			int num3 = num1-num2 ;
			System.out.println("The substraction of"+num1+"and"+num2+"is:"+ num3);
			
		}
		else if(op ==3 ) {
			int num3 = num1*num2 ;
			System.out.println("The multiplication of"+num1+"and"+num2+"is:"+ num3);
			
		}
		else if(op ==4 ) {
			int num3 = num2/num1 ;
			System.out.println("The division of"+num1+"and"+num2+"is:"+ num3);
			
		}
		else if(op ==5 ) {
			int num3 = num1%num2 ;
			System.out.println("The modulation of"+num1+"and"+num2+"is:"+ num3);
			
		}
		else {
			System.out.println("enter correct value");
		}
	}
	void isArea() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area of circle");
		System.out.println("2.Area of triangle");
		System.out.println("3.Area of square");
		System.out.print("enter choice:");
		int op = sc.nextInt();
		if(op ==10) {
			System.out.println("enter radius:");
			double r = sc.nextDouble();
			double radius = 3.14 * r*r;
			System.out.println("The radius is :"+radius);
		}
		else if (op == 2) {
			System.out.println("enter base:");
			double b = sc.nextDouble();
			System.out.println("enter height:");
			double h = sc.nextDouble();
			double triangle = 0.5*b*h;
			System.out.println("The area of triangle is :"+triangle);
			
		}
		else if (op == 3) {
			System.out.println("enter base:");
			double b = sc.nextDouble();
			double base = b*b;
			System.out.println("The area of square is: "+base);
			
			
		}
		else {
			System.out.println("Enter valid option");
		}
		
	}
	void isRoot() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A value:");
		int a = sc.nextInt();
		System.out.print("Enter B value:");
		int b = sc.nextInt();
		System.out.print("Enter C value:");
		int c = sc.nextInt();
		double value = b*b - 4 *a*c;
		if(value > 0) {
			System.out.println("The root are real and distinct");
		}
		else if (value == 0) {
			System.out.println("The root are real");
			
		}
		else {
			System.out.println("The root are imaginary");
		}
	}
	void isAddingNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enetr your number:");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int reverse;
		while(temp!=0) {
			reverse =temp %10;
			sum=sum+reverse;
			temp = temp/10;
		}
		System.out.println("sum of your number "+num+ "is ="+sum);
		
	}
	void isFibnocchi() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number:");
		int n = sc.nextInt();
		int a=0;
		int b =1;
		System.out.print("The fibnochi series is "+a+" , "+b);
		for(int i =3;i<=n;i++) {
			int temp = a+b;
			System.out.print(" , "+temp);
			a=b;
			b=temp;
		}
	}
	void isTemparature() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Test Data:");
		int temparature = sc.nextInt();
		if(temparature < 0) {
			System.out.print("freezing weather");		
		}
		else if(temparature >=0 && temparature <10) {
			System.out.print("very cold weather");
		}
		else if(temparature >=10 && temparature <20) {
			System.out.print("cold weather");
		}
		else if(temparature >=20 && temparature <30) {
			System.out.print("normal in temp");
		}
		else if(temparature >=30 && temparature <40) {
			System.out.print("its hot");
		}
		else {
			System.out.print("its very hot");
		}
		
	}
	
	void isTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first angle :");
		int a = sc.nextInt();
		System.out.print("Enter second angle :");
		int b = sc.nextInt();
		System.out.print("Enter third angle :");
		int c = sc.nextInt();
		int angle = a+b+c;
		if(angle == 180) {
			System.out.print("it is a triangle");
		}
		else {
			System.out.print("the triangle is not valid");
		}
		
	}
	void isCheckCharcter() {
		Scanner sc = new Scanner(System.in);
		System.out.print("test Data");
		char ch = sc.next().charAt(0);
		
	}
	
	
	
	
	
	

}
