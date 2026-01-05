package org.SelfPractice;


import java.sql.*;

public class JDBC_Demo {
    public static void main(String[] args) throws Exception{

        String url  = "jdbc:mysql://localhost:3306/akash";
        String query = "select * from Stud";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,"root","root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getInt(1)+" => "+rs.getString(2));
        }
    }
}
