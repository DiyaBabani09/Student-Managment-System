package com.Managment;

import java.util.Scanner;

public class StudentManager {
    public  void StudentDetails() {
        ServiceMethods s = new ServiceMethods();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice");
        int n = 0;
        do {
            System.out.println("Enter 1 to add Student details");
            System.out.println("Enter 2 to view Student details");
            System.out.println("Enter 3 to update Student details");
            System.out.println("Enter 4 to delete Student details");
            System.out.println("Enter 5 to go back");
            n = sc.nextInt();


            switch (n) {
                case 1:
                    s.AddStudentDetails();

                    break;

                case 2:
                    s.ViewStudentDetails();

                    break;

                case 3:
                    s.UpdateStudentDetails();
                    break;

                case 4:
                    s.DeleteStudentDetails();
                    break;

                default:
                    System.out.println("Incorrect choice");
            }
        }
        while (n >= 1 && n <= 4);

    }

}
