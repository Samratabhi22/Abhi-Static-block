package com.stat;

import java.util.Scanner;

public class Sample {
public static void main(String [] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Celsius Temp is");
	int celcius=sc.nextInt();
	int feren=(celcius*9/5)+32;
	System.out.println("Fahrenheit temp is : "+feren+" F");

}
}
