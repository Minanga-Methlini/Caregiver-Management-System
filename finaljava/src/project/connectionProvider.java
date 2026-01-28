/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Minanga Methlini
 */
public class connectionProvider {
    public static Connection getCon()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cg","root","2005");
            
            return con;
            
            
        }
        
        catch(ClassNotFoundException | SQLException e)
        { 
            return null;
        }
    }
}
