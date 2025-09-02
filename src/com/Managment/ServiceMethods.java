package com.Managment;


import java.util.*;

// import javax.xml.transform.stax.StAXResult;

import com.Service.ServiceInterfaces;


public class ServiceMethods implements ServiceInterfaces {
    static  ArrayList<Student>list=new ArrayList<>();
     static  ArrayList<Teacher>list2=new ArrayList<>();
      static  ArrayList<Course>list3=new ArrayList<>();
    HashMap<String,String>m=new HashMap<>();
    HashMap<String,ArrayList<String>>m2 =new HashMap<>();
     Scanner sc=new Scanner(System.in);
    
    public void AddStudentDetails(){
        
        System.out.println("add student details");
        
        
        System.out.println("write done when adding is complete");
        String run =" ";
        while(!run.equalsIgnoreCase("done")){
            Student input1=new Student();
            System.out.println("enter id");
            
            int id =sc.nextInt();
             input1.SetId(id);
            
            System.out.println("enter Name");
            String name = sc.next();
         input1.SetName(name);

   System.out.println("enter Age");
   int  age =sc.nextInt();

     input1.SetAge(age);
   
   System.out.println("enter Grade");
   String  grade =sc.next ();
   input1.SetGrde(grade);
//   list.add(new Student(id,name,age,grade));
   list.add(input1);

   System.out.println("Enter done to finish Or Enter Continue  ");
   run=sc.next();

    }
}
   


 public void ViewStudentDetails(){

    if(list.isEmpty()){
        System.out.println("There is no list of student");
    
    }
    //  ArrayList<Student>list=new ArrayList<>();
for(Student S:list){
    System.out.println(S);
    
}
 }
 public void UpdateStudentDetails(){
      
System.out.println("Enter Id");
int id=sc.nextInt();
for(Student l:list){
    if(l.getId()==id){
System.out.println("enter name");
String name=sc.next();
  l.SetName(name);
System.out.println("Details are updated");
    }
}

 }










public void AddTeacherDetails(){
        
        System.out.println("add Teacher details");
        
        
        System.out.println("write done when adding is complete");
        String run =" ";
        while(!run.equalsIgnoreCase("done")){
            Teacher input1=new Teacher();
            System.out.println("enter id");
            
            int id =sc.nextInt();
             input1.SetId(id);
            
            System.out.println("enter Name");
            String name = sc.next();
         input1.SetName(name);

   System.out.println("enter Subject");
   String subject =sc.next();

     input1.SetSubject(subject);
   

   

   list2.add(input1);

   System.out.println("Enter done to finish Or Enter Continue  ");
   run=sc.next();

    }
}
   




 public void UpdateTeacherDetails(){
      
System.out.println("Enter Id");
int id=sc.nextInt();
for(Teacher l:list2){
    if(l.getId()==id){
System.out.println("enter name");
String name=sc.next();
  l.SetName(name);
System.out.println("Details are updated");
    }
}


 }
 public void ViewTeacherDetails(){

    if(list2.isEmpty()){
        System.out.println("There is no list of student");
    
    }
    //  ArrayList<Student>list=new ArrayList<>();
for(Teacher S:list2){
    System.out.println(S);
    
}
 }


 public void AddCourseDetails(){
        
        System.out.println("add Course details");
        
        
        System.out.println("write done when adding is complete");
        String run =" ";
        while(!run.equalsIgnoreCase("done")){
            Course input1=new Course();
            System.out.println("enter id");
            
            int id =sc.nextInt();
             input1.SetId(id);
            
            System.out.println("Enter  Course Name");
            String name = sc.next();
// sc.nextLine();
         input1.SetName(name);


   System.out.println("enter AssignedTeacher");
   String as=sc.next();
   input1.SetAs(as);
   System.out.println("Enrolled Student");

   ArrayList<String>a=new ArrayList<>();
   System.out.println("No of Enrolled Students");

int n=sc.nextInt();
for(int i=1;i<=n;i++){
     String sname=sc.next();
     a.add(sname);
   
        }
   
input1.SetStudents(a);
   list3.add(input1);

   System.out.println("Enter done to finish Or Enter Continue  ");
   run=sc.next();

    }
}
    
