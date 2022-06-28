package Empwage;

public class Employeewagecal {
	public static final int full_time=1;
	public static final int part_time=2;
	public static final int emp_rate_per_hr=20;
	public static final int total_working_days=20;
	public static final int max_working_hrs=100;
	
	public static void main(String[] args) {
		
		int emphrs=0;
		int empwage=0;
		int total_emp_wage=0;
		int working_days=0, total_emphrs=0; 
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
		System.out.println("day #" +working_days+ " total working hrs: " + total_emphrs);
		
	}
		total_emp_wage = total_emphrs*emp_rate_per_hr;
		System.out.println("Total wage in a month: " + total_emp_wage);
	}
}
