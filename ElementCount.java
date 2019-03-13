package com.ass1;
import java.util.*;
public class ElementCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		
		int []a=new int[size];
		
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int e=sc.nextInt();
		int count=0;
	for(int i=0;i<a.length;i++){
			if(a[i]==e){
				count++;
			
			}
		}
	
		System.out.println(count);

	}

}
