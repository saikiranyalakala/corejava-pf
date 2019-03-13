package com.mock123;

import java.util.Scanner;

public class TeamAssessment {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []a=new int[n];
    
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt();
    }
    int count=0;int temp=0;
    for(int i=0;i<n;i++){
    	for(int j=i+1;j<n;j++)
    	{
    		if(a[i]>a[j]){
    		temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    		}
    		
    		
    	}
    
    }
    int flag=0;
    for(int i=0;i<n;i++)
    {
    	for(int j=i+1;j<n;j++)
    	{
    		if(a[i]==a[j]){
    		a[j]=a[n-1];
    		j--;
    		n--;
    	
    		}
    	}
    	
    		count++;
       
     }
    System.out.println(count);
    
    for(int i=0;i<n;i++)
    { 
    
    	System.out.print(a[i]+" ");
    	
    }
    
	}

}
