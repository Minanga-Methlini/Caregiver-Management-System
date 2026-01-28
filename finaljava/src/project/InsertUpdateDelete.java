/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author Minanga Methlini
 */
public class InsertUpdateDelete {
    public static void setData(String Query,String msg)
    {
        Connection con = null;
        Statement st = null;
        
        try
        {
            con = connectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate(Query);
            
            if (!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
                
        }
        
        catch(Exception e)
        {}
        
        finally
        {
            try
                {}
            catch(Exception e)
                {}
        }
    }
}
