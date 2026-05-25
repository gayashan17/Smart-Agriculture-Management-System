/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DBdisplaytable {
    public static void loadIntoTable(JTable table)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT * FROM crops";
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getInt("cropid"),
                    rs.getInt("farmer_id"),
                    rs.getString("crop_name"),
                    rs.getString("category"),
                    rs.getDate("planting_date"),
                    rs.getDate("harvest_date"),
                    rs.getString("land_size"),
                    rs.getString("quantity"),
                    rs.getString("status")
                });
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while trying to load into Table"+e);
             System.out.println(e);
        }
        finally
        {
            if(conn != null)
            {
                try
                {
                    conn.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error while trying to close connection");
                }
                
            }
        }
    }
    
    public static void loadIntoTableUID(JTable table)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            int id = DBvalidation.checkId(UserDetails.getUsername());
            String query = "SELECT * FROM crops WHERE farmer_id=?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getInt("cropid"),
                    rs.getInt("farmer_id"),
                    rs.getString("crop_name"),
                    rs.getString("category"),
                    rs.getDate("planting_date"),
                    rs.getDate("harvest_date"),
                    rs.getString("land_size"),
                    rs.getString("quantity"),
                    rs.getString("status")
                });
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while trying to load into Table"+e);
             System.out.println(e);
        }
        finally
        {
            if(conn != null)
            {
                try
                {
                    conn.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error while trying to close connection");
                }
                
            }
        }
    }
    
    public static void loadIntoTableStatus(JTable table,String status)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            String query = "SELECT * FROM crops WHERE status=?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,status);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getInt("cropid"),
                    rs.getInt("farmer_id"),
                    rs.getString("crop_name"),
                    rs.getString("category"),
                    rs.getDate("planting_date"),
                    rs.getDate("harvest_date"),
                    rs.getString("land_size"),
                    rs.getString("quantity"),
                    rs.getString("status")
                });
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while trying to load into Table"+e);
             System.out.println(e);
        }
        finally
        {
            if(conn != null)
            {
                try
                {
                    conn.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error while trying to close connection");
                }
                
            }
        }
    }
    
    public static void loadIntoTableSearch(JTable table,String search)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            String query = "SELECT * FROM crops WHERE crop_name=?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,search);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                model.addRow(new Object[]
                {
                    rs.getInt("cropid"),
                    rs.getInt("farmer_id"),
                    rs.getString("crop_name"),
                    rs.getString("category"),
                    rs.getDate("planting_date"),
                    rs.getDate("harvest_date"),
                    rs.getString("land_size"),
                    rs.getString("quantity"),
                    rs.getString("status")
                });
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while trying to load into Table"+e);
             System.out.println(e);
        }
        finally
        {
            if(conn != null)
            {
                try
                {
                    conn.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error while trying to close connection");
                }
                
            }
        }
    }
    
    public static void loadIntoAdminTable(JTable table)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            String query = "SELECT username, role FROM users";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                String username = rs.getString("username");
                String role = rs.getString("role");
                
                Object[] rowData = {username,role};
                model.addRow(rowData);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while trying to load into Table"+e);
             System.out.println(e);
        }
        finally
        {
            if(conn != null)
            {
                try
                {
                    conn.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error while trying to close connection");
                }
                
            }
        }
    }
    
    public static boolean updateStatusTable(int cropId,int farmerId,String newStatus)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            String query = "SELECT * FROM crops WHERE cropId= ? AND farmer_id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, cropId);
            ps.setInt(2, farmerId);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(null,"You can only Update your crop status!");
            }
            else
            {
                try
                {
                    String query1 = "UPDATE crops set status=? WHERE cropId=?";
                    PreparedStatement ps2 = conn.prepareStatement(query1);
                    ps2.setString(1,newStatus);
                    ps2.setInt(2,cropId);
                    ps2.executeUpdate();
                    return true;
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Failed to Update crop stauts"+e);
                }
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error while trying to Update Table"+e);
            System.out.println(e);
        }
        finally
        {
            if(conn != null)
            {
                try
                {
                    conn.close();
                }
                catch(Exception e)
                {
                    System.out.println("Error while trying to close connection");
                }
                
            }
        }
        return false;
    }
}
