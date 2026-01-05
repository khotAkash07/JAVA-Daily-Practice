package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/college";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,"root","root");
        PreparedStatement ps = con.prepareStatement("insert into sub(id,sub_name) values(?,?)");
        ps.setInt(1,5);
        ps.setString(2,"Buddimatta");

        int i = ps.executeUpdate();
        if(i > 0) {
            System.out.println("done");
        }else {
            System.out.println("Not Done");
        }
    }
}
