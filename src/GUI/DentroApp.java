
package GUI;


import java.sql.ResultSet;
import java.sql.Connection;
import database.conexionDB;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import database.CRUD_To_Do;
import java.util.Calendar;


/**
 *
 * @author User
 */
public class DentroApp extends javax.swing.JFrame{
    Log ID = new Log();
    conexionDB cnx = new conexionDB();
    CRUD_To_Do cursor = new CRUD_To_Do();
    int day, month, year;
    
    
    public DentroApp() {
        initComponents();
        informacionTareas(ID.ID); 
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Calendar date = Calendar.getInstance();
        jCalendar1.setMinSelectableDate(date.getTime());
        jPanel2.setVisible(false);
        jCalendar1.setVisible(false);
        jButton2.setVisible(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(agg, "C:\\Users\\omarl\\Dev\\To-Do\\InterfazG\\Java interfazG\\add-note-4110_J4mvUNczA.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(act, "C:\\Users\\omarl\\Dev\\To-Do\\InterfazG\\Java interfazG\\reload-5685_XLZ_AAD5b.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(borr, "C:\\Users\\omarl\\Dev\\To-Do\\InterfazG\\Java interfazG\\remove-note-4109_APcswrtQZ.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(comp, "C:\\Users\\omarl\\Dev\\To-Do\\InterfazG\\Java interfazG\\happy-emoji-2947_XWI8qzIMz.png");
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
        agg = new javax.swing.JLabel();
        act = new javax.swing.JLabel();
        borr = new javax.swing.JLabel();
        comp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnagg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnact = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnborr = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btncomp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtfechainicio = new javax.swing.JTextField();
        txtaggtarea2 = new javax.swing.JTextField();
        txtfechafinal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblista1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agg.setText("agg");
        jPanel1.add(agg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 40, 40));

        act.setText("act");
        jPanel1.add(act, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 40, 40));

        borr.setText("borr");
        jPanel1.add(borr, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 40, 40));

        comp.setText("comp");
        jPanel1.add(comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rectangle 1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 40, 40));

