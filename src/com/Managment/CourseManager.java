package com.Managment;

import java.util.Scanner;

public class CourseManager {

    public   void CourseDetails(){
//        ServiceMethods s2=new ServiceMethods();
        JdbcConnection c1=new JdbcConnection();
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

                case 1:
                    c1.createconnection();
                    c1.addCourseDetails();

                    break;

                case 2:
                    c1.createconnection();
                    c1.viewCoursedetails();

                    break;

                case 3:
                    c1.createconnection();
                    c1.UpdateCourse();

                    break;

                case 4: c1.createconnection();
                    c1.DeleteCourse();

                    break;

                default:System.out.println("Incorrect choice");
            }
        }
        while(n>=1&& n<=4);

    }

}
