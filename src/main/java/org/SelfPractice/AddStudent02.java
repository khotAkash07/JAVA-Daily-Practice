package org.SelfPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

class Config{
    Connection conn = null;
    public Connection getConnection() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/akash","root","root");
    }
}
class AddStud{

    static Config conn = new Config();

    public void addStduent() throws Exception{
        Connection con = conn.getConnection();
    if(con != null) {
        FileReader fr = new FileReader("E:\\01_Chai_aur_Code\\JavaScript\\Demo.csv");
        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = (br.readLine())) != null) {

            String[] str = line.split(",");


            PreparedStatement ps = con.prepareStatement("insert into player(id, name, age) values(?, ?, ?)");
            ps.setInt(1, Integer.parseInt(str[0]));
            ps.setString(2, str[1]);
            ps.setInt(3, Integer.parseInt(str[2]));

            int result = ps.executeUpdate();

        }
    }else {
        System.out.println("Connection Not Established");
        }
    }
    public void showPlayers() throws Exception {
        Connection con = conn.getConnection();

        if(con != null) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from player");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " "+rs.getString(2) + " " + rs.getInt(3));
            }
        }
    }

    public void updatePlayer() throws Exception {

        Connection con = conn.getConnection();
        if(con != null){
            String name = "Akash Khot";

            String query = "update player set name=? where id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,name);
            ps.setInt(2,10);

            ps.executeUpdate();
        }else {
            System.out.println("Connection Failed");
        }
    }

    public void deletePlayer() throws Exception{
        Connection con = conn.getConnection();

        if(con != null){

            PreparedStatement st = con.prepareStatement("delete from player where id=?");
            st.setInt(1,2);
            int a = st.executeUpdate();

        }else {
            System.out.println("Connection Failed");
        }
    }
}


public class AddStudent02 {
    public static void main(String[] args) throws Exception {
        AddStud as = new AddStud();
        //as.addStduent();
        as.showPlayers();
       // as.updatePlayer();
        as.deletePlayer();
        as.showPlayers();
    }
}
