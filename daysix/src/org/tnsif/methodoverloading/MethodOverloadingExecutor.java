package org.tnsif.methodoverloading;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		MethodOverloadingJava m1=new MethodOverloadingJava();
		
		System.out.println(m1.multiplication(5,4));
		System.out.println(m1.multiplication(10.5f,4.0f));
		System.out.println(m1.multiplication(4,5.5f));
		// TODO Auto-generated method stub

	}

}
