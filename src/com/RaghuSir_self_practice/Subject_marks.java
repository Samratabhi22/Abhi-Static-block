package com.RaghuSir_self_practice;
import java.util.Scanner;
public class Subject_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the 4 subject marks : ");
		int phy =obj.nextInt();
		int chem =obj.nextInt();
		int maths =obj.nextInt();
		int bio =obj.nextInt();
		
		int total=(phy+chem+maths+bio);
		
		
		if(phy<35||chem<35||maths<35||bio <35)
		{
			System.out.println("FAIL");}
			else
			{
				double per =total/4.0;
						
				if(per >=85)
				System.out.println("Distinction");
				else if(per >=60)
					System.out.println("First class");
				else if(per >=50)
					System.out.println("Second class");
				else
					System.out.println("Pass");
			}
	
				
					
				
			}
				
			}

	


