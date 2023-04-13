package com.myprogram;

import java.util.Scanner;

public class num_to_word_2 {

public static void main(String[] args) {
// TODO Auto-generated method stub
int a=userInput();

myMethod(a);
}

private static int userInput() {
// TODO Auto-generated method stub
System.out.println("this is a program to read a number 1,10,100,1000 and display its unit");
Scanner sc = new Scanner(System.in);
System.out.print("select a number from 1 , 10 , 100 , 1000 ");
int x = sc.nextInt();
return x;
}
private static void myMethod(int num) {
		// TODO Auto-generated method stub


        if (num == 1) {
			System.out.println("the number is singls");
		} else if (num == 10) {
			System.out.println("the number is tens");
		} else if (num == 100) {
			System.out.println("the number is hundreds");
		} else if (num == 1000) {
			System.out.println("the number is thousands");
		} else {
			System.out.println("Error");
		}

	}


}

