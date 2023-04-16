package com.stat;

public class J {
	static int a;
	static int b;
	static
	{
		System.out.println("From SIB 1");
		int a=10;
		System.out.println(a);
	}
	static
	{
		System.out.println("From SIB 2");
		b=20;
		System.out.println(b);
	}

	public static void main(String[] args) {
		System.out.println("From main ()");
		System.out.println(a);
		System.out.println(b);
		
	

	}

}
