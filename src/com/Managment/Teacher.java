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


   
}
