package com.RaghuHomework;

import java.util.Scanner;

public class ConvertTemp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Celsius Temp is");
		double celsius=sc.nextDouble();
		double feren=(celsius*9/5)+32;
		System.out.println("Fahrenheit temp is : "+feren+" F");

	}

	}


