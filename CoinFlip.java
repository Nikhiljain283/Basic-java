package com.basic1;

	import java.util.Scanner;

	public class CoinFlip {
		public static void main(String[] args) {
			
			double headTimes = 0;
			double tailTimes = 0;
			int count = 1;
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Number of time to flip coin : ");
			int flipTimes = scanner.nextInt();
			
			while(count <= flipTimes) {
				
				double check = Math.random();
				if(check <= 0.5) {
					headTimes++;
					System.out.println("head");
				
				}else {
					tailTimes++;
					System.out.println("tail");
				    }
				count++;
			}

			System.out.println("Number of time head occur : "+headTimes);
			System.out.println("Number of time tail occurs : "+tailTimes);
			
			double headPercent = (headTimes/flipTimes)*100;
			double tailPercent = 100 - headPercent;
		
			System.out.println("Head percentage = "+headPercent);
			System.out.println("Tail percentage = "+tailPercent);
		}	

	}

