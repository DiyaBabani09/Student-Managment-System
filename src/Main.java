import java.util.Scanner;

import  com.Managment.Student;
import com.Managment.Teacher;
import com.Managment.Course;;

public class Main {
    public static void main(String[] args) {
        Student S1=new Student();
        Teacher T1=new Teacher();
        Course c1 =new Course();
        System.out.println("hi");
  Scanner sc =new Scanner(System.in);
        System.out.println("choice to chwck details");
        System.out.println("Enter choice");
         int n=0;
        do{
            System.out.println("Enter 1 To Manage Students");
             System.out.println("Enter 2 to Manage Teachers");
              System.out.println("Enter 3 to Manage Course");
               System.out.println("Enter 4 to delete Student details");
                   n=sc.nextInt();
               
            
            
            switch (n) {
                case 1: System.out.println("Manage Students");;
                S1.StudentDetails();
                break;
                
                case 2:T1.TeacherDetails();
                System.out.println("Mangae Teacher");
                break;
                
                case 3: c1.CourseDetails();
                System.out.println("Manage Course");
                break;

                case 4: 
                System.out.println("deleting");
                break;
               
                default:System.out.println("Incorrect choice");
            }
        }   
                while(n>=1&& n<=4);

        }

    }

