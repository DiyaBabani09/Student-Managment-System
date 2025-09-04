package com.Managment;

import java.util.Scanner;

public class TeacherManager {
    public static void TeacherDetails() {
        ServiceMethods s2 = new ServiceMethods();
        Scanner sc = new Scanner(System.in);
        // System.out.println("choice  details");
        System.out.println("Enter choice");
        int n = 0;
        do {
            System.out.println("Enter 1 to add Teacherr details");
            System.out.println("Enter 2 to view Teacher details");
            System.out.println("Enter 3 to update Teacher details");
            System.out.println("Enter 4 to delete Teachert details");
            System.out.println("Enter 5 to go back");
            n = sc.nextInt();


            switch (n) {
                case 1:
                    s2.AddTeacherDetails();

                    break;

                case 2:
                    s2.ViewTeacherDetails();

                    break;

                case 3:
                    s2.UpdateTeacherDetails();
                    break;

                case 4:
                    s2.DeleteTeacherDetails();

                    break;

                default:
                    System.out.println("Incorrect choice");
            }
        }
        while (n >= 1 && n <= 4);

    }



}