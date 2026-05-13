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
    private String username;
    private String role;
    
    public UserDetails(String username,String role)
    {
        this.username = username;
        this.role = role;
    }
    public UserDetails(){}
    
    public String getUsername(){return username;}
    public String getRole(){return role;}
          
}
