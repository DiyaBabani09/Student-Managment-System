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

   
   



}
