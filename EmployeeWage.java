public class EmployeeWage{
public static final int Is_part_time = 1;
public static final int Is_present = 2;
public static final int emp_rate_per_hour = 20;
public static final int Num_of_working_days = 20;
public static final int Max_hrs_in_month = 100;
public static void main(String [] args){
int empHrs = 0;
int empWage = 0;
int totalEmpWage = 0;
int totalWorkingDays = 0;
int totalEmpHrs = 0;
while(totalEmpHrs<=Max_hrs_in_month && totalWorkingDays < Num_of_working_days)
{
totalWorkingDays++;
int empCheck = (int) Math.floor(Math.random() * 10) % 3;
switch (empCheck)
{
case Is_part_time:
empHrs = 4;
break;
case Is_present:
empHrs = 8;
break;
default:
empHrs = 0;
}
totalEmpHrs+=empHrs;
System.out.println("Day#: "+ totalWorkingDays + "Emp Hr: " + empHrs);
}
totalEmpWage = totalEmpHrs * emp_rate_per_hour;
System.out.println("Total Emp Wage: "+totalEmpWage);
}
}
