package com.myprogram;
import java.util.*; 
public class num_to_word {

public static void main(String[] args) {
// TODO Auto-generated method stub
int a=userInput();
		       
myMethod(a);
}

private static int userInput() {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int x = sc.nextInt();
return x;
}
private static void myMethod(int num) {
// TODO Auto-generated method stub
	        

	if (num == 0) {
		System.out.println("Zero.");
	} else if (num == 1) {
		System.out.println("One.");
	} else if (num == 2) {
		System.out.println("Two.");
	} else if (num == 3) {
		System.out.println("Three.");
	} else if (num == 4) {
		System.out.println("Four.");
	} else if (num == 5) {
		System.out.println("Five.");
	} else if (num == 6) {
		System.out.println("Six.");
	} else if (num == 7) {
		System.out.println("Seven.");
	} else if (num == 8) {
		System.out.println("Eight.");
	} else if (num == 9) {
		System.out.println("Nine.");
	} else {
		System.out.println("Enter Valid Number(0 to 9).");
	}

}

}

