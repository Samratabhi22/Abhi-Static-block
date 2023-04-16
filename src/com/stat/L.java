package com.stat;

public class L {
	static int c=100;
	static 
	{
		System.out.println("From SIB of L");
	}

	public static void main(String[] args) {
		System.out.println("From main() of L");
		System.out.println(c);
		System.out.println(K.a);
		System.out.println(K.b);

	}

}
