package com.basic1;

import java.util.Scanner;

public class PrimeFactorisation {
		public static void main(String[] args) {
			int i;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number whose prime factorisation we want : ");
		int num = scanner.nextInt();
		
			
			for(i = 2; i <= (int)Math.sqrt(num); i++){
				while(num%i == 0) {
					System.out.println("Prime factor of num : "+i);
					num/=i;
				}
			}
		if(num > 2) {
			System.out.println("prime factor of number : "+num);
		}
		
		}
	
}
