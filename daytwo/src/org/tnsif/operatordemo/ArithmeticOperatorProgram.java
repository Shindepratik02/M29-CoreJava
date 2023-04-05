package org.tnsif.operatordemo;

import java.util.Scanner;

public class ArithmeticOperatorProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y values");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Addition is "+(x+y));
		System.out.println("Subtraction is "+(x-y));
		System.out.println("Multiplication is "+(x*y));
		System.out.println("Division is "+(x/y));
		System.out.println("Modulo divsion is "+(x%y));
		

	}

}
