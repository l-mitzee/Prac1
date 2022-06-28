package Empwage;

public class Employeewagecal {
	public static final int full_time=1;
	public static final int part_time=2;
	public static final int emp_rate_per_hr=20;
	public static final int working_days=20;
	
	public static void main(String[] args) {
		
		int emphrs=0;
		int empwage=0;
		int total_emp_wage=0;
		int day;
		for(day=0; day<working_days; day++) {
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
		
		empwage= emp_rate_per_hr*emphrs;
		total_emp_wage +=empwage;
		System.out.println("day="+day);
		System.out.println("wage=" +empwage);
	}
		System.out.println("Total wage in a month: " + total_emp_wage);
	}
}
