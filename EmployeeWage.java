public class EmployeeWage{
public static void main(String [] args){
int Is_part_time =1;
int Is_present = 2;
int emp_rate_per_hour = 20;
int empHrs = 0;
int empWage = 0;
double empCheck = Math.floor(Math.random() * 10) % 3;
if(empCheck == Is_part_time)
{
empHrs = 4;
}
else if (empCheck == Is_present)
{
empHrs = 8;
}
else
{
empHrs = 0;
}
empWage = empHrs * emp_rate_per_hour;
System.out.println("Emp Wage: "+empWage);
}
}
