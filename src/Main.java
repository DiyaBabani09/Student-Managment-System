import java.util.Scanner;

import com.Managment.ServiceMethods;
import  com.Managment.Student;
import com.Managment.Teacher;
import com.Managment.Course;import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Student S1=new Student();
        Teacher T1=new Teacher();
        Course c1 =new Course();
        ServiceMethods sm=new ServiceMethods();
        System.out.println("hi");
  Scanner sc =new Scanner(System.in);
        System.out.println("choice to chwck details");
        System.out.println("Enter choice");
         int n=0;
        do{
            System.out.println("Enter 1 To Manage Students");
             System.out.println("Enter 2 to Manage Teachers");
              System.out.println("Enter 3 to Manage Course");
               System.out.println("Enter 4 to Enroll Student to course");

            System.out.println("Enter 5 To Assign Teacher to course");
            System.out.println("Enter 6 Display Student in a Course");
            System.out.println("Enter 7 Display Course by Teacher");
            System.out.println("Enter 8 to exit");
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
                    System.out.println("Enroll Student to courses");
                sm.Student_Couse();
                break;
                case 5:
                    System.out.println("Assign Teacher to Course");
                    sm.AssignTeacherCourse();
                    break;
                case 6:
                    System.out.println("Display Student in a Course");
                    sm.DisplayStudentsCourse();
                    break;
                case 7:
                    System.out.println("display Course By Teacher");
                    sm.DisplayCourseByTeacher();
                case 8:
                    System.exit(0);
break;    default:System.out.println("Incorrect choice or exit ");
            }
        }   
                while(n>=1&& n<=7);

        }

    }

