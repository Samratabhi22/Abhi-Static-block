package com.stat;

public class O {
	public static void test()
	{
		System.out.println("From test()");
	}

	public static void main(String[] args) {
		System.out.println("From main()");
		test();
		O.test();
		

	}

}
