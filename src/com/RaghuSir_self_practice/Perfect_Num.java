package com.RaghuSir_self_practice;
import java.util.Scanner;
public class Perfect_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a =obj.nextInt();
		int x =0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			
			{
			x=x+i;
			}
		}
			if(x==a)
			{
			System.out.println(a+"is a perfect number");
			}
			else
				System.out.println(a+"is not a perfect number");
		
		
			
	}
}


