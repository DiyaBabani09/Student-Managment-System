package com.Managment;
import com.Service.*;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

// public Student(int id,String name,int age,String grade){
//         this.id=id;
//         this.name=name;
//         this.age=age;
//         this.grade=grade;
//     }

    public String toString() {
        return "id: " + id + "\n" + "Name  " + name + "\n" + "Age  " + age + "\n" + "grade  " + grade;
    }


    public void SetId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void SetGrde(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public static void StudentDetails() {
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

//         Scanner sc =new Scanner(System.in);
//         System.out.println("choice to chwck details");
//         System.out.println("Enter choice");
//          int n=0;
//         do{
//             System.out.println("Enter 1 to add Student details");
//              System.out.println("Enter 2 to view Student details");
//               System.out.println("Enter 3 to update Student details");
//                System.out.println("Enter 4 to delete Student details");
//                    n=sc.nextInt();
               
//             }
//             while(n<=1&& n>=4);{
            
//             switch (n) {
//  case 1:
//  System.out.println("adding");
//      break;

//  case 2:
//  System.out.println("view");
//      break;

//      case 3:
//      System.out.println("updating");
//      break;

//      case 4: 
//      System.out.println("deleting");
//      break;
     

//      default:System.out.println("Incorrect choice");
// }


// }


