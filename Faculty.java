import java.util.Scanner;
public class Faculty {
    String facultyname;
    int age;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n Enter the faculty name:");
        facultyname=scan.nextLine();
        System.out.println("\n\nEnter the age:");
        age=scan.nextInt();
    }
    vopid display()
    {
        System.out.println("FacultyName:"+facultyname);
    }
    }
    
}
