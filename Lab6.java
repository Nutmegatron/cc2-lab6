//Carlinbhert Adryanne De Guzman
//CITCS 1N-A
//CC2 - Laboratory 6
//October 3, 2024

import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {

//        scanner to take user input on the total number of students
        Scanner myClass = new Scanner(System.in);
        System.out.print("Enter the total number of students: ");
        int totalStudents = myClass.nextInt();

        myClass.nextLine();

//        initialize present and absent student variables
        int presentStudents = 0, absentStudents = 0;

//        for loop to iterate through total number of students
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            String studentResponse = myClass.nextLine().toUpperCase();

//            if else statement to get student input to check whether the students are present/absent
            if (studentResponse.equals("Y")) {
                presentStudents++;
            } else if (studentResponse.equals("N"))
                absentStudents++;
            else {
                System.out.println("Please use a valid answer");
            }
        }

//        output is printed with statistics given
        System.out.println("Total present: " + presentStudents);
        System.out.println("Total absent: " + absentStudents);

        myClass.close();
        }
}
