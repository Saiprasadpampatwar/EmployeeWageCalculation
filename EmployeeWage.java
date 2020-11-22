import java.util.Scanner;

public class EmployeeWage {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter how many comanies do you want to enter:");
		int noOfCompany = sc.nextInt();
		CompanyEmpWage [] DifferentCompanies = new CompanyEmpWage[noOfCompany];
		for (int i = 0; i < DifferentCompanies.length; i++) {
			System.out.println("Enter Name of Comany:");
			String name = sc.next();
			System.out.println("Enter no of working days:");
			int workingDays = sc.nextInt();
			System.out.println("Enter wage per hour");
			int wagePerHour = sc.nextInt();
			System.out.println("Enter Working Hrs in a day:");
			int workingHrsInDay = sc.nextInt();
			CompanyEmpWage e = new CompanyEmpWage(name, workingDays, wagePerHour, workingHrsInDay);
			double montlyWage = e.CalculateEmpWage();
			System.out.println(name + "'s Monthly Wage is : "+ montlyWage);
		}
	
		

	}
}
	

