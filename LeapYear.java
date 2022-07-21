package com.basic1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter four digit year name = ");
		int year = scanner.nextInt();
			
		int remainder = year%4;
		if(remainder == 0) {
			System.out.println("It is a leap year");
		}else {
			System.out.println("It is not a leap year");
		}
	}

}

