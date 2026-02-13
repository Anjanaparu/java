import java.util.Scanner;

public class Faculty {
    String facultyname;
    int age;

    void getdata(Scanner scan) {
        System.out.println("\nEnter the faculty name:");
        facultyname = scan.nextLine();

        System.out.println("Enter the age:");
        age = scan.nextInt();
        scan.nextLine(); // consume leftover newline
    }

    void display() {
        System.out.println("Faculty Name: " + facultyname);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Faculty f1 = new Faculty();
        f1.getdata(scan);
        f1.display();

        scan.close();
    }
}
