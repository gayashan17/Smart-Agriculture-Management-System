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
    private static String name;
    public UserDetails(String username,String role,String name)
    {
        this.username = username;
        this.role = role;
        this.name = name;
    }
    
    public static String getUsername(){return username;}
    public static String getRole(){return role;}
    public static String getName(){return name;}
          
}
