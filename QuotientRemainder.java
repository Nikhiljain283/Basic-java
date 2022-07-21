package com.basic1;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of number to divide :");
		int divident = scanner.nextInt();
		
		System.out.println("Enter divisor : ");
		int divisor = scanner.nextInt();
		
		int quotient = divident/divisor;
		int remainder = divident%divisor;
		
		System.out.println("quotient is : "+quotient );
		System.out.println("remainder is : "+remainder);
		
	}	
}
