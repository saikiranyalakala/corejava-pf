package com.practice1;

import java.util.Scanner;

public class PrimeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        
        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++)
        {
        	boolean isPrime=true;
        	for(int j=2;j<a[i]/2;j++)
        	{
        		if(i%j==0)
        		{
        		isPrime=false;
        		break;
        		}
        	}
        		if(isPrime){
        			System.out.println(a[i]);
        	}
        
        
        
      

}
}
}