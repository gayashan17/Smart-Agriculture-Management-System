package coursework;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
public class DBvalidation {
    
    public static String checkUser(String username)
    {
        Connection conn = null; 
        String dbname = null;
        try
        {
            conn = DBconnection.getConnection();
            String query = "SELECT username FROM users WHERE username =?";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                dbname = rs.getString("username");
                return dbname;
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showInputDialog(null, "Error while trying to Check user: "+e);
        }
        finally
        {
            try
            {
                if(conn != null)
                {
                    conn.close();
                }
                
            }
            catch(Exception e)
            {
                System.out.println("Error while trying to close conn: "+e);
            }
            
        }
        
        if(dbname !=null)
        {
            return dbname;
        }
        else
        {
            return null;
        }
    }
    
    
}
