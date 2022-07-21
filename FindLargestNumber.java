package com.basic1;

import java.util.Scanner;

public class FindLargestNumber {
	
		public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter third number : ");
		int num3 = scanner.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("first number is largest");
		}
		else if(num2 >= num1 && num2 > num3){
			System.out.println("second number is largest number");
		}else 
			System.out.println("Third number is largest");
		
		}
			
}
