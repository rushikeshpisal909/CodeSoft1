package StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the number of subjects

        String[] subjectNames = new String[numSubjects];
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();

            System.out.print("Enter marks obtained in " + subjectNames[i] + " (out of 100): ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
            
            scanner.nextLine(); // Consume the newline character after reading marks
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        char grade = calculateGrade(averagePercentage);

        System.out.println("\nTotal Marks: " + totalMarks +"||"+"Average Percentage: " + averagePercentage + "%" +"||"+"Grade: " + grade);
        

        scanner.close();
    }

    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

