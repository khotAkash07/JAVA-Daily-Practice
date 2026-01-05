package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_demo {
    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/college";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,"root","root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from sub");

        while (rs.next()){
            System.out.println(rs.getInt(1)+" ==> "+rs.getString(2));
        }
    }
}
