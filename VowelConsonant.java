package com.basic1;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the letter : ");
	char letter = scanner.next().charAt(0);
	
	
	if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter =='u') {
		System.out.println("character is vowel");
	}else
		System.out.println("Character is consonant");
	}
}
