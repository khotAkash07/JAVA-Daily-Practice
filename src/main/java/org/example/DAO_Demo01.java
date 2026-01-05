package org.example;

import java.sql.*;
import java.util.*;
public class DAO_Demo01 {
    public static <sc> void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDao dao = new StudentDao();
//        Student st = dao.getStudent(11);
//        System.out.println(st.sname);
            Student st = new Student();
//        System.out.println("Enter roll no and name for add new student");
//
//        st.rollNo = sc.nextInt();
//        st.sname = sc.nextLine();
//        dao.addStudent(st);
        dao.deleteStud(11);
    }
}
class StudentDao{

    Connection con = null;
    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Akash","root","root");
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public Student getStudent(int val){
        try{
            String url = "jdbc:mysql://localhost/Akash";
            Student s = new Student();
            String uname = "root";
            String pass = "root";
            s.rollNo = val;
            String query = "select sname from stud where roll_no ="+val;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            s.sname = rs.getString(1);
            final Student s1 = s;
            return s1;
        }catch (Exception ex){
            System.out.println(ex);
        }

        return null;
    }
    public void addStudent(Student s) {
        String query = "insert into stud values(?,?)";
        PreparedStatement ps;
        try {
            connect();
            ps = con.prepareStatement(query);
            ps.setInt(1,s.rollNo);
            ps.setString(2,s.sname);
            ps.executeUpdate();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public  void deleteStud(int rn){
        try {
            String query = "DELETE from stud where roll_no="+rn;
            connect();
            PreparedStatement ps = con.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
class Student{
    int rollNo ;
    String sname ;
}