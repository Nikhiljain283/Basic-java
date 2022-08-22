package com.basic1;

public class NumberSwap {

	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 20;
		System.out.println("Before swap");
		System.out.println("First number "+firstNum);
		System.out.println("Second number "+secondNum);
		
		System.out.println("After swap");
		int temporaryNum = firstNum;
		firstNum = secondNum;
		secondNum = temporaryNum;
		System.out.println("First number "+firstNum);
		System.out.println("Second number "+secondNum);
		
	}

}
