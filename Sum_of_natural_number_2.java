package com.myprogram;

import java.util.Scanner;

public class Sum_of_natural_number_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num; // Declare the number
		System.out.println("Enter the number");
		num = sc.nextInt(); // Initialize the number
		int i = 1;
		int sum = 0; // Variable to calculate the sum
		while (i <= num) {
			sum += i;
			i++;
		}
		System.out.println("The sum of natural numbers is " + sum);
	}
}
