package com.stat;

public class I {
	static 
	{
		int i=5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(I.i);//CTE
System.out.println(i);//CTE
	}

}
/* A variable declared inside static block is considered as local variable 
and it can be used only inside that particular static block. */