/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author Sonal L R
 */
public class test1 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/database","Java","july");
            PreparedStatement stmt=conn.prepareStatement("INSERT INTO table VALUES(?,?)");
            stmt.setInt(1,3);
            stmt.setString(2,"Rose");
            stmt.executeUpdate();
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}