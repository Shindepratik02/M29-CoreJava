// program to demonstrate user-input value
package org.tnsif.userinputdemo;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		System.out.println("Enter the salary: ");
		Scanner s=new Scanner(System.in);
		float salary=s.nextFloat();
		
		System.out.println("Enter the name: ");
		String name=s.next();
		s.nextLine();
		
		System.out.println("Enter the name1: ");
		String name1=s.nextLine();
		
		System.out.println("Enter the character: ");
		char ch=s.next().charAt(1);
		
		
		System.out.println("Enter the number: ");
		int a=s.nextInt();
		
		
		
		System.out.println("Salary is "+salary);
		System.out.println("name is "+name);
		System.out.println("name1 is "+name1);
		System.out.println("character is "+ch);
		System.out.println("integer is "+a);
		
		

	}

}
