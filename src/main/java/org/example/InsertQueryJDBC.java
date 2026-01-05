package org.example;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQueryJDBC {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/college";
        String uname = "root";
        String pass = "root";
        String query = "INSERT INTO student(id,NAME,AGE) VALUES (7,'Sai',22),(8,'Akshata',22),(9,'Neeta',21)";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();

        int count = st.executeUpdate(query);
        System.out.println(count+" Rows Affected");

        con.close();
        st.close();
    }

}
