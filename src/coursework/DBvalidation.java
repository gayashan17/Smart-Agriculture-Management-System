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
            }  
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while trying to Check user: "+e);
            System.out.println(e);
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
    
    public static boolean checkUserPassword(String username,String password)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT password FROM users WHERE username=? AND password=?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2,password);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error while trying to check for DB password: "+e);
            System.out.println(e);
            return false;
        }
        finally
        {
            if(conn!= null)
            {
                try
                {
                    conn.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error while trying to close connection: "+e);
                }
            }
        }
    }
    
    public static String checkRole(String username)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT role FROM users WHERE username=?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,username);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                String dbRole = rs.getString("role");
                return dbRole;
            }
            else
            {
                return null;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while trying to check user Role: "+e);
            System.out.println(e);
        }
        finally
        {
            if(conn!= null)
            {
                try
                {
                    conn.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error while trying to close connection: "+e);
                }
            }
        }
        return null;
    }
}
