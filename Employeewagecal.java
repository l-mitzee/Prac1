package Empwage;

public class Employeewagecal {
	public static void main(String[] args) {
		int full_time=1;
		int emp_rate_per_hr=20;
		int emphrs=0;
		int empwage=0;
		
		
		
		double empcheck=(Math.floor(Math.random()*10)%2);
		
		if (empcheck==full_time) {
			emphrs=8;
			System.out.println("Full time employee working hours== " +emphrs);
		}
		else {
			emphrs=0;
			System.out.println("Absent Employee working hours==" +emphrs);
		}
		
		
		empwage= emp_rate_per_hr*emphrs;
		System.out.println("Total wage== "+empwage);
	}
}
