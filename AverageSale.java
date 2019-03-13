package com;

import java.util.Scanner;

public class AverageSale {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the sale in First month");
   int n1=sc.nextInt();
   System.out.println("Enter the Sale in Second month");
   int n2=sc.nextInt();
   System.out.println("Enter sale in Third month");
   int n3=sc.nextInt();
   System.out.println("Enter the sale in Fourth month");
   int n4=sc.nextInt();
   System.out.println("Enter the Sale in fifth month");
   int n5=sc.nextInt();
   System.out.println("Enter the Average Sale in six months");
   float n6=sc.nextFloat();
   
   float sum1=n6*6;
   float  sum2=(n1+n2+n3+n4+n5);
   float un=sum1-(sum2);
 
   System.out.println("The sale in the sixth month is Rs: " +un+"0");
   
 
    

  }

}
