package com.emp;

public class EmployeeWageObject {
	public static final int full_time=1;
	public static final int part_time=2;
	
	private final String company;
	private final int emp_rate_per_hr;
	private final int total_working_days;
	private final int max_working_hrs;

	public EmployeeWageObject(String company, int emp_rate_per_hr, int max_working_hrs, int total_working_days)
	{
		this.company = company;
		this.emp_rate_per_hr = emp_rate_per_hr;
		this.max_working_hrs = max_working_hrs;
		this.total_working_days = total_working_days;
		}
	public static void main(String[] args) {
		EmployeeWageObject dmart = new EmployeeWageObject("Dmart", 20, 4, 10);
		int total_emphrs=0;
		int emphrs = 0; 
		int working_days=0;
		while(total_emphrs<=dmart.max_working_hrs && working_days<dmart.total_working_days){
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
		//System.out.println("Total working hours: " + total_emphrs);
		int total_emp_wage = total_emphrs * dmart.emp_rate_per_hr;
		System.out.println("Total wage for company " + dmart.company + " is "+ total_emp_wage);
	}
}
