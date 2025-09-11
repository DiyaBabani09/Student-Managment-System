package com.Managment;

import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class JdbcConnection {
    Scanner sc = new Scanner(System.in);
    static String url = "jdbc:mysql://localhost:3306/Managment";
    static String user = "root";
    static String password = "root12";
    Connection con ;

    public void createconnection() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void addStudent() {

        String run =" ";
        try {
            String sql = "Insert into Student  Values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            try {
                while (!run.equalsIgnoreCase("done")) {
                    Student input1 = new Student();
                    System.out.println("enter id");

                    int id = sc.nextInt();
                    input1.SetId(id);
                    ps.setInt(1, input1.getId());

                    System.out.println("Enter Name");
                    String name = sc.next();
                    input1.SetName(name);
                    ps.setString(2, input1.getName());

                    System.out.println("Enter Age");
                    int age = sc.nextInt();
                    input1.SetAge(age);
                    ps.setInt(3, input1.getAge());


                    System.out.println("Enter Grade");
                    String grade = sc.next();
                    input1.SetGrde(grade);
                    ps.setString(4, input1.getGrade());

                    System.out.println("Enter done to finish Or Enter Continue  ");
                    ps.addBatch();

                    run = sc.next();
                }
            } catch (InputMismatchException e) {
                System.out.println(e);

            }

            int arr[]=ps.executeBatch();
        } catch (SQLException e) {
            System.out.println(e);
//        }finally {
//            con.close();
//        }
        }
    }
    public void viewStudentdetails(){
        try{
            Statement stmt  = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

//        System.out.println("Connection Successful!");

            while (rs.next()) {
                System.out.println("id :   " + rs.getInt("id"));
                System.out.println("name: "+  rs.getString("name"));
                System.out.println("age::    "+  rs.getInt("age"));
                System.out.println("grade::  " +  rs.getString("grade").toUpperCase());
            }
        }
        catch(SQLException e){
            System.out.println(e );
        }
    }
    public void UpdateStudent(){
//        boolean Found=false;
        try {

            String sql="update Student set name=?,age=?,grade=? where id=?";
            PreparedStatement st=con.prepareStatement(sql);

            Student s=new Student();

            System.out.println("Enter Id");
            int id = sc.nextInt();

                    st.setInt(4,id);
                    System.out.println("Enter Student name");
                    String name = sc.next();
                    s.SetName(name);
                    st.setString(1,s.getName());
                    System.out.println("Enter Student age");
                    int age=sc.nextInt();
                    s.SetAge(age);
                    st.setInt(2,s.getAge());
                    System.out.println("Enter Student grade");
                    String grade=sc.next();
                    s.SetGrde(grade);
                    st.setString(3,grade);
                    System.out.println("Details are updated");

                int rowsaffecteed=st.executeUpdate();
                if(rowsaffecteed<=0){
                    System.out.println("Not Updated Successfully,Id does not exist");
                }
                else{
                    System.out.println("Updated SuccessFully");
                }
            }catch(SQLException e) {
            System.out.println(e);


}


    }
    public void DeleteStudent(){
try{
    String sql="Delete from Student where id=?";
    PreparedStatement st=con.prepareStatement(sql);
    System.out.println("Enter Id");
    int id=sc.nextInt();
    st.setInt(1,id);
    int rowsaffecteed=st.executeUpdate();
    if(rowsaffecteed<=0){
        System.out.println("Not Deleted Successfully,Id does not exist");
    }
    else{
        System.out.println("Deleted SuccessFully");
    }

}catch(SQLException e){
    System.out.println(e);
}
    }
    public void addTeacher()  {

        String run =" ";
        try {
            String sql = "Insert into Teacher  Values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            try {
                while (!run.equalsIgnoreCase("done")) {
                    Teacher input1 = new Teacher();
                    System.out.println("enter id");

                    int id = sc.nextInt();
                    input1.SetId(id);
                    ps.setInt(1, input1.getId());

                    System.out.println("Enter Name");
                    String name = sc.next();
                    input1.SetName(name);
                    ps.setString(2, input1.getName());




                    System.out.println("Enter subject");
                    String grade = sc.next();
                    input1.SetSubject(grade);
                    ps.setString(3, input1.getSubjetc());

                    System.out.println("Enter done to finish Or Enter Continue  ");
                    ps.addBatch();

                    run = sc.next();
                }
            } catch (InputMismatchException e) {
                System.out.println(e);

            }

            int arr[]=ps.executeBatch();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    public void viewTeacherdetails(){
        try{
            Statement stmt  = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Teacher");

//        System.out.println("Connection Successful!");

            while (rs.next()) {
                System.out.println("id :   " + rs.getInt("id"));
                System.out.println("name: "+  rs.getString("name"));
                System.out.println("subject::  " +  rs.getString("subject"));
            }
        }
        catch(SQLException e){
            System.out.println(e );
        }
    }
    public void UpdateTeacher(){
//        boolean Found=false;
        try {

            String sql="update Teacher  set name=?,subject=? where id=?";
            PreparedStatement st=con.prepareStatement(sql);

            Teacher s=new Teacher();

            System.out.println("Enter Id");
            int id = sc.nextInt();

            st.setInt(3,id);
            System.out.println("Enter Teacher name");
            String name = sc.next();
            s.SetName(name);
            st.setString(1,s.getName());


            System.out.println("Enter Subject");
            String sub=sc.next();
            s.SetSubject(sub);
            st.setString(2,sub);
            System.out.println("Details are updated");

            int rowsaffecteed=st.executeUpdate();
            if(rowsaffecteed<=0){
                System.out.println("Not Updated Successfully,Id does not exist");
            }
            else{
                System.out.println("Updated SuccessFully");
            }
        }catch(SQLException e) {
            System.out.println(e);


        }


    }
    public void DeleteTeacher(){
        try{
            String sql="Delete from Teacher where id=?";
            PreparedStatement st=con.prepareStatement(sql);
            System.out.println("Enter Id");
            int id=sc.nextInt();
            st.setInt(1,id);
            int rowsaffecteed=st.executeUpdate();
            if(rowsaffecteed<=0){
                System.out.println("Not Deleted Successfully,Id does not exist");
            }
            else{
                System.out.println("Deleted SuccessFully");
            }

        }catch(SQLException e){
            System.out.println(e);
        }
    }

    //Course Details
    public void addCourseDetails() {

        String run =" ";
        try {
            String sql = "Insert into Course  Values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            try {
                while (!run.equalsIgnoreCase("done")) {
                    Course input1 = new Course();
                    System.out.println("enter id");

                    int id = sc.nextInt();
                    input1.SetId(id);
                    ps.setInt(1, input1.getId());

                    System.out.println("Enter Course Name");
                    String name = sc.next();
                    input1.SetName(name);
                    ps.setString(2, input1.getName());

                    System.out.println("Enter AssignedTeacher");
                    String  as = sc.next();
                    input1.SetAs(as);
                    ps.setString(3, input1.getSubjetc());


                    System.out.println("Enter no of Enrolled Student ");
                    int n=sc.nextInt();
                    ArrayList<String> a = new ArrayList<>();
                    for (int i = 1; i <= n; i++) {
                        String sname = sc.next();
                        a.add(sname);

//
                    }
                    String Sl = String.join(",", a);
                    input1.SetStudents(a);
                    ps.setString(4,Sl);


                    System.out.println("Enter done to finish Or Enter Continue  ");
                    ps.addBatch();

                    run = sc.next();
                }
                int arr[]=ps.executeBatch();
            } catch (InputMismatchException e) {
                System.out.println(e);

            }

//      int arr[]=ps.executeBatch();
        } catch (SQLException e) {
            System.out.println(e);
//        }finally {
//            con.close();
//        }
        }
    }
    public void viewCoursedetails(){
        try{
            Statement stmt  = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Course");

//        System.out.println("Connection Successful!");

            while (rs.next()) {
                System.out.println("id :   " + rs.getInt("id"));
                System.out.println("name: "+  rs.getString("name"));
                System.out.println("Teacher::    "+  rs.getString("assignedTeacher"));
                System.out.println("EnrolledStudent::  " +  rs.getString("EnrolledStudents;"));
            }
        }
        catch(SQLException e){
            System.out.println(e );
        }
    }
    public void UpdateCourse(){
//        boolean Found=false;
        try {

            String sql="update Course set name=?,assignedTeacher=?,EnrolledStudents;=? where id=?";
            PreparedStatement st=con.prepareStatement(sql);

            Course s=new Course();

            System.out.println("Enter Id");
            int id = sc.nextInt();

            st.setInt(4,id);
            System.out.println("Enter Course name");
            String name = sc.next();
            s.SetName(name);
            st.setString(1,s.getName());
            System.out.println("Enter AssignedTeacher");
            String as=sc.next();
            s.SetAs(as);
            st.setString(2,s.getSubjetc());
            System.out.println("Enter no of Enrolled Students");
            int n=sc.nextInt();
            ArrayList<String> a = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                String sname = sc.next();
                a.add(sname);

            }
            String sl=String.join(" ",a);
            s.SetStudents(a);
            st.setString(4,sl);

            System.out.println("Details are updated");

            int rowsaffecteed=st.executeUpdate();
            if(rowsaffecteed<=0){
                System.out.println("Not Updated Successfully,Id does not exist");
            }
            else{
                System.out.println("Updated SuccessFully");
            }
        }catch(SQLException e) {
            System.out.println(e);


        }


    }
    public void DeleteCourse(){
        try{
            String sql="Delete from Course where id=?";
            PreparedStatement st=con.prepareStatement(sql);
            System.out.println("Enter Id");
            int id=sc.nextInt();
            st.setInt(1,id);
            int rowsaffecteed=st.executeUpdate();
            if(rowsaffecteed<=0){
                System.out.println("Not Deleted Successfully,Id does not exist");
            }
            else{
                System.out.println("Deleted SuccessFully");
            }

        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void Enrolled_Student(){
        try{
            String Sql= "INSERT INTO Enrolled (s_id, c_id, course_name) "
                    + "SELECT s.id, c.id, c.name "
                    + "FROM Student s, Course c "
                    + "WHERE s.name = ? AND c.name = ?";

            PreparedStatement ps =con.prepareStatement(Sql);
            System.out.println("Enter Student name");
            String name=sc.next();
            System.out.println("Enter course cname");
            String cname=sc.next();
            ps.setString(1,name);
            ps.setString(2,cname);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Successfully enrolled student");
            } else {
                System.out.println("Failed to enrol");
            }

        }catch(SQLException e){
            System.out.println(e);
        }
    }
public void DisplayEnrolledStudent(){
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Enrolled");
            while (rs.next()) {
                System.out.println("id :   " + rs.getInt("enrollment_id"));
                System.out.println("Student Id: "+  rs.getInt("s_id"));
                System.out.println("Course Id::    "+  rs.getInt("c_id"));
                System.out.println("Course Name::  " +  rs.getString("course_name"));
            }
        }catch(SQLException e){
            System.out.println( e);
        }

}

    public static void main(String[] args) {
        JdbcConnection c=new JdbcConnection();
        c.createconnection();
//        c.addStudent();
        c.viewStudentdetails();
//        c.UpdateStuent();
//        c.DeleteStudent();
//        c.viewStudentdetails();
//        c.addCourseDetails();
//        c.viewCoursedetails();
//        c.UpdateCourse();
//        c.viewCoursedetails();
//        c.DeleteCourse();
        c.viewCoursedetails();
        c.Enrolled_Student();
        c.DisplayEnrolledStudent();
    }
}
