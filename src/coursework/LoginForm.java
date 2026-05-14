
package coursework;

import java.awt.Color;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginForm.class.getName());
    
    public LoginForm() {
        initComponents();
        lblWarning.setVisible(false);
        setLocationRelativeTo(null);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpw = new javax.swing.JPasswordField();
        lblWarning = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblRole6 = new javax.swing.JLabel();
        pnlCreateAcc = new javax.swing.JPanel();
        lblRole5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Username");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, -1));
        jPanel3.add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 320, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, -1));
        jPanel3.add(txtpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 320, -1));

        lblWarning.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblWarning.setText("invalid text here");
        jPanel3.add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 320, -1));

        pnlLogin.setBackground(new java.awt.Color(0, 153, 255));
        pnlLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLoginMouseExited(evt);
            }
        });
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRole6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRole6.setForeground(new java.awt.Color(255, 255, 255));
        lblRole6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole6.setText("Log in");
        pnlLogin.add(lblRole6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 60, -1));

        jPanel3.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 300, 50));

        pnlCreateAcc.setBackground(new java.awt.Color(0, 153, 255));
        pnlCreateAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCreateAccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCreateAccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCreateAccMouseExited(evt);
            }
        });
        pnlCreateAcc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRole5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRole5.setForeground(new java.awt.Color(255, 255, 255));
        lblRole5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole5.setText("Create Account");
        pnlCreateAcc.add(lblRole5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, -1));

        jPanel3.add(pnlCreateAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 300, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, -10, 370, 420));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Welcome to FarmSphere");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 840, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseClicked
        Color color2 = new Color(153,255,255);
        Color color1 = new Color(0,153,255);
        Functions.mouseClick(pnlLogin,color1,color2);
        
        if(txtuname.getText().isEmpty()||txtpw.getText().isEmpty())
        {
            lblWarning.setText("Please fill in all fields to continue");
            lblWarning.setVisible(true);
        }
        else if(DBvalidation.checkUserPassword(txtuname.getText(), txtpw.getText())== false)
        {
            lblWarning.setText("Incorrect Password!");
            lblWarning.setVisible(true);
        }
        else
        {
            String dbRole = DBvalidation.checkRole(txtuname.getText());
            String username = txtuname.getText();
            UserDetails details = new UserDetails(username,dbRole);
            if(dbRole.equals("Farmer"))
            {
                this.dispose();
                FarmerForm f = new FarmerForm();
                f.setVisible(true);
            }
            else if(dbRole.equals("Field Officer"))
            {
                this.dispose();
                FieldOfficerForm f = new FieldOfficerForm();
                f.setVisible(true);
            }
            else if(dbRole.equals("Buyer"))
            {
                this.dispose();
                BuyerForm f = new BuyerForm();
                f.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Role in Database");
            }
        }
        
    }//GEN-LAST:event_pnlLoginMouseClicked

    private void pnlCreateAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCreateAccMouseClicked
        
        Color color1 = new Color(153,255,255);
        Color color2 = new Color(0,153,255);
        Functions.mouseClick(pnlCreateAcc,color1,color2);
        
        this.dispose();
        SignupForm f1 = new SignupForm();
        f1.setVisible(true);
        
    }//GEN-LAST:event_pnlCreateAccMouseClicked

    private void pnlLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseEntered
        pnlLogin.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_pnlLoginMouseEntered

    private void pnlLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseExited
        pnlLogin.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_pnlLoginMouseExited

    private void pnlCreateAccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCreateAccMouseEntered
        pnlCreateAcc.setBackground(new Color(0,204,255));
    }//GEN-LAST:event_pnlCreateAccMouseEntered

    private void pnlCreateAccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCreateAccMouseExited
        pnlCreateAcc.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_pnlCreateAccMouseExited

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
        java.awt.EventQueue.invokeLater(() -> new LoginForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblRole5;
    private javax.swing.JLabel lblRole6;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JPanel pnlCreateAcc;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtpw;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
