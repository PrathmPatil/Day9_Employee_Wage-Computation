package com.employeewagecomputation;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {
	static int totalday=0;
	/*
	 * For multiple Companies
	 */
	 public static int Company(String name, int days, int wage) {
		 int a;
		 System.out.println("Name Of Company is :: "+name);
		 System.out.println("Working Days in Month is :: "+days);
		 System.out.println("Wage per hour is :: "+wage);
		 for(int i=0;i<days;i++) 
		 {
	     		Random random =new Random();
	     		 a=random.nextInt(2);
	     		if(a==1) 
	     		 {
	            	 totalday++;
	             }
	     }
		 return totalday;
	 }
  public static void month(int totalday,int wage)
  {     
	 System.out.println("Total Wage of the month is :: "+totalday*wage*8);
	  
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("**********Wel-Come In Employee Wage Computation**********");
		System.out.println("Enter Company Name ::-");
		String cName=sc.next();
		System.out.println("Enter Monthly Days of Working ::-");
		int mDays=sc.nextInt();
		System.out.println("Enter Wage Per Hours ::-");
		int wHour=sc.nextInt();
		int totaldays= Company(cName,mDays,wHour);
	      month(totaldays,wHour);
	}
}
