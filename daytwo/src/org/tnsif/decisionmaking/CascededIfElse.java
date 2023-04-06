package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascededIfElse {

	public static void main(String[] args) {
		System.out.println("Enter x,y,z values: ");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		
		if ((x>y)&& (x>z)){
			System.out.println("Highest number is "+x);
		}
		else if ((y>x)&& (y>z)) {
			System.out.println("Highest number is "+y);
		}
		else {
			System.out.println("Highest number is "+z);
		}

	}

}
