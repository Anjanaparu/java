import java.util.Scanner;
public class Emp {
    int empno;
    String name;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEnter Employee Name:");
        name=scan.nextLine();
        System.out.println("\n\nEnter Emp No.:");
        empno=scan.nextInt();
    }
    void display()
    {
        System.out.println("Employee Name:"+name);
        System.out.println("Employee No:"+empno);
    }
        
        public static void main(String args[])
        {
            Emp e=new Emp();
            System.out.println("\n\nEmployee Details\n");
            System.out.println("\n\n--------------\n");
            e.getdata();
            e.display();
        }
    }
    
    

