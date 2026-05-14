/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework;

/**
 *
 * @author User
 */
public class UserDetails {
    private static String username;
    private static String role;
    
    public UserDetails(String username,String role)
    {
        this.username = username;
        this.role = role;
    }
    
    public static String getUsername(){return username;}
    public static String getRole(){return role;}
          
}
