package com.RaghuHomework;
import java.util.Scanner;
public class Multiple3_within_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int n =sc.nextInt();
		int multi = 0;
		for(int i=1;i<=n;i++);
		{
			if(n%3==0)
			{
				multi++;
			
			System.out.println("multiple of 3 :"+multi);
			
		}
		else
			System.out.println("Not a multiple of 3: "+multi);

	}

}
}
