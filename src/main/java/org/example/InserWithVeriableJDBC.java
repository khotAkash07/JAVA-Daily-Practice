package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InserWithVeriableJDBC {
    public static void main(String[] args) throws Exception{

        int id = 11;
        String name = "Nilu Don";
        int age = 25;

        String url = "jdbc:mysql://localhost:3306/college";
        String uname = "root";
        String pass = "root";
        String query = "INSERT INTO student Values(?,?,?)";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,id);
        st.setString(2,name);
        st.setInt(3,age);

        int count = st.executeUpdate();
        System.out.println(count+" Rows Affected....");
        con.close();
        st.close();
    }
}
