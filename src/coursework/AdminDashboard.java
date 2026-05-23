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
    
    public static String loadOfficerCount()
    {
        Connection conn = null;
        String count = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT COUNT(*) AS total_Officers FROM users WHERE role = 'Field Officer'";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) 
            {
                count = rs.getString("total_Officers");
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
    
    public static String loadBuyerCount()
    {
        Connection conn = null;
        String count = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT COUNT(*) AS total_Buyers FROM users WHERE role = 'Buyer'";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) 
            {
                count = rs.getString("total_Buyers");
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
    
    
    //crop detail display fucntions 
    
    
    public static String loadCropCount()
    {
        Connection conn = null;
        String count = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT COUNT(*) AS total_crops FROM crops";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) 
            {
                count = rs.getString("total_crops");
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
    
    public static String loadHarvestReadyCount()
    {
        Connection conn = null;
        String count = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT COUNT(*) AS total_crops FROM crops WHERE status = 'Ready to Harvest'";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) 
            {
                count = rs.getString("total_crops");
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
    
    public static String loadHarvestedCount()
    {
        Connection conn = null;
        String count = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT COUNT(*) AS total_crops FROM crops WHERE status = 'Harvested'";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) 
            {
                count = rs.getString("total_crops");
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
    
    public static String loadDamgedCount()
    {
        Connection conn = null;
        String count = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT COUNT(*) AS total_crops FROM crops WHERE status = 'Damaged'";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) 
            {
                count = rs.getString("total_crops");
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
