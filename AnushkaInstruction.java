package com.mock123;

import java.util.Scanner;

public class AnushkaInstruction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		for(int i=0;i<s.length()-1;i++)
		{
			int count=1;
			while(s.charAt(i)==s.charAt(i+1))
			{   
				i++;
				count++;
				
				if(s.length()==(i+1))
				{
					break;
				}
			}
			System.out.print(s.charAt(i)+""+count);
		}
	}

}
