package com.Managment;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    
    
    
      private int id;
    private String name;
    private String assignedTeacher;
    private ArrayList<String> EnrolledStudents;
    


    public String toString() {
        return "id: " + id + "\n" + "Name : " + name + "\n"+  "assignedTeacher:  "+  assignedTeacher+ "\n" + "EnrolledStudents : "+ EnrolledStudents;
    }
     public void SetId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    
    public void SetName(String name){
        this.name=name;
}
public String getName(){
    return name;
}
public void SetAs( String assignedTeacher){
    this.assignedTeacher=assignedTeacher;
}
public String getSubjetc(){
    return assignedTeacher;
}
public void SetStudents(ArrayList<String>EnrolledStudents){
    this.EnrolledStudents=EnrolledStudents;
}
public  static  void CourseDetails(){
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
                   n=sc.nextInt();
               
            
            
            switch (n) {
                case 1: s2.AddCourseDetails();
                System.out.println("adding");
                break;
                
                case 2:s2.ViewCourseDetails();
                System.out.println("view");
                break;
                
                case 3:s2.UpdateCourseDetails();
                System.out.println("updating");
                break;

                case 4: 
                System.out.println("deleting");
                break;
               
                default:System.out.println("Incorrect choice");
            }
        }   
                while(n>=1&& n<=4);

        }
   
   
    public static void main(String[] args) {
        
CourseDetails();
    }


}
