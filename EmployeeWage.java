import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWage {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CompanyEmpWage> DifferentCompanies = new ArrayList<>();
		int select = 1;
		while(select == 1)
		{
			System.out.println("Choose\n 1.Add a company\n 2.Exit");
			int option = sc.nextInt();
			switch(option) {
			case 1:
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
				DifferentCompanies.add(e);
				select = 1;
				break;
			case 2:
				System.out.println("Thank You");
				select = 0;
				break;
			}
		}
		System.out.println("Enter the company name which total wage do you want to see:");
		String name = sc.next();
		for(int i = 0; i < DifferentCompanies.size(); i++)
		{
			if(DifferentCompanies.get(i).nameOfCompany.equals(name))
			{
				System.out.println("Toatl Wage of "+name+" is "+DifferentCompanies.get(i).totalMonthlyWage);
			}
		}

	}
}
	

