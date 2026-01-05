package org.SelfPractice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Add_Student {
    public static void main(String[] args){

        int rollNum = 20;
        String name = "AkashKhot";

            Connection con = null;
            PreparedStatement ps = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akash", "root", "root");
                ps = con.prepareStatement("insert into stud (roll_no,sname) values(?,?)");
                ps.setInt(1, rollNum);
                ps.setString(2, name);
                int result = ps.executeUpdate();

                System.out.println(result == 1 ? "Student added Successfully" : "Failed to add student");

            } catch (Exception ex) {
                System.out.println(ex);
            }

        }

    }

