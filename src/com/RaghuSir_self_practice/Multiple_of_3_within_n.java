package com.RaghuSir_self_practice;
import java.util.Scanner;
public class Multiple_of_3_within_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
		{
			System.out.println(i);
		}
		}

	}

}
