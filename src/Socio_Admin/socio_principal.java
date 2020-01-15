
package Socio_Admin;
import DATABASE.ToolsDB;
import Socios.Socio;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class socio_principal extends javax.swing.JFrame {
       public DefaultTableModel model;
       public Object fila[] = new Object[1];
  
       
    public socio_principal() {
        initComponents();
        this.setTitle("Socios_SA");
        this.setLocationRelativeTo(null);
    }
    
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/shield-2.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Conexion = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TF_linea3 = new javax.swing.JTextField();
        TF_linea2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TF_linea1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TF_linea4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        txt_users = new application.TextBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        Conexion.setUndecorated(true);
        Conexion.setResizable(false);
        Conexion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Usuario:");
        Conexion.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Conexion a la Base de Datos");
        Conexion.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 210, 50));

        TF_linea3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_linea3.setForeground(new java.awt.Color(255, 255, 255));
        TF_linea3.setOpaque(false);
        Conexion.getContentPane().add(TF_linea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 180, 30));

        TF_linea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_linea2.setForeground(new java.awt.Color(255, 255, 255));
        TF_linea2.setOpaque(false);
        Conexion.getContentPane().add(TF_linea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 180, 30));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Conexion a la BD:");
        Conexion.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 30));

        TF_linea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_linea1.setForeground(new java.awt.Color(255, 255, 255));
        TF_linea1.setOpaque(false);
        Conexion.getContentPane().add(TF_linea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 180, 30));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Controlador:");
        Conexion.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 30));

        TF_linea4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_linea4.setForeground(new java.awt.Color(255, 255, 255));
        TF_linea4.setOpaque(false);
        Conexion.getContentPane().add(TF_linea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 180, 30));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Contraseña: ");
        Conexion.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Conexion.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 140, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Actualizar Datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Conexion.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 140, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setPreferredSize(new java.awt.Dimension(430, 335));
        Conexion.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 80));
        jLabel2.setText("USUARIO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 89, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 80));
        jLabel3.setText("CONTRASEÑA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 347, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 80));
        jLabel4.setText("               COOPERATIVA_SOCIOS_SA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 72, 289, 25));

        pass.setToolTipText("contraseña:1234");
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 347, 169, -1));

        txt_users.setPlaceHolder("escribe:0001A");
        txt_users.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usersKeyTyped(evt);
            }
        });
        jPanel1.add(txt_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 312, 169, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 80));
        jLabel5.setText("            ENTRAR");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 384, 150, 49));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 128, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shield (2).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 3, 50, 33));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Conexion a BD");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//
    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
         entrar();
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel7MousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
         
    }//GEN-LAST:event_formWindowActivated

    private void txt_usersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usersKeyTyped
       int c = evt.getKeyChar();
        if ( c == 10 )
            {
            pass.requestFocus();
        }     
    }//GEN-LAST:event_txt_usersKeyTyped

    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
    int c = evt.getKeyChar();
        if ( c == 10 )
        {
            entrar();
        }
    }//GEN-LAST:event_passKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Conexion.setSize(430, 370);
        Conexion.setLocationRelativeTo(null);
        Conexion.setVisible(true);
        ArrayList<String>lineas = ToolsDB.Conexion("Conexion.txt");
        TF_linea1.setText(lineas.get(0));
        TF_linea2.setText(lineas.get(1));
        TF_linea3.setText(lineas.get(2));
        TF_linea4.setText(lineas.get(3));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Conexion.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Estas seguro??\nSi lo friegas el programa se crashea");
        if(showConfirmDialog == 0){
            try {
                String ruta = "Conexion.txt";
                File archivo = new File(ruta);
                BufferedWriter bw;
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(TF_linea1.getText());
                bw.newLine();
                bw.write(TF_linea2.getText());
                bw.newLine();
                bw.write(TF_linea3.getText());
                bw.newLine();
                bw.write(TF_linea4.getText());
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(socio_principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

   
    public static void main(String args[]) {
      
         /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(socio_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
           //</editor-fold>
           
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new socio_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Conexion;
    private javax.swing.JTextField TF_linea1;
    private javax.swing.JTextField TF_linea2;
    private javax.swing.JTextField TF_linea3;
    private javax.swing.JTextField TF_linea4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private application.TextBox txt_users;
    // End of variables declaration//GEN-END:variables

    private void entrar() {
        try {

             ResultSet rs;
             if(txt_users.getText().equals("Admin")){
                  rs = DATABASE.ToolsDB.RS("select * from dbo.Admin");
                  while(rs.next()){
                  String user_here = txt_users.getText();
                  String user_db = rs.getString("Nombre");
                  String pass_here = pass.getText();
                  String pass_db = rs.getString("Pass");
                    if(user_here.equals(user_db) && pass_here.equals(pass_db)){
                       socio_users ass = new socio_users();
                       ass.setVisible(true);
                       dispose();
                     }
                 }  
             
             }else{
                boolean inexist = true;
                rs = ToolsDB.RS("select * from dbo.My_Socios where Activo = 1");
                while(rs.next()){
                String user_here = txt_users.getText();
                String user_db = rs.getString("ID_Socio");
                String pass_here =pass.getText();
                String pass_db = rs.getString("Pass");
                if(user_here.equals(user_db)) {
                    inexist = false;
                    if (pass_here.equals(pass_db)) {
                        txt_users.setText("");
                        pass.setText("");
                        
                        Socios.Socio so = new Socio(user_here);
                        so.setVisible(true);
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                    }
                  
                }
                }   
                if(inexist){
                    JOptionPane.showMessageDialog(null, "ID-Socio no registrado");
                }
             }
             
             
         }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR "+ex);
        }
    }
}
