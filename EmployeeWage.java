public class EmployeeWage{
public static void main(String [] args){
int Is_present = 1;
double empCheck = Math.floor(Math.random() * 10) % 2;
if(Is_present == empCheck)
System.out.println("Employee is Present");
else
System.out.println("Employee is absent");
}
}
