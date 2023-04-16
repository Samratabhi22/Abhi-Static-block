package com.stat;

public class D {
	static int i;
	static int j;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		System.out.println(i);
		System.out.println(D.i);
		j=10;
System.out.println(j);
System.out.println(D.j);
test();
System.out.println(i);
System.out.println(D.i);
System.out.println(j);
System.out.println(D.j);

	}
public static void test()
{
	i=15;
	int j=20;
System.out.println(i);
System.out.println(D.i);
System.out.println(j);
System.out.println(D.j);

}

}

