package com.ass1;

import java.util.Scanner;

public class DecimalConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0,r1=0,r2=0,r3=0,n1=0,n2=0,n3=0;
	
	System.out.println("Decimal conversion step by step");
		r=n%10;
	    n=n/10;
	    
        r1=n%10;
        n1=n/10;
        
        r2=n1%10;
        n2=n1/10;
    
        r3=n2%10;
        n3=n2/10;
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
        
       
        
		System.out.println((r3*8)+(r2*4)+(r1*2)+(r*1));
      
		
	}

}
