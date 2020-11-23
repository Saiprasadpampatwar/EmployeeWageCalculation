import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWage {
	public static final int EMPLOYEE_PRESENT = 1;
	public static final int EMPLOYEE_ABSENT = 0;
	public static final int EMPLOYEE_PART_TIME = 2;
	String nameOfCompany;
	int no_of_working_days;
	int wage_per_hour;
	int hours_in_a_day;
	public static Scanner sc = new Scanner(System.in);
	
	public double CalculateEmpWage() {
		double total_monthly_wage;
		int total_emp_hrs = 0;
		double total_working_days = 0;
		System.out.println("Hello Employee");
		while(total_working_days<no_of_working_days)
		{
		int emp_hrs = 0;
		double days = 0;
		int employee_presence = (int) (Math.floor(Math.random() * 3));
		if (employee_presence == EMPLOYEE_PRESENT) {
			emp_hrs = hours_in_a_day;
			days = 1;
		}
		else if (employee_presence == EMPLOYEE_PART_TIME)
		{
			emp_hrs = hours_in_a_day/2;
			days = 0.5 ;
		}
		else {
			emp_hrs = 0;
			days = 0;
		}
		total_emp_hrs+=emp_hrs;
		total_working_days+=days;
		if(total_emp_hrs>100 ) {
			total_emp_hrs=100;
		}
		if (total_working_days>20) {
			total_working_days=20;
		}
		}
		System.out.println("No. of Days: "+total_working_days);
		System.out.println("No. of working hrs: "+total_emp_hrs);
		total_monthly_wage = total_emp_hrs * wage_per_hour;
		return total_monthly_wage;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeWage> Companies = new ArrayList<>();
		int next = 1;
		while(next == 1) {
			System.out.println("Choose\n 1. Add a Comany\n 2.Exit");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				EmployeeWage e1 = new EmployeeWage();
				System.out.println("Enter the name of company");
				e1.nameOfCompany = sc.next();
				System.out.println("Enter the no of working days");
				e1.no_of_working_days = sc.nextInt();
				System.out.println("Enter the wage per hour");
				e1.wage_per_hour = sc.nextInt();
				System.out.println("Enter hours in a day");
				e1.hours_in_a_day = sc.nextInt();
				double totalWage = e1.CalculateEmpWage();
				Companies.add(e1);
				System.out.println("Monthly Income of Employee : "+totalWage);
				next = 1;
				break;
			case 2:
				System.out.println("Thank You");
				next = 0;
				break;
			}
		
	}
}
	
}
