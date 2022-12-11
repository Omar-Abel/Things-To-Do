
package GUI;
import java.sql.ResultSet;
import java.sql.Connection;
import database.conexionDB;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import database.CRUD_To_Do;
import javax.swing.DefaultCellEditor;
import javax.swing.JPasswordField;
import javax.swing.table.TableColumn;

/**
 *
 * @author User
 */
public class AdminApp extends javax.swing.JFrame {
    LoginAdmin ID = new LoginAdmin();
    conexionDB cnx = new conexionDB();
    CRUD_To_Do cursor = new CRUD_To_Do();
    /**
     * Creates new form AdminApp
     */
    public AdminApp() {
        initComponents();
        informacionTareas(); 
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(agg, "/home/darielrdriguez/NetBeansProjects/To-Do/InterfazG/Java interfazG/add-note-4110_J4mvUNczA.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(act, "/home/darielrdriguez/NetBeansProjects/To-Do/InterfazG/Java interfazG/reload-5685_XLZ_AAD5b.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(borr, "/home/darielrdriguez/NetBeansProjects/To-Do/InterfazG/Java interfazG/remove-note-4109_APcswrtQZ.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(ayuda, "/home/darielrdriguez/NetBeansProjects/To-Do/InterfazG/Java interfazG/wrench-5969_WfhrMla0Z.png");
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        agg = new javax.swing.JLabel();
        act = new javax.swing.JLabel();
        borr = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnactAdmin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnborrAdmin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnaggAdmin = new javax.swing.JButton();
        txtcorreoAdmin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtnombreAdmin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pwscontraAdmin = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtbuscarAdmin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ayuda = new javax.swing.JLabel();
        btnayudaAmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 180, 216));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agg.setText("agg");
        jPanel3.add(agg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 40, 40));

