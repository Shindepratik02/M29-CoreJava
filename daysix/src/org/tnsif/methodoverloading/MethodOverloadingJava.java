package org.tnsif.methodoverloading;

public class MethodOverloadingJava {
	public int multiplication(int a,int b) {
		return a*b;
	}
	
	public float multiplication(float a,float b) {
		return a*b;
	}
	
	public float multiplication(int a,float b) {
		return a*b;
	}

}
