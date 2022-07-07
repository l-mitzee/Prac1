package com.emp;

public class EmployeeWage {
		public static final int full_time=1;
		public static final int part_time=2;
		public static final int emp_rate_per_hr=20;
		public static final int total_working_days=20;
		public static final int max_working_hrs=100;
		
		
		
		public static int wageCalculation(String company, int emp_rate_per_hr, int max_working_hrs, int total_working_days)
		{
			int total_emphrs=0;
			int emphrs = 0; 
			int working_days=0;
			while(total_emphrs<=max_working_hrs && working_days<total_working_days){
				working_days++;
			int empcheck= (int) Math.floor(Math.random()*10)%3;
			switch (empcheck) {
			case part_time:
				emphrs=4;
				break;
			case full_time:
				emphrs=8;
				break;
			default:
				emphrs=0;	
			}
			
			total_emphrs += emphrs;
			System.out.println("day #" +working_days+ " total working hrs: " + emphrs);
			
		}
			System.out.println("Total working hours: " + total_emphrs);
			int total_emp_wage = total_emphrs*emp_rate_per_hr;
			System.out.println("Total wage for company: " +company+" is: "+ total_emp_wage);
			return total_emp_wage;
		}
		 
		 public static void main(String[] args) {
			wageCalculation("Dmart", 20, 2, 100);
			wageCalculation("Reliance", 10, 4, 200);
	}

}
