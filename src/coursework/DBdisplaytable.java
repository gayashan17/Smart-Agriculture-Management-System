/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
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
    
    public static void loadIntoBuyerTable(JTable table)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT c.crop_name AS \"Crop\", u.name AS \"Farmer\", c.category AS \"Category\", c.harvest_date AS \"Harvested Date\", c.quantity AS \"Quantity\", hp.price AS \"Price\" FROM harvest_pricing hp INNER JOIN crops c ON hp.cropid = c.cropid INNER JOIN users u ON c.farmer_id = u.id;";
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            
            while(rs.next())
            {
                String crop = rs.getString("Crop");
                String farmer = rs.getString("Farmer");
                String cat = rs.getString("Category");
                String dbdate = rs.getString("Harvested Date");
                String quantity = rs.getString("Quantity");
                String price = rs.getString("Price");
                model.addRow(new Object[]{crop, farmer, cat, dbdate, quantity, price});
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
    
    public static void loadIntoFOForm(JTable table)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT u.name AS \"FarmerName\", c.crop_name AS \"CropName\", c.category AS \"Category\", c.planting_date AS \"PlantingDate\", c.harvest_date AS \"HarvestingDate\", c.land_size AS \"LandSize\", c.quantity AS \"Quantity\", c.status AS \"Status\" FROM crops c INNER JOIN users u ON c.farmer_id = u.id;";
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                String farmer = rs.getString("FarmerName");
                String crop = rs.getString("CropName");
                String category = rs.getString("Category");
                String planting = rs.getString("PlantingDate");
                String harvesting = rs.getString("HarvestingDate");
                String size = rs.getString("LandSize");
                String qty = rs.getString("Quantity");
                String status = rs.getString("Status");
                model.addRow(new Object[]{farmer,crop,category,planting,harvesting,size,qty,status});
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
    
    public static void loadIntoFOViewForm(JTable table)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT u.id AS \"FarmerID\", u.name AS \"FarmerName\", COUNT(c.cropid) AS \"CropsCount\" FROM users u INNER JOIN crops c ON u.id = c.farmer_id GROUP BY u.id, u.name;";
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                String fid = rs.getString("FarmerID");
                String fName = rs.getString("FarmerName");
                String cropCount = rs.getString("CropsCount");

                model.addRow(new Object[]{fid,fName,cropCount});
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
    
    public static void loadIntoFarmerRecc(JTable table)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT field_officer_id,recommendation ,created_at FROM field_officer_recommendations WHERE farmer_id=?";
            
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1,UserDetails.getId());
            ResultSet rs = st.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                String ffid = rs.getString("field_officer_id");
                String recc = rs.getString("recommendation");
                String date = rs.getString("created_at");

                model.addRow(new Object[]{ffid,date,recc});
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
    
    
    public static void loadIntoFarmerPReqs(JTable table)
    {
        Connection conn = null;
        try
        {
            conn = DBconnection.getConnection();
            
            String query = "SELECT buyer_username , crop_name,quantity_requested,request_date,status FROM purchase_requests";
            
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                String bName = rs.getString("buyer_username");
                String cName = rs.getString("crop_name");
                String quan = rs.getString("quantity_requested");
                String date = rs.getString("request_date");
                String status = rs.getString("status");

                model.addRow(new Object[]{bName,cName,quan,date,status});
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
}
