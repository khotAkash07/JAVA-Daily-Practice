package org.SelfPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FirstDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/akash";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, "root", "root");
            if (conn != null) {
                PreparedStatement ps = conn.prepareStatement("select * from employee where id = "+1);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.print(rs.getInt(1)+" |\t");
                    System.out.print(rs.getString(2)+"\t|\t");
                    System.out.print(rs.getInt(3)+"  |");
                    System.out.println("\n------------------------");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
