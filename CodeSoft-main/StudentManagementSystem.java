package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static int idCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student Details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    updateStudentDetails(scanner);
                    break;
                case 0:
                    System.out.println("Exiting Student Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter student course: ");
        String course = scanner.nextLine();

        Student student = new Student(name, idCounter, age, course);
        students.add(student);
        System.out.println("Student added successfully! Student ID: " + idCounter);
        idCounter++;
    }

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                student.displayDetails();
                System.out.println();
            }
        }
    }

    private static void updateStudentDetails(Scanner scanner) {
        if (students.isEmpty()) {
            System.out.println("No students to update.");
        } else {
            System.out.print("Enter student ID to update details: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            boolean found = false;
            for (Student student : students) {
                if (studentId == student.getId()) {
                    found = true;
                    System.out.println("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.println("Enter new course: ");
                    String newCourse = scanner.nextLine();

                    student.updateDetails(newName, newAge, newCourse);
                    break;
                }
            }
            if (!found) {
                System.out.println("Student ID not found.");
            }
        }
    }
}