 public void ViewCourseDetails(){

    if(list3.isEmpty()){
        System.out.println("There is no list of student");
    
    }
    //  ArrayList<Student>list=new ArrayList<>();
for(Course S:list3){
    System.out.println(S);
    
}
 }
  public void UpdateCourseDetails(){
      
System.out.println("Enter Id");
int id=sc.nextInt();
for(Course l:list3){
    if(l.getId()==id){
System.out.println("enter name");
String name=sc.next();
  l.SetName(name);
  System.out.println("enter assigned Teacher");
  String as=sc.next();
  l.SetAs(as);

  ArrayList<String>a=new ArrayList<>();
  String es=sc.next();
  a.add(es);
  l.SetStudents(a);
System.out.println("Details are updated");
    }
}


 }
 public void Student_Couse(){
//HashMap<String,String>m=new HashMap<>();
Student s=new Student();
Course c=new Course();
String run=" ";
// while(!run.equalsIgnoreCase("done")){
System.out.println("enter the student name");
String name=sc.next();

     boolean found= false;
     boolean found2=false;
for(int i=0;i<list.size();i++){
    Student s1=list.get(i);
    String sname=s1.getName();

    if(sname.equals(name)){
        found=true;
        System.out.println(s1.getName());
        System.out.println("Enter course");
        String cname=sc.next();
        
        for(int i2=0;i2<list3.size();i2++) {

            Course c1 = list3.get(i2);
            String coursename = c1.getName();
            if (cname.equals(coursename)) {
                found2 = true;
                System.out.println(coursename);
                System.out.println(coursename);
                m.put(name, cname);
                System.out.println(m);
            }
        }
if(found2==false){
    System.out.println("course does not exist");
        }
    }



    // System.out.println("enter done or continue");
    // run=sc.nextLine();
    // sc.nextLine();
}
if(found==false){
    System.out.println("name does not exist ...Please First add Student details");
}
for(String key:m.keySet()){
System.out.println(key); 
}


}
public void AssignTeacherCourse(){
        Teacher T=new Teacher();
        Course c=new Course();
    System.out.println("Enter Teacher name");
    String name=sc.next();
    boolean found =false;
    try {
        for (int i = 0; i < list2.size(); i++) {
            Teacher T1 = list2.get(i);
            String tname = T1.getName();
//            System.out.println(T1.getName());
            if (tname.equals(name)) {
                found=true;
                System.out.println("Enter no of Course");
                int n = sc.nextInt();
                System.out.println("Enter Course name");
                ArrayList<String> a = new ArrayList<>();
                for (int k = 1; k <= n; k++) {

                    String cname = sc.next();

                    a.add(cname);
                }
                m2.put(name, a);
            }

        }
        if(found==false){
            System.out.println("Teacher name does not exist");
        }
    }catch(IndexOutOfBoundsException e){
        System.out.println("please enter the perfect no of course "+ e);
    }catch(InputMismatchException e){
        System.out.println("Invalid Input");
    }

//    System.out.println(m2);
}
public void DisplayCourseByTeacher(){
    try {
        if(m2.isEmpty()){
            System.out.println("There is no data");
        }
        for (Map.Entry<String, ArrayList<String>> e : m2.entrySet()) {
            System.out.println("Teacher  :  " + e.getKey() + " " + "Course : " + e.getValue());
        }
    } catch (UnsupportedOperationException e) {
        System.out.println(e + " does not exist");
    }
}

public void DisplayStudentsCourse() {
    try {
        if(m.isEmpty()){
            System.out.println("There is no data");
        }
        for (Map.Entry<String, String> e : m.entrySet()) {
            System.out.println("Student :  " + e.getKey() + " " + "Course : " + e.getValue());
        }
    } catch (UnsupportedOperationException e) {
        System.out.println(e + " does not exist");
    }


}














public  void DeleteStudentDetails(){
    System.out.println("Enter the Student id ");
    int id=sc.nextInt();
    boolean found= false;
    for(int i=0;i<list.size();i++){
        Student s=list.get(i);
        if(s.getId()==id){
            list.remove(i);
            found =true;
         
        }
    }
    if(found==false){
           System.out.println("id is not exist");
    }
        
    }

    public  void DeleteTeacherDetails(){
    System.out.println("Enter the Student id ");
    int id=sc.nextInt();
    boolean found= false;
    for(int i=0;i<list2.size();i++){
        Teacher s=list2.get(i);
        if(s.getId()==id){
            list2.remove(i);
            found =true;
         
        }
    }
    if(found==false){
           System.out.println("id is not exist");
    }
        
    }






public  void DeleteCourseDetails(){
    System.out.println("Enter the Student id ");
    int id=sc.nextInt();
    boolean found= false;
    for(int i=0;i<list3.size();i++){
        Course s=list3.get(i);
        if(s.getId()==id){
            list3.remove(i);
            found =true;
         
        }
    }
    if(found==false){
           System.out.println("id is not exist");
    }
        
    }











    public static void main(String[] args) {
        ServiceMethods s=new ServiceMethods();
          // ArrayList<Student>list=new ArrayList<>();
//          s.AddStudentDetails();
//          s.ViewStudentDetails();
        

         s.AddTeacherDetails();

        // s.DeleteTeacherDetails();
        // s.ViewTeacherDetails();
//      s.AddCourseDetails();
//        // s.DeleteCourseDetails();
//        s.ViewCourseDetails();

        //  s.AddCourseDetails();
        // // s.ViewCourseDetails();
          
        //  s.ViewCourseDetails();
//          s.Student_Couse();
//          s.DisplayStudentsCourse();
        s.AssignTeacherCourse();
    }
    
}
