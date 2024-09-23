import java.util.*;

public class LabEV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Your Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Your Number: ");
        int Number = scanner.nextInt();

        if (Number < 0 || Number > 100)
            System.out.println("Invalid input!");
        else if (Number >= 90)

        {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Department: " + department);
            System.out.println("Grade: A");
        } else if (Number >= 80) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Department: " + department);
            System.out.println("Grade: B");
        } else if (Number >= 70) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Department: " + department);
            System.out.println("Grade: C");
        } else if (Number >= 60) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Department: " + department);
            System.out.println("Grade: D");
        } else {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Department: " + department);
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
