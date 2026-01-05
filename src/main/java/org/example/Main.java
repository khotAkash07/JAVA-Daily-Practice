package org.example;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello, Akash!");

        String url = "jdbc:mysql://localhost:3306/college";
        String uname = "root";
        String pass = "root";
        String query = "select * from student";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getString("NAME")+"\t"+rs.getInt("AGE"));
        }
        con.close();
        st.close();
    }
}