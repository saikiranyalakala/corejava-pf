package com.ass1;

import java.util.Scanner;

public class CalculateBonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int basic=sc.nextInt();
         int sum=0;
         if(basic>20000){
          sum= sum+((basic/100)*17)+1500;
          System.out.println(sum);
         
          }
         
         if(basic>=15000 && basic<=19999){
             sum= sum+((basic/100)*15)+1200;
             System.out.println(sum);
            
             }
         
         if(basic>=10000  && basic<=14999){
             sum= sum+((basic/100)*12)+1000;
             System.out.println(sum);
           
             }
         
         
         
	}

}
