package com.stat;

public class K {
	static int a=10;
	static int b=20;
	static {
		System.out.println("From SIB of K");
		System.out.println(a);
		System.out.println(b);
		a=50;
	}

	public static void main(String[] args) {
	
		System.out.println("From Main() of K");
	}

}
