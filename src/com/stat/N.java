package com.stat;

public class N {
static int a = test1();
static int b = test1()+test2();
public static int test1()
{
	System.out.println("From test1()");
	return 1;

}
public static int test2()
{
	System.out.println("From test2()");
	return 2 + test1();

}

	public static void main(String[] args) {
		System.out.println("From main()");
		System.out.println(a);
		System.out.println(b);
	}

}
