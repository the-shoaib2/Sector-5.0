package Que_Solve;

import java.util.*;

public class BonousProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter your Service year: ");
        int year = scanner.nextInt();

        double rate = 5.0;

        if (year > 2) {
            double bolous = salary * Math.pow((1 + rate / 100), year) - salary;
            System.out.printf("Bolous Amount : %.2f\n", bolous);
        } else {
            System.out.println("You are not eligible for bonus.");
        }

        scanner.close();

    }
}