        act.setText("act");
        jPanel3.add(act, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 40, 40));

        borr.setText("borr");
        jPanel3.add(borr, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rectangle 1.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 40, 40));

        btnactAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnactAdmin.setForeground(new java.awt.Color(0, 180, 216));
        btnactAdmin.setText("Actualizar");
        btnactAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnactAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactAdminActionPerformed(evt);
            }
        });
        jPanel3.add(btnactAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 150, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rectangle 1.png"))); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 40, 40));

        btnborrAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnborrAdmin.setForeground(new java.awt.Color(0, 180, 216));
        btnborrAdmin.setText("Borrar");
        btnborrAdmin.setToolTipText("");
        btnborrAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnborrAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnborrAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnborrAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrAdminActionPerformed(evt);
            }
        });
        jPanel3.add(btnborrAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 160, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rectangle 1.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 40, 40));

        btnaggAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnaggAdmin.setForeground(new java.awt.Color(0, 180, 216));
        btnaggAdmin.setText("Agregar");
        btnaggAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnaggAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaggAdminActionPerformed(evt);
            }
        });
        jPanel3.add(btnaggAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 150, 60));

        txtcorreoAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(txtcorreoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 190, 50));

        jLabel12.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel12.setText("Correo");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel13.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel13.setText("contraseña");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        txtnombreAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(txtnombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 50));

        jLabel11.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel11.setText("Nombre de Usuario");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html><center>Administración de usuarios");
        jLabel8.setFocusable(false);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 440, 170));

        pwscontraAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(pwscontraAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 200, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 650));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 670, 470));

        txtbuscarAdmin.setBackground(new java.awt.Color(0, 180, 216));
        txtbuscarAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtbuscarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarAdminActionPerformed(evt);
            }
        });
        jPanel1.add(txtbuscarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 340, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Group 1126new.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/newx2.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -40, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Group 1130.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, -80, -1, -1));

        ayuda.setText("ayu");
        jPanel1.add(ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 580, 30, 30));

        btnayudaAmin.setBackground(new java.awt.Color(3, 4, 94));
        btnayudaAmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnayudaAmin.setForeground(new java.awt.Color(255, 255, 255));
        btnayudaAmin.setText("Ayuda");
        btnayudaAmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnayudaAminActionPerformed(evt);
            }
        });
        jPanel1.add(btnayudaAmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 570, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnborrAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrAdminActionPerformed
        // TODO add your handling code here:
        try{
            int fila = this.jTable1.getSelectedRow();
            int columna = this.jTable1.getSelectedColumn();
            String data = String.valueOf(this.jTable1.getValueAt(fila, columna));
            cursor.eliminarA(Integer.parseInt(data));
            informacionTareas();   
        }catch(Exception e){
            JOptionPane.showMessageDialog( this,"Favor seleccionar un campo para eliminar");
        }
    }//GEN-LAST:event_btnborrAdminActionPerformed

    private void btnayudaAminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnayudaAminActionPerformed
        // TODO add your handling code here:
        ayudaAdmin1 newframe = new ayudaAdmin1();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnayudaAminActionPerformed

    private void btnaggAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaggAdminActionPerformed
        // TODO add your handling code here:
        if (txtnombreAdmin.getText().isEmpty() || txtcorreoAdmin.getText().isEmpty() || pwscontraAdmin.getText().isEmpty()){
            JOptionPane.showMessageDialog( this,"Debe completar todos los campos");
        }else{
            cursor.agregarA(ID.ID, txtnombreAdmin.getText(), pwscontraAdmin.getText(),txtcorreoAdmin.getText());
            informacionTareas();        
        }
    }//GEN-LAST:event_btnaggAdminActionPerformed

    private void btnactAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactAdminActionPerformed
        // TODO add your handling code here:
        try{
            int fila = this.jTable1.getSelectedRow();
            int columna = this.jTable1.getSelectedColumn();
            String data = String.valueOf(this.jTable1.getValueAt(fila, columna));
            cursor.actualizarA(Integer.parseInt(data), txtnombreAdmin.getText());
            informacionTareas();
        }catch (Exception e){
            JOptionPane.showMessageDialog( this,"Favor seleccionar el campo ID");
        };
    }//GEN-LAST:event_btnactAdminActionPerformed

    private void txtbuscarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarAdminActionPerformed
        // TODO add your handling code here:
        if(txtbuscarAdmin.getText().isEmpty()){
            informacionTareas();
        }else{
            listar(txtbuscarAdmin.getText());
        }
        
    }//GEN-LAST:event_txtbuscarAdminActionPerformed

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
            java.util.logging.Logger.getLogger(AdminApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminApp().setVisible(true);
            }
        });
    }
    private void informacionTareas(){
        Connection cn = cnx.conexion();
        String SQL = "SELECT * FROM usuario";
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("nombre");        
        tabla.addColumn("correo");
        jTable1.setModel(tabla);
        String data[] = new String[3];
        Statement st;
        try{    
            st = (Statement) cn.createStatement();
            ResultSet rs =st.executeQuery(SQL);
            while (rs.next()){      
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(4);
                tabla.addRow(data);
            }
            jTable1.setModel(tabla);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Error en la consulta SQL: %s".formatted(e));
        }
        cnx.cerrar();
    }
        private void listar(String usuario){
        Connection cn = cnx.conexion();
        String SQL = "SELECT * FROM usuario WHERE nombreUsuario = '%s'".formatted(usuario);
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("ID");
        tabla.addColumn("nombre");        
        tabla.addColumn("correo");
        jTable1.setModel(tabla);
        String data[] = new String[3];
        Statement st;
        try{    
            st = (Statement) cn.createStatement();
            ResultSet rs =st.executeQuery(SQL);
            while (rs.next()){      
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(4);
                tabla.addRow(data);
            }
            jTable1.setModel(tabla);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Error en la consulta SQL: %s".formatted(e));
        }
        cnx.cerrar();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel act;
    private javax.swing.JLabel agg;
    private javax.swing.JLabel ayuda;
    private javax.swing.JLabel borr;
    private javax.swing.JButton btnactAdmin;
    private javax.swing.JButton btnaggAdmin;
    private javax.swing.JButton btnayudaAmin;
    private javax.swing.JButton btnborrAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField pwscontraAdmin;
    private javax.swing.JTextField txtbuscarAdmin;
    private javax.swing.JTextField txtcorreoAdmin;
    private javax.swing.JTextField txtnombreAdmin;
    // End of variables declaration//GEN-END:variables
}
