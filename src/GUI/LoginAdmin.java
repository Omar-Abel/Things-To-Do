/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import database.loginDB;
import database.conexionDB;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class LoginAdmin extends javax.swing.JFrame {
    loginDB log = new loginDB();
    conexionDB cnx = new conexionDB();
    static int ID ;
    /**
     * Creates new form AdminApp
     */
    public LoginAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnentrarAdmin = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pwsdcontraAdmin = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        btnvolveradmin = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnvolvearusuario = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Administrador");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 320, 60));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Things to do");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 320, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 180, 216));
        jLabel6.setText("Bienvenidos");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 230, 50));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(3, 4, 94));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Inserte datos para entrar");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 230, 50));

        btnentrarAdmin.setBackground(new java.awt.Color(0, 180, 216));
        btnentrarAdmin.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnentrarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnentrarAdmin.setText("Entrar");
        btnentrarAdmin.setBorder(null);
        btnentrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarAdminActionPerformed(evt);
            }
        });
        jPanel3.add(btnentrarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 220, 60));

        jLabel11.setText("Admin");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txtAdmin.setBorder(null);
        txtAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminActionPerformed(evt);
            }
        });
        jPanel3.add(txtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 270, 30));

        jLabel12.setText("_______________________________________________________________");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 280, -1));

        jLabel13.setText("_________________________________________________________");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 280, 20));

        jLabel14.setText("Contraseña");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        pwsdcontraAdmin.setBorder(null);
        jPanel3.add(pwsdcontraAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 280, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 400, 480));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Group 1125new.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnvolveradmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Group 1126new.png"))); // NOI18N
        jPanel1.add(btnvolveradmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/newx2.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        btnvolvearusuario.setBackground(new java.awt.Color(3, 4, 94));
        btnvolvearusuario.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnvolvearusuario.setForeground(new java.awt.Color(255, 255, 255));
        btnvolvearusuario.setText("Volver a Usuario");
        btnvolvearusuario.setBorder(null);
        btnvolvearusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolvearusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnvolvearusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 250, 60));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rectangle 1.png"))); // NOI18N
        jLabel20.setText("jLabel1");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1050, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminActionPerformed

    private void btnentrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarAdminActionPerformed
        // TODO add your handling code here:
        ID = log.loginA(txtAdmin.getText(), pwsdcontraAdmin.getText());
        if (ID >= 1){    
            AdminApp newframe = new AdminApp();
            newframe.setVisible(true);
            this.dispose();        
        }else{
            JOptionPane.showConfirmDialog(rootPane,"El correo o la contraseña es incorrecta", "login",JOptionPane.PLAIN_MESSAGE);
        }
        cnx.cerrar();
    }//GEN-LAST:event_btnentrarAdminActionPerformed

    private void btnvolvearusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolvearusuarioActionPerformed
        // TODO add your handling code here:
        Log newframe = new Log();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolvearusuarioActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentrarAdmin;
    private javax.swing.JButton btnvolvearusuario;
    private javax.swing.JLabel btnvolveradmin;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pwsdcontraAdmin;
    private javax.swing.JTextField txtAdmin;
    // End of variables declaration//GEN-END:variables
}