        btnagg.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnagg.setForeground(new java.awt.Color(0, 180, 216));
        btnagg.setText("Agregar");
        btnagg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnagg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaggActionPerformed(evt);
            }
        });
        jPanel1.add(btnagg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 160, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rectangle 1.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 40, 40));

        btnact.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnact.setForeground(new java.awt.Color(0, 180, 216));
        btnact.setText("Actualizar");
        btnact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnact.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactActionPerformed(evt);
            }
        });
        jPanel1.add(btnact, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 160, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rectangle 1.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 40, 40));

        btnborr.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnborr.setForeground(new java.awt.Color(0, 180, 216));
        btnborr.setText("Borrar");
        btnborr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnborr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnborr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrActionPerformed(evt);
            }
        });
        jPanel1.add(btnborr, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 160, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rectangle 1.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 50, 50));

        btncomp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btncomp.setForeground(new java.awt.Color(0, 180, 216));
        btncomp.setText("Completado");
        btncomp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btncomp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncompActionPerformed(evt);
            }
        });
        jPanel1.add(btncomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, 220, 70));

        jButton1.setBackground(new java.awt.Color(3, 4, 94));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver al menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 160, 50));

        txtfechainicio.setEditable(false);
        txtfechainicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtfechainicio.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtfechainicioComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                txtfechainicioComponentRemoved(evt);
            }
        });
        txtfechainicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfechainicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtfechainicioMouseExited(evt);
            }
        });
        txtfechainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechainicioActionPerformed(evt);
            }
        });
        txtfechainicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfechainicioKeyPressed(evt);
            }
        });
        jPanel1.add(txtfechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 280, 30));

        txtaggtarea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtaggtarea2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaggtarea2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtaggtarea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 280, 30));

        txtfechafinal.setEditable(false);
        txtfechafinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtfechafinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfechafinalMouseClicked(evt);
            }
        });
        txtfechafinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechafinalActionPerformed(evt);
            }
        });
        jPanel1.add(txtfechafinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 280, 30));

        jLabel5.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel5.setText("Agregar Tarea");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 20));

        jLabel7.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Final");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 90, -1));

        jLabel8.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de inicio");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 120, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Group 1124.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCalendar1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 460, 310));

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 140, 30));

        jButton3.setText("Seleccionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 140, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 520, 370));

        tblista1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblista1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 650, 450));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Group 1130.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, -150, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Group 112532.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Group 1130.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 310, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaggActionPerformed
        // TODO add your handling code here:
        if (txtaggtarea2.getText().isEmpty() || txtfechainicio.getText().isEmpty() || txtfechafinal.getText().isEmpty()){
            JOptionPane.showMessageDialog( this,"Debe completar todos los campos");
        }else{
            cursor.agregarU(ID.ID, txtaggtarea2.getText(), txtfechainicio.getText(),txtfechafinal.getText());
            informacionTareas(ID.ID);        
        }
        
    }//GEN-LAST:event_btnaggActionPerformed

    private void btnactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactActionPerformed
        // TODO add your handling code here:
        try{
            int fila = this.tblista1.getSelectedRow();
            int columna = this.tblista1.getSelectedColumn();
            String data = String.valueOf(this.tblista1.getValueAt(fila, columna));
            cursor.actualizarU(ID.ID, txtaggtarea2.getText(),data);
            informacionTareas(ID.ID);
        }catch (Exception e){
            JOptionPane.showMessageDialog( this,"Favor seleccionar un campo");
        };

    }//GEN-LAST:event_btnactActionPerformed

    private void txtfechainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechainicioActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_txtfechainicioActionPerformed

    private void txtaggtarea2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaggtarea2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaggtarea2ActionPerformed

    private void txtfechafinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechafinalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtfechafinalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu newframe = new Menu();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnborrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrActionPerformed
        // TODO add your handling code here:
        try{
            int fila = this.tblista1.getSelectedRow();
            int columna = this.tblista1.getSelectedColumn();
            String data = String.valueOf(this.tblista1.getValueAt(fila, columna));
            cursor.eliminarU(ID.ID, data);
            informacionTareas(ID.ID);   
        }catch(Exception e){
            JOptionPane.showMessageDialog( this,"Favor seleccionar un campo para eliminar");
        }
    }//GEN-LAST:event_btnborrActionPerformed

    private void btncompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncompActionPerformed
        // TODO add your handling code here:
        try{
            int fila = this.tblista1.getSelectedRow();
            int columna = this.tblista1.getSelectedColumn();
            String data = String.valueOf(this.tblista1.getValueAt(fila, columna));
            cursor.completado(ID.ID, data);
            informacionTareas(ID.ID);   
        }catch(Exception e){
            JOptionPane.showMessageDialog( this,"Favor seleccionar una fila que haya completado");
        }   
    }//GEN-LAST:event_btncompActionPerformed

    private void txtfechainicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechainicioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechainicioKeyPressed

    private void txtfechainicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfechainicioMouseClicked
            // TODO add your handling code here:
        jPanel2.setVisible(true);
        jCalendar1.setVisible(true);
        jButton2.setVisible(true);
    }//GEN-LAST:event_txtfechainicioMouseClicked

    private void txtfechafinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfechafinalMouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(true);
        jCalendar1.setVisible(true);
        jButton3.setVisible(true);

    }//GEN-LAST:event_txtfechafinalMouseClicked

    private void txtfechainicioComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtfechainicioComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechainicioComponentRemoved

    private void txtfechainicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfechainicioMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtfechainicioMouseExited

    private void txtfechainicioComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtfechainicioComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtfechainicioComponentAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        day = jCalendar1.getCalendar().get(Calendar.MARCH);
        month = jCalendar1.getCalendar().get(Calendar.DAY_OF_MONTH);
        year = jCalendar1.getCalendar().get(Calendar.YEAR);
        txtfechainicio.setText("%s/%s/%s".formatted(day,month,year));
        jPanel2.setVisible(false);
        jCalendar1.setVisible(false);
        jButton2.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        day = jCalendar1.getCalendar().get(Calendar.MARCH);
        month = jCalendar1.getCalendar().get(Calendar.DAY_OF_MONTH);
        year = jCalendar1.getCalendar().get(Calendar.YEAR);
        txtfechafinal.setText("%s/%s/%s".formatted(day,month,year));
        jPanel2.setVisible(false);
        jCalendar1.setVisible(false);
        jButton2.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(DentroApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DentroApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DentroApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DentroApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DentroApp().setVisible(true);
            }
        });
    }
    private void informacionTareas(int ID){
        Connection cn = cnx.conexion();
        String SQL = "SELECT * FROM tareas WHERE IDUsuario = %s".formatted(ID);
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Tarea");
        tabla.addColumn("fecha de inicio");
        tabla.addColumn("Fecha de finalizacion");
        tblista1.setModel(tabla);
        String data[] = new String[3];
        Statement st;
        try{
            st = (Statement) cn.createStatement();
            ResultSet rs =st.executeQuery(SQL);
            while (rs.next()){
                data[0] = rs.getString(2);
                data[1] = rs.getString(3);
                data[2] = rs.getString(4);
                tabla.addRow(data);
            }
            tblista1.setModel(tabla);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Error en la consulta SQL: %s".formatted(e));
        }
        cnx.cerrar();
    }
    private void limpiarCampos(){
        txtaggtarea2.setText("");
        txtfechainicio.setText("");
        txtfechafinal.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel act;
    private javax.swing.JLabel agg;
    private javax.swing.JLabel borr;
    private javax.swing.JButton btnact;
    private javax.swing.JButton btnagg;
    private javax.swing.JButton btnborr;
    private javax.swing.JButton btncomp;
    private javax.swing.JLabel comp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblista1;
    private javax.swing.JTextField txtaggtarea2;
    private javax.swing.JTextField txtfechafinal;
    private javax.swing.JTextField txtfechainicio;
    // End of variables declaration//GEN-END:variables
}
