import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      Student Grade Tracker");
        System.out.println("====================================");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] names = new String[n];
        int[] marks = new int[n];
        char[] grades = new char[n];

        int total = 0;
        int highest;
        int lowest;

        // Input First Student
        System.out.println("\nEnter details of Student 1");
        System.out.print("Name: ");
        names[0] = sc.nextLine();

        System.out.print("Marks: ");
        marks[0] = sc.nextInt();
        sc.nextLine();

        total = marks[0];
        highest = marks[0];
        lowest = marks[0];

        if (marks[0] >= 90)
            grades[0] = 'A';
        else if (marks[0] >= 80)
            grades[0] = 'B';
        else if (marks[0] >= 70)
            grades[0] = 'C';
        else if (marks[0] >= 60)
            grades[0] = 'D';
        else
            grades[0] = 'F';

        // Remaining Students
        for (int i = 1; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Name: ");
            names[i] = sc.nextLine();

            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();

            total += marks[i];

            if (marks[i] > highest)
                highest = marks[i];

            if (marks[i] < lowest)
                lowest = marks[i];

            if (marks[i] >= 90)
                grades[i] = 'A';
            else if (marks[i] >= 80)
                grades[i] = 'B';
            else if (marks[i] >= 70)
                grades[i] = 'C';
            else if (marks[i] >= 60)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }

        double average = (double) total / n;

        System.out.println("\n====================================");
        System.out.println("          Student Report");
        System.out.println("====================================");

        System.out.printf("%-20s %-10s %-10s%n", "Name", "Marks", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-10d %-10c%n",
                    names[i], marks[i], grades[i]);
        }

        System.out.println("------------------------------------");
        System.out.printf("Average Marks : %.2f%n", average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}