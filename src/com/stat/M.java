package com.stat;

public class M {
	static int i=test();
	public static int test()
	{
		System.out.println("From test()");
		return 5;
	}
	
	public static void main(String[] args) {
		System.out.println("From main()");
		System.out.println(i);

	}

}
