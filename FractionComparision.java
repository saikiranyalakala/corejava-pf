package com.mock1;

import java.util.Scanner;

public class FractionComparision {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        
      int flag=1;
       if(n1/n2==n3/n4)
       {
    	   flag=1;
    	  
       }
       if(flag==1)
       {
    	  int sum= (n1*n4)/(n2*n3);
    	  System.out.println(sum);
       }
      
       
	}

}
