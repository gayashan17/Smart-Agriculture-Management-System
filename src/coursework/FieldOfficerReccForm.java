/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coursework;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FieldOfficerReccForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FieldOfficerReccForm.class.getName());
    int farmerId;
    String farmerName;
    String cropName;
    /**
     * Creates new form FieldOfficerReccForm
     */
    public FieldOfficerReccForm()
    {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        lblWarning.setVisible(false);
        
    }
    public void setFarmerData(int farmerId, String farmerName, String cropName)
    {
        this.farmerId = farmerId; 
        this.farmerName = farmerName;
        this.cropName = cropName;

        lblFarmerName.setText("Recommendation for: " + this.farmerName);
        lblCrop.setText("Crop: " + this.cropName);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblFarmerName = new javax.swing.JLabel();
        lblCrop = new javax.swing.JLabel();
        pnlReturn2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnlUpdate = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecc = new javax.swing.JTextArea();
        lblWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFarmerName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblFarmerName.setText("Recc for farmer");
        jPanel2.add(lblFarmerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 430, 20));

        lblCrop.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCrop.setText("crop");
        jPanel2.add(lblCrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 470, 20));

        pnlReturn2.setBackground(new java.awt.Color(0, 153, 255));
        pnlReturn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReturn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlReturn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlReturn2MouseExited(evt);
            }
        });
        pnlReturn2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Return");
        pnlReturn2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        jPanel2.add(pnlReturn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 110, 40));

        pnlUpdate.setBackground(new java.awt.Color(0, 153, 255));
        pnlUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlUpdateMouseExited(evt);
            }
        });
        pnlUpdate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Update");
        pnlUpdate.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        jPanel2.add(pnlUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 110, 40));

        txtRecc.setColumns(20);
        txtRecc.setRows(5);
        jScrollPane1.setViewportView(txtRecc);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 640, 180));

        lblWarning.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblWarning.setForeground(new java.awt.Color(204, 0, 0));
        lblWarning.setText("Recc for farmer");
        jPanel2.add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 180, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 780, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlReturn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReturn2MouseClicked
        Color color1 = new Color(0,153,255);
        Color color2 = new Color(153,255,255);

        Functions.mouseClick(pnlReturn2, color1, color2);
        this.dispose();
    }//GEN-LAST:event_pnlReturn2MouseClicked

    private void pnlReturn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReturn2MouseEntered

    }//GEN-LAST:event_pnlReturn2MouseEntered

    private void pnlReturn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReturn2MouseExited

    }//GEN-LAST:event_pnlReturn2MouseExited

    private void pnlUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpdateMouseClicked
        Color color1 = new Color(0,153,255);
        Color color2 = new Color(153,255,255);

        Functions.mouseClick(pnlUpdate, color1, color2);

       if(txtRecc.toString().isEmpty())
       {
           lblWarning.setText("Please enter your reccomendation");
           lblWarning.setVisible(true);
       }
       else
       {
           Connection conn = null;
           try
           {
               conn = DBconnection.getConnection();
               
               String query = "INSERT INTO field_officer_recommendations (farmer_id,field_officer_id,recommendation) VALUES (?, ?, ?)";
               
               PreparedStatement ps = conn.prepareStatement(query);
               
               ps.setInt(1,farmerId);
               ps.setInt(2,UserDetails.getId());
               ps.setString(3,txtRecc.getText().trim());
               ps.executeUpdate();
               conn.close();
               this.dispose();
               JOptionPane.showMessageDialog(null,"Added recommendation");
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
       }
    }//GEN-LAST:event_pnlUpdateMouseClicked

    private void pnlUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpdateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlUpdateMouseEntered

    private void pnlUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpdateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlUpdateMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FieldOfficerReccForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCrop;
    private javax.swing.JLabel lblFarmerName;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JPanel pnlReturn;
    private javax.swing.JPanel pnlReturn1;
    private javax.swing.JPanel pnlReturn2;
    private javax.swing.JPanel pnlUpdate;
    private javax.swing.JTextArea txtRecc;
    // End of variables declaration//GEN-END:variables
}
