public class EmployeeWage{
public static final int Is_part_time = 1;
public static final int Is_present = 2;
public static final int emp_rate_per_hour = 20;
public static final int Num_of_working_days = 20;
public static void main(String [] args){
int empHrs = 0;
int empWage = 0;
int totalEmpWage = 0;
for(int day = 0 ; day < Num_of_working_days ; day++)
{
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
empWage = empHrs * emp_rate_per_hour;
totalEmpWage+=empWage;
System.out.println("Emp Wage: "+empWage);
}
System.out.println("Total Emp Wage: " + totalEmpWage);
}
}
