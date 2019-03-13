package com.ass1;

import java.util.Scanner;

public class SalaryCalculation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int basic=sc.nextInt();
    int days=sc.nextInt();
    
    float sum=0;
    if(days<=30){
    sum=sum+basic+(basic/2)+((3*basic)/4);
    System.out.printf("%.2f",sum);
    }
    if(days==31){
    sum=sum+basic+(basic/2)+((3*basic)/4)+500;
    System.out.printf("%.2f",sum);
    }
    
	}

}
