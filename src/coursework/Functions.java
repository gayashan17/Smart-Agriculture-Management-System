/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework;

import java.awt.Color;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class Functions {
    public static void mouseClick(JPanel pnl,Color color1,Color color2)
    {
        pnl.setBackground(color2); //change color of button (panel)
        Timer timer = new Timer(200, new java.awt.event.ActionListener()
        {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) 
        {
            pnl.setBackground(color1);  //change it back into default after a brief time
        }
        });
        timer.setRepeats(false);
        timer.start();
    }
    
 
}
