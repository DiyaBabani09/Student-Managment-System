package com.Managment;

import java.util.Scanner;

public class Teacher {
    private int id;
    private String name;
    private String subject;


    public String toString() {
        return "id: " + id + "\n" + "Name  " + name + "\n"+  "subject  "+subject;
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
public void SetSubject(String subject){
    this.subject=subject;
}
public String getSubjetc(){
    return subject;
}
public  static  void TeacherDetails(){
    ServiceMethods s2=new ServiceMethods();
    Scanner sc =new Scanner(System.in);
        // System.out.println("choice  details");
        System.out.println("Enter choice");
         int n=0;
        do{
            System.out.println("Enter 1 to add Teacherr details");
             System.out.println("Enter 2 to view Teacher details");
              System.out.println("Enter 3 to update Teacher details");
               System.out.println("Enter 4 to delete Teachert details");
                   n=sc.nextInt();
               
            
            
            switch (n) {
                case 1: s2.AddTeacherDetails();
                System.out.println("adding");
                break;
                
                case 2:s2.ViewTeacherDetails();
                System.out.println("view");
                break;
                
                case 3:s2.UpdateTeacherDetails();
                System.out.println("updating");
                break;

                case 4: s2.DeleteTeacherDetails();
                System.out.println("deleting");
                break;
               
                default:System.out.println("Incorrect choice");
            }
        }   
                while(n>=1&& n<=4);

        }
   
   
    public static void main(String[] args) {
        
TeacherDetails();
    }
   
}
