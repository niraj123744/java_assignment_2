package com.myprogram;

public class Spring_Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		boolean isSpring = (month == 3 && day >= 20 && day <= 31) 
				|| (month == 4 && day >= 1 && day <= 30)
				|| (month == 5 && day >= 1 && day <= 31) 
				|| (month == 6 && day >= 1 && day <= 20);

		System.out.println(isSpring);
	}

}
