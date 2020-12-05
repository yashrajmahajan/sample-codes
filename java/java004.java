public class java004 
{
 //this instance varialble is visible for any child class 
 public String name;

//salary variable is visible in Employee class only
 private double salary;
 

// the name varialble is assigned a value.
public java004(String empName)
{
 name = empName;
}
 public void setSalary(double empSal)
{
 salary = empSal;
}
// this method prints the employee details .
public void printEmp()
{
 System.out.print("name :"+ name);
 System.out.print("salary: "+salary);
 }

public static void main(String[] args)
{
 java004 empOne = new java004("yash");
 empOne.setSalary(1000);
 empOne.printEmp();
}
}
