public class EmployeeWage{
public static void main(String [] args){
int Is_present = 1;
int emp_rate_per_hour = 20;
int empHrs = 0;
int empWage = 0;
double empCheck = Math.floor(Math.random() * 10) % 2;
if(Is_present == empCheck)
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
