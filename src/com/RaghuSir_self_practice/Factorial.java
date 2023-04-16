package com.RaghuSir_self_practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a =obj.nextInt();
		int fact=1;
		for(int i=2;i<=a;i++)
		{
			
			fact=fact*i;
			
			
			
		
		
	}
		System.out.println("facorial of" +a+ "is : " +fact);

}
}
