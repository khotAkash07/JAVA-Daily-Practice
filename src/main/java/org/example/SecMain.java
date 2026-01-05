package org.example;

import java.sql.*;

public class SecMain {
    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/college";
        String uname = "root";
        String pass = "root";
        String query = "SELECT * from student";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        String userData = "";
        while(rs.next()){
            userData = rs.getInt(1)+" <==> "+rs.getString(2)+" <==>  "+rs.getInt(3);
            System.out.println(userData);
        }
        con.close();
        st.close();
    }
}
