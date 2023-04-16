package com.RaghuHomework;
import java.util.Scanner;
public class DoubleArithmetic {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two values");

double a =sc.nextDouble();
double b =sc.nextDouble();

System.out.println("Sum is : "+(a+b));
System.out.println("Sum is : "+a+b);
System.out.println("Diff is : "+(a-b));
System.out.println("Product is : "+ a*b);
System.out.println("Quotient is : "+a/b);
System.out.println("Remainder is : "+a%b);
	}

}
