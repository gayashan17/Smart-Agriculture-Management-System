/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework;
import java.sql.*;

import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class AdminDashboard {
    
    
    public static void loadDashboard()
    {
        Connection conn = null;
        try
        {
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while trying to load Dashboard Details: "+ e);
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
                    System.out.println("Error trying to close connection: "+e);
                }
            }
        }
    }
    
    public static String loadFarmerCount()
    {
        Connection conn = null;
        String count = null;
        try
        {
            conn = DBconnection.getConnection();
            
            // Updated query to count users whose role is 'Farmer'
            String query = "SELECT COUNT(*) AS total_farmers FROM users WHERE role = 'Farmer'";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) 
            {
                count = rs.getString("total_farmers");
            }
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while trying to load Dashboard Details: "+ e);
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
                    System.out.println("Error trying to close connection: "+e);
                }
            }
        }
        return count;
    }
}
