package com.myprogram;

import java.util.Scanner;

public class Sum_of_natural_number {

	public static void main(String arg[])
	{

		Scanner sc=new Scanner(System.in);
		int num; //Declare the number
		System.out.println("Enter the number");
		num=sc.nextInt();    //Initialize the number

		int sum=0;   //Variable to calculate the sum
		for(int i=1; i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of natural numbers is "+sum);
	}
}