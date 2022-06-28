package Empwage;

public class Employeewagecal {
	public static void main(String[] args) {
		int Is_Present=1;
		double empcheck = Math.floor(Math.random()*10)%2;
		
		if(empcheck==Is_Present) {
			System.out.println("Present");
		}
		else
		{
			System.out.println("Absent");
		}
	}


}
