import java.util.Scanner;

public class EmployeeWage {
	public static Scanner sc = new Scanner(System.in);

	//public static final int No_of_working_days = 20;
	public static final int Employee_present = 1;
	public static final int Employee_absent = 0;
	public static final int Employee_part_time = 2;
	//public static final int Wage_per_hour = 20;
	//public static final int Hours_in_a_day = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name of company");
		String companyName = sc.next();
		System.out.println("Enter the no of working days");
		int no_of_working_days = sc.nextInt();
		System.out.println("Enter the wage per hour");
		int wage_per_hour = sc.nextInt();
		System.out.println("Enter hours in a day");
		int hours_in_a_day = sc.nextInt();
		double totalWage = CalculateEmpWage(no_of_working_days,wage_per_hour,hours_in_a_day);
		System.out.println("Monthly Income of Employee : "+totalWage);

	}
	public static double CalculateEmpWage(int no_of_working_days, int wage_per_hour, int hours_in_a_day ) {
		double total_monthly_wage;
		int total_emp_hrs = 0;
		double total_working_days = 0;
		System.out.println("Hello Employee");
		while(total_emp_hrs < 100 && total_working_days<no_of_working_days)
		{
		int emp_hrs = 0;
		double days = 0;
		int employee_presence = (int) (Math.floor(Math.random() * 3));
		if (employee_presence == Employee_present) {
			emp_hrs = hours_in_a_day;
			days = 1;
		}
		else if (employee_presence == Employee_part_time)
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


}
