
import java.util.Scanner;
class Employee
{
    int eNo;
    String eName;
    double eSalary;
    Employee(int n,String name,double sal)
    {
        eNo=n;
        eName=name;
        eSalary=sal;
    }
}

 public class EmpSearch {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number of employees");
        int n=s.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
    System.out.println("\nEnter details for employee"+(i+1)+".");
    System.out.print("Employee number:");
    int eno=s.nextInt();
    System.out.print("Employee Name:");
    String name =s.next();
    System.out.print("Employee salary:");
    double salary=s.nextDouble();
    e[i]=new Employee(eno,name,salary);
    }
    System.out.print("\nenter the employee number to search.");
    int searchEno=s.nextInt();
    int flag=0;
    for(Employee emp:e)
{
    if(emp.eNo==searchEno)
    {
    System.out.println("employee found:");
    System.out.println("employee number:"+emp.eNo);
    System.out.println("employee name:"+emp.eName);
    System.out.println("employee salary:"+emp.eSalary);
    flag=1;
    break;
    }}
    if(flag==0)
{
    System.out.println("employee with employee number"+searchEno+"not found.");

}
s.close();
}
}

    

