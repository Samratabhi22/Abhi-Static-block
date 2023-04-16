package com.RaghuSir_self_practice;
import java.util.Scanner;
public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a =obj.nextInt();
		System.out.println("Enter the second number : ");
		int b=obj.nextInt();
		if(a==b)
		System.out.println("first number = second number");
		else if (a>b)
		System.out.println("first number > second number");
		else
		System.out.println("second number > first number");


	}

}
