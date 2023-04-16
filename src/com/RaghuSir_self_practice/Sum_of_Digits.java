package com.RaghuSir_self_practice;
import java.util.Scanner;
public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n =obj.nextInt();
		
		int sum = 0;
	do{
		int x =n%10;
		sum=sum+x;
		n=n/10;
	}
	while(n!=0);
	System.out.println("Sum of Digits "+sum);
		

	}

}
