package org.SelfPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class CSV_Demo {
    public static void main(String[] args) throws Exception {
        inserData();
        showData();

    }
    public static Connection getConnection() throws Exception{
        String url = "jdbc:mysql://localhost:3306/akash";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url,"root","root");
    }

    public static void inserData() throws Exception{
        Connection conn = getConnection();
        if(conn != null) {

            FileReader fr = new FileReader("E:\\01_Chai_aur_Code\\JavaScript\\Demo.csv");
            BufferedReader br = new BufferedReader(fr);
            boolean flag = false;
            String line;
            while((line = (br.readLine() ))!= null){

                String [] val = line.split(",");

                PreparedStatement ps = conn.prepareStatement("insert into player(id, name, age) values(?, ?, ?)");
                ps.setInt(1, Integer.parseInt(val[0]));
                ps.setString(2,val[1]);
                ps.setInt(3,Integer.parseInt(val[2]));

                int value = ps.executeUpdate();
                if(value > 0){
                    flag = true;
                }
            }
            System.out.println(flag?"File uploaded Successfully":"Problem while file uploading....");
        }else {
            System.out.println("Connection Failed...");
        }
        assert conn != null;
        conn.close();
    }

    public static void showData() throws Exception{

        Connection conn = getConnection();

        if(conn != null){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from player");
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
        }else{
            System.out.println("Connection not established");
        }

    }

}
