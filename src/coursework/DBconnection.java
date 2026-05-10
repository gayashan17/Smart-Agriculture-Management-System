/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class DBconnection {
    private static final String url = "jdbc:mysql://localhost:3306/farmspheredb";
    private static final String user = "root";
    private static final String password = "";

    public static Connection getConnection() throws SQLException {
        try {
            // Load the driver (optional in newer Java versions, but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException e) {
            throw new SQLException("JDBC Driver not found!"+ e);
        }
    }
}
