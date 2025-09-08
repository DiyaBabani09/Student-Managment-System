package com.Managment;

import java.util.Scanner;

public class CourseManager {

    public   void CourseDetails(){
        ServiceMethods s2=new ServiceMethods();
        Scanner sc =new Scanner(System.in);
        // System.out.println("choice  details");
        System.out.println("Enter choice");
        int n=0;
        do{
            System.out.println("Enter 1 to add Course  details");
            System.out.println("Enter 2 to view Course details");
            System.out.println("Enter 3 to update Course details");
            System.out.println("Enter 4 to delete Course details");
            System.out.println("Enter 5  to go back");
            n=sc.nextInt();



            switch (n) {
                case 1: s2.AddCourseDetails();

                    break;

                case 2:s2.ViewCourseDetails();

                    break;

                case 3:s2.UpdateCourseDetails();

                    break;

                case 4: s2.DeleteCourseDetails();

                    break;

                default:System.out.println("Incorrect choice");
            }
        }
        while(n>=1&& n<=4);

    }

}
