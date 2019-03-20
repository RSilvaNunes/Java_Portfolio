package exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student;
        List<Student> studentList = new ArrayList<>();
        int option = 0;
        String firstName = "";
        String lastName = "";
        int creditHour;

        System.out.println("Enter your first name: ");
        firstName = (scanner.nextLine());
        System.out.println("Enter your last name: ");
        lastName = (scanner.nextLine());

        do {
            System.out.println("-----Are you full-time or part-time student?-----");
            System.out.println("Enter number 1 for full-time student ");
            System.out.println("Enter number 2 for part-time student ");
            System.out.println("Enter number 0 for exit the program ");

            option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                FullTimeStudent fullTimeStudent = new FullTimeStudent(firstName, lastName, true);
                System.out.printf("%s %s, as a full-time student you pay $%.2f of tuition.%n", fullTimeStudent.getFirstName(),
                        fullTimeStudent.getLastName(), fullTimeStudent.getTuitionValue());
                System.out.println("-------------------------------------------------------------------------------");
                studentList.add(fullTimeStudent);
            }else if(option == 2){
                System.out.println("Enter the number of credit hours: ");
                creditHour = Integer.parseInt(scanner.nextLine());

                PartTimeStudent partTimeStudent = new PartTimeStudent(firstName, lastName, true, creditHour);
                System.out.printf("%s %s, as a part-time student you pay $%.2f of tuition.%n", partTimeStudent.getFirstName(),
                        partTimeStudent.getLastName(), partTimeStudent.getTuitionValue());
                System.out.println("-------------------------------------------------------------------------------");
                studentList.add(partTimeStudent);
            } else {
                System.out.println(studentList.toString());
            }
        } while (option != 0);

        scanner.close();
    }
}
