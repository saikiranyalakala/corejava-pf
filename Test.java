package com.ass1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {


		    
		        Scanner input=new Scanner(System.in);
		        int n=input.nextInt();
		        int temp=n;
		        int count=0;
		        while(temp>0)
		        {
		            count++;
		            temp=temp/10;
		            
		        }
		        System.out.println(count );
		        int[] a=new int[count];
		        int r=0;
		        
		        int k=0;
		        while(n>0)
		        {
		            r=n%10;
		           a[k] =r;
		            k++;
		            n=n/10;
		            
		        }
		        for(int i=0;i<count;i++)
		        {
		        System.out.println(a[i]);
		        
		        
		    }

		}
		

	}


