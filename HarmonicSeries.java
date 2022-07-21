package com.basic1;

import java.util.Scanner;

public class HarmonicSeries {
			
			public static void main(String[] args) {
				
				double total = 0;
				
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter the times harmonic series must contine : ");
				int check = scanner.nextInt();
			
				for(double i =1; i <= check; i++) {
					double sum = 1/i;
					total = total +sum;
						
				System.out.println(total);	
						
				}
		}
}
