/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socio_Admin;

import Class_Socio.Tools;
import DATABASE.ToolsDB;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabriel
 */
public class Socio_BalanceGeneral extends javax.swing.JFrame {
public String date;
private static final long serialVersionUID = 1L;
@Override
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/shield-2.png"));
        return retValue;
    }

    public Socio_BalanceGeneral(String date) {
        this.date=date;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Balance General");
        setBG2();setAbPs();setBG();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBG = new javax.swing.JDialog();
        CB_taccount = new javax.swing.JComboBox<>();
        TF_monto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TF_name = new javax.swing.JTextField();
        B_add = new javax.swing.JButton();
        B_cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        addSit = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CB_debe = new javax.swing.JComboBox<>();
        CB_haber = new javax.swing.JComboBox<>();
        TF_montore = new javax.swing.JTextField();
        B_acept = new javax.swing.JButton();
        B_acept1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Actualizando = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        T_abnpts = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        T_visBG = new javax.swing.JTable();
        mes = new com.toedter.calendar.JMonthChooser();
        year = new com.toedter.calendar.JYearChooser();
        jLabel2 = new javax.swing.JLabel();
        L_actualiza = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CB_abps = new javax.swing.JComboBox<>();
        CB_cuentaBG = new javax.swing.JComboBox<>();
        B_addcuenta = new javax.swing.JButton();
        B_addasiento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_BG = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        addBG.setUndecorated(true);
        addBG.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB_taccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Pasivo", "Capital" }));
        addBG.getContentPane().add(CB_taccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 130, -1));

        TF_monto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addBG.getContentPane().add(TF_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Monto de la Cuenta:");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBG.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 180, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Naturaleza de la Cuenta: ");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBG.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre de la Cuenta:");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBG.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, 30));

        TF_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addBG.getContentPane().add(TF_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 130, 30));

        B_add.setBackground(new java.awt.Color(0, 0, 102));
        B_add.setForeground(new java.awt.Color(255, 255, 255));
        B_add.setText("Crear cuenta");
        B_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_addActionPerformed(evt);
            }
        });
        addBG.getContentPane().add(B_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 120, 30));

        B_cancel.setBackground(new java.awt.Color(0, 0, 102));
        B_cancel.setForeground(new java.awt.Color(255, 255, 255));
        B_cancel.setText("Atras");
        B_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_cancelActionPerformed(evt);
            }
        });
        addBG.getContentPane().add(B_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 120, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoclaro.jpg"))); // NOI18N
        addBG.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        addSit.setUndecorated(true);
        addSit.setPreferredSize(new java.awt.Dimension(817, 591));
        addSit.setResizable(false);
        addSit.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Asiento Contable");
        addSit.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 170, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Monto:");
        addSit.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 140, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("vs");
        addSit.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 50, 20));

        CB_debe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CB_debe.setModel(setCBdebe());
        addSit.getContentPane().add(CB_debe, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 170, -1));

        CB_haber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CB_haber.setModel(setCBhaber());
        addSit.getContentPane().add(CB_haber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 170, -1));
        setCBhaber();

        TF_montore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TF_montore.setForeground(new java.awt.Color(255, 255, 255));
        TF_montore.setOpaque(false);
        addSit.getContentPane().add(TF_montore, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 140, 30));

        B_acept.setBackground(new java.awt.Color(0, 0, 0));
        B_acept.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B_acept.setForeground(new java.awt.Color(255, 255, 255));
        B_acept.setText("Aceptar");
        B_acept.setOpaque(false);
        B_acept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_aceptActionPerformed(evt);
            }
        });
        addSit.getContentPane().add(B_acept, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 120, 30));

        B_acept1.setBackground(new java.awt.Color(0, 0, 0));
        B_acept1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B_acept1.setForeground(new java.awt.Color(255, 255, 255));
        B_acept1.setText("Atras");
        B_acept1.setOpaque(false);
        B_acept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_acept1ActionPerformed(evt);
            }
        });
        addSit.getContentPane().add(B_acept1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 120, 30));

        jLabel11.setIcon(menosmas());
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        addSit.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 30, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        jLabel9.setToolTipText("");
        addSit.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 300));

        Actualizando.setUndecorated(true);
        Actualizando.setResizable(false);
        Actualizando.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Actualizando...");
        Actualizando.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/actualizar.png"))); // NOI18N
        Actualizando.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoclaro.jpg"))); // NOI18N
        Actualizando.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 290, 210));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T_abnpts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_abnpts.setToolTipText("");
        T_abnpts.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(T_abnpts);
        if (T_abnpts.getColumnModel().getColumnCount() > 0) {
            T_abnpts.getColumnModel().getColumn(0).setResizable(false);
            T_abnpts.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 310, 160));

        jButton1.setBackground(new java.awt.Color(0, 0, 80));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 525, 100, 30));

        T_visBG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_visBG.setToolTipText("");
        T_visBG.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(T_visBG);
        if (T_visBG.getColumnModel().getColumnCount() > 0) {
            T_visBG.getColumnModel().getColumn(0).setResizable(false);
            T_visBG.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 310, 150));
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Balance General de la Cooperativa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 240, 30));

        L_actualiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/actualizar.png"))); // NOI18N
        L_actualiza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_actualizaMouseClicked(evt);
            }
        });
        jPanel1.add(L_actualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 80, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cuentas de");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuentas del");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 90, 30));

        CB_abps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abonos", "Sol. de Prestamos", "Cuota de Prestamos" }));
        CB_abps.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_abpsItemStateChanged(evt);
            }
        });
        CB_abps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_abpsActionPerformed(evt);
            }
        });
        jPanel1.add(CB_abps, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 150, -1));

        CB_cuentaBG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Pasivo", "Capital" }));
        CB_cuentaBG.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_cuentaBGItemStateChanged(evt);
            }
        });
        jPanel1.add(CB_cuentaBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 110, -1));

        B_addcuenta.setBackground(new java.awt.Color(0, 0, 0));
        B_addcuenta.setForeground(new java.awt.Color(255, 255, 255));
        B_addcuenta.setText("Añadir Cuenta");
        B_addcuenta.setOpaque(false);
        B_addcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_addcuentaActionPerformed(evt);
            }
        });
        jPanel1.add(B_addcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        B_addasiento.setBackground(new java.awt.Color(0, 0, 0));
        B_addasiento.setForeground(new java.awt.Color(255, 255, 255));
        B_addasiento.setText("Añadir Asiento");
        B_addasiento.setOpaque(false);
        B_addasiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_addasientoActionPerformed(evt);
            }
        });
        jPanel1.add(B_addasiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        T_BG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cuenta", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_BG.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(T_BG);
        if (T_BG.getColumnModel().getColumnCount() > 0) {
            T_BG.getColumnModel().getColumn(0).setResizable(false);
            T_BG.getColumnModel().getColumn(0).setPreferredWidth(175);
            T_BG.getColumnModel().getColumn(1).setResizable(false);
            T_BG.getColumnModel().getColumn(1).setPreferredWidth(80);
            T_BG.getColumnModel().getColumn(2).setResizable(false);
            T_BG.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 380, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAzul.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 820, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        socio_users su = new socio_users();
        su.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void L_actualizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_actualizaMouseClicked
        setAbPs();setBG();setBG2();
        JOptionPane.showMessageDialog(null, "Datos Actualizados!!");
    }//GEN-LAST:event_L_actualizaMouseClicked

    private void CB_abpsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_abpsItemStateChanged
        setAbPs();
    }//GEN-LAST:event_CB_abpsItemStateChanged

    private void CB_cuentaBGItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_cuentaBGItemStateChanged
        setBG2();
    }//GEN-LAST:event_CB_cuentaBGItemStateChanged

    private void B_addcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_addcuentaActionPerformed
        Tools.Nombres(TF_name, 50);
        Tools.Numeros(TF_monto);
        addBG.setSize(400,300);addBG.setLocationRelativeTo(null);
        addBG.setVisible(true);
    }//GEN-LAST:event_B_addcuentaActionPerformed

    private void B_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_addActionPerformed
        if("".equals(TF_monto.getText()))TF_monto.setText("0.0");
        
        int x = ToolsDB.Actualizar("insert into Catalogo values ('"+TF_name.getText()+"',"+TF_monto.getText()+",'"+CB_taccount.getSelectedItem()+"')");
        if(x == 0){
            JOptionPane.showMessageDialog(null, "Cuenta no Agregda");
        }else{
            TF_monto.setText("0.0");TF_name.setText("");
            JOptionPane.showMessageDialog(null, "Cuenta agregada exitosamente");
            setBG2();
            addBG.dispose();
        }
    }//GEN-LAST:event_B_addActionPerformed

    private void B_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_cancelActionPerformed
    addBG.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_B_cancelActionPerformed

    private void B_addasientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_addasientoActionPerformed
    Tools.Numeros(TF_montore);
    CB_debe.setModel(setCBdebe());
    CB_haber.setModel(setCBhaber());
    addSit.setSize(540, 300);
    addSit.setLocationRelativeTo(null);
    addSit.setVisible(true);
    }//GEN-LAST:event_B_addasientoActionPerformed

    private void B_aceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_aceptActionPerformed
    try {
        
        String debe = (String) CB_debe.getSelectedItem(),haber = (String) CB_haber.getSelectedItem();
        if(!debe.equals(haber)){
            ResultSet rsD= ToolsDB.RS("select * from Catalogo where Cuenta = '"+debe+"'");
            ResultSet rsH;
            String TipoDebe = null,TipoHaber = null;
            rsH = ToolsDB.RS("select * from Catalogo where Cuenta = '"+haber+"'");
            double montoD = 0, montoH = 0;
            while(rsD.next()){
            montoD = rsD.getDouble("Monto");
            TipoDebe = rsD.getString("Tipo");
            }
            while(rsH.next()){
            montoH = rsH.getDouble("Monto");
            TipoHaber  = rsH.getString("Tipo");
            }

            if(ruta.equals("/images/mas.png")){
                if(TipoDebe.equals("Activo")){
                    montoD -= Double.parseDouble(TF_montore.getText());
                }else{
                    montoD += Double.parseDouble(TF_montore.getText());
                }
                if(TipoHaber.equals("Activo")){
                    montoH += Double.parseDouble(TF_montore.getText());
                }else{
                    montoH -= Double.parseDouble(TF_montore.getText());
                }
            }else{
                if(TipoDebe.equals("Activo")){
                    montoD += Double.parseDouble(TF_montore.getText());
                }else{
                    montoD -= Double.parseDouble(TF_montore.getText());
                }
                if(TipoHaber.equals("Activo")){
                    montoH -= Double.parseDouble(TF_montore.getText());
                }else{
                    montoH += Double.parseDouble(TF_montore.getText());
                }

            }
            int res = ToolsDB.Actualizar("update Catalogo set Monto = "+montoD+" where Cuenta = '"+debe+"'");
            if(res!=0){
                int res2 = ToolsDB.Actualizar("update Catalogo set Monto = "+montoH+" where Cuenta = '"+haber+"'");
                if(res2==0){
                    int res3 = ToolsDB.Actualizar("update Catalogo set Monto = "+montoH+" where Cuenta = '"+haber+"'");
                    if(res3==0){
                        JOptionPane.showMessageDialog(null, "No se pudo crear el asiento");
                    }else{
                        setBG2();setBG();
                        addSit.dispose();
                        JOptionPane.showMessageDialog(null, "Asiento Creado");
                    }
                }else{
                    setBG2();setBG();
                    addSit.dispose();
                    JOptionPane.showMessageDialog(null, "Asiento Creado");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo crear el asiento");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Buen intento pendejo >:v");
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
        Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_B_aceptActionPerformed

    private void B_acept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_acept1ActionPerformed
       addSit.dispose();
    }//GEN-LAST:event_B_acept1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
      jLabel11.setIcon(menosmas());  
    }//GEN-LAST:event_jLabel11MouseClicked

    private void CB_abpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_abpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_abpsActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Actualizando;
    private javax.swing.JButton B_acept;
    private javax.swing.JButton B_acept1;
    private javax.swing.JButton B_add;
    private javax.swing.JButton B_addasiento;
    private javax.swing.JButton B_addcuenta;
    private javax.swing.JButton B_cancel;
    private javax.swing.JComboBox<String> CB_abps;
    private javax.swing.JComboBox<String> CB_cuentaBG;
    private javax.swing.JComboBox<String> CB_debe;
    private javax.swing.JComboBox<String> CB_haber;
    private javax.swing.JComboBox<String> CB_taccount;
    private javax.swing.JLabel L_actualiza;
    private javax.swing.JTextField TF_monto;
    private javax.swing.JTextField TF_montore;
    private javax.swing.JTextField TF_name;
    private javax.swing.JTable T_BG;
    private javax.swing.JTable T_abnpts;
    private javax.swing.JTable T_visBG;
    private javax.swing.JDialog addBG;
    private javax.swing.JDialog addSit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private com.toedter.calendar.JMonthChooser mes;
    private com.toedter.calendar.JYearChooser year;
    // End of variables declaration//GEN-END:variables

    private void setBG2() {
        Tools.limpiarTabla(T_visBG);
    try {
        DefaultTableModel e = (DefaultTableModel) T_visBG.getModel();
        ResultSet rs = ToolsDB.RS("select * from Catalogo where Tipo = '"+(String) CB_cuentaBG.getSelectedItem()+"'");
        while(rs.next()){
            Object [] row = new Object[2];
            row[0] = rs.getString("Cuenta");
            row[1] = Tools.Redondear(2, rs.getDouble("Monto"));
            e.addRow(row);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Socio_BalanceGeneral.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void setAbPs() {
    try {
        Tools.limpiarTabla(T_abnpts);
        String t_tabla = (String) CB_abps.getSelectedItem();
        DefaultTableModel e = (DefaultTableModel) T_abnpts.getModel();
        ResultSet rs;
        switch (t_tabla){
            case "Abonos":
                rs = ToolsDB.RS("select * from Ahorro_Apertura");
                while(rs.next()){
                     Calendar cin = Calendar.getInstance(); cin.setTime(rs.getDate("Fecha"));
                     Calendar cfin = Calendar.getInstance(); cfin.set(Calendar.MONTH, mes.getMonth());cfin.set(Calendar.YEAR, year.getYear());
                     if(Tools.calcularMes(cin.getTime(), cfin.getTime()) > 0){
                         Object [] row = new Object[2];
                         row[0] = rs.getString("Cod_A");
                         String idsocio = rs.getString("ID_Socio");
                         row[1] = Tools.Redondear(2, Tools.FutDAn(rs.getDouble("Monto"),ToolsDB.getRendimiento(idsocio),mes.getMonth(),year.getYear(),rs.getDate("Fecha"))); 
                         e.addRow(row);                         
                     }
                }
                break;
            case "Sol. de Prestamos":
                rs = ToolsDB.RS("select * from Prestamo where Aprobado = 1");
                while(rs.next()){
                    Calendar cin  = Calendar.getInstance(); cin.setTime(rs.getDate("Fecha"));
                    Calendar cfin = Calendar.getInstance(); cfin.set(Calendar.MONTH, mes.getMonth());cfin.set(Calendar.YEAR, year.getYear());
                    if(Tools.calcularMes(cin.getTime(), cfin.getTime()) > 0 && Tools.calcularMes(cin.getTime(), cfin.getTime())<= rs.getInt("Plazo")){
                        Object [] row = new Object[2];
                        row[0] = rs.getString("Cod_P");
                        row[1] = Tools.Redondear(2, Tools.FutDPres(rs.getDouble("Monto"),ToolsDB.getInflacion(),mes.getMonth(),year.getYear(),rs.getDate("Fecha")));
                        e.addRow(row);
                    }
                    
                }                
                break;
            default:
                rs = ToolsDB.RS("select PC.Monto,PC.Cod_P,P.Plazo,PC.Fecha from Prestamo_Cuotas as PC,Prestamo as P where P.Cod_P =PC.Cod_P");
                while(rs.next()){
                    Calendar cin  = Calendar.getInstance(); cin.setTime(rs.getDate("Fecha"));
                    Calendar cfin = Calendar.getInstance(); cfin.set(Calendar.MONTH, mes.getMonth());cfin.set(Calendar.YEAR, year.getYear());
                    if(Tools.calcularMes(cin.getTime(), cfin.getTime()) > 0 && Tools.calcularMes(cin.getTime(), cfin.getTime())<= rs.getInt("Plazo")){
                        Object [] row = new Object[2];
                        row[0] = rs.getString("Cod_P");
                        row[1] = Tools.Redondear(2, Tools.FutDAn(rs.getDouble("Monto"), ToolsDB.getInteres(), mes.getMonth(), year.getYear(), rs.getDate("Fecha")));
                        e.addRow(row);                        
                    }

                }                
                break;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Socio_BalanceGeneral.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private DefaultComboBoxModel setCBdebe() {
    try {
        DefaultComboBoxModel<String> list = new DefaultComboBoxModel<>();
        ResultSet rs = ToolsDB.RS("select * from Catalogo");
        while(rs.next()){
            list.addElement(rs.getString("Cuenta"));
        }
        return list;
    } catch (SQLException ex) {
        Logger.getLogger(Socio_BalanceGeneral.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }

    private DefaultComboBoxModel setCBhaber() {
    try {
        DefaultComboBoxModel<String> list = new DefaultComboBoxModel<>();
        ResultSet rs = ToolsDB.RS("select * from Catalogo");
        while(rs.next()){
            list.addElement(rs.getString("Cuenta"));
        }
        return list;
    } catch (SQLException ex) {
        Logger.getLogger(Socio_BalanceGeneral.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;        
    }
    String ruta = "/images/mas.png";
    private Icon menosmas() {
        Icon image = new javax.swing.ImageIcon(getClass().getResource(ruta));
        if(ruta.equals("/images/mas.png")){
            ruta = "/images/menos.png";
        }else{
            ruta = "/images/mas.png";
        }
        return image ;
    }

    private void setBG() {
    
    Tools.limpiarTabla(T_BG);
    try {
        setUtilidad();
        setCtsxCobraryDptsxPagar();
        if(mes.getMonth() == 10){
            setLiquidaciones();
        }
        
        double TActivo = 0,TPasivo = 0,TCapital = 0;
        ResultSet rsActivo = ToolsDB.RS("select * from Catalogo where Tipo = 'Activo'"),rsPasivo = ToolsDB.RS("select * from Catalogo where Tipo = 'Pasivo'"),rsCapital = ToolsDB.RS("select * from Catalogo where Tipo = 'Capital'");
        DefaultTableModel e = (DefaultTableModel) T_BG.getModel();
        while(rsActivo.next()){
            if(rsActivo.getDouble("Monto")!=0){
                Object [] rows = new Object[3];
                rows [0] = rsActivo.getString("Cuenta");
                rows [1] = rsActivo.getDouble("Monto");
                rows [2] = "";
                TActivo += rsActivo.getDouble("Monto");
                e.addRow(rows);
            }
        }
        Object [] row = new Object[3];
        row [0] = "TOTAL DE ACTIVO";
        row [1] = "";
        row [2] = TActivo;
        e.addRow(row);
        while(rsPasivo.next()){
            if(rsPasivo.getDouble("Monto")!=0){
                Object [] rows = new Object[3];
                rows [0] = rsPasivo.getString("Cuenta");
                rows [1] = rsPasivo.getDouble("Monto");
                rows [2] = "";
                TPasivo += rsPasivo.getDouble("Monto");
                e.addRow(rows);
            }
        }
        row [0] = "TOTAL DE PASIVO";
        row [1] = "";
        row [2] = TPasivo;
        e.addRow(row);        
        while(rsCapital.next()){
            if(rsCapital.getDouble("Monto")!=0){
                Object [] rows = new Object[3];
                rows [0] = rsCapital.getString("Cuenta");
                rows [1] = rsCapital.getDouble("Monto");
                rows [2] = "";
                TCapital += rsCapital.getDouble("Monto");
                e.addRow(rows);
            }
        }
        row [0] = "TOTAL DE CAPITAL";
        row [1] = "";
        row [2] = TCapital;
        e.addRow(row);
        row [0] = "PASIVO MAS CAPITAL";
        row [1] = "";
        row [2] = TCapital+TPasivo;
        e.addRow(row);
        
    } catch (SQLException ex) {
        Logger.getLogger(Socio_BalanceGeneral.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void setUtilidad() {
    try {
        double Prest = 0,PrestInt = 0;
        ResultSet rs = ToolsDB.RS("select P.Cod_P,P.Monto as Todo,PC.Monto as Cuota,PC.Fecha,P.Plazo from Prestamo as P, Prestamo_Cuotas as PC where P.Cod_P = PC.Cod_P and P.Aprobado = 1");
        while(rs.next()){
            Calendar cfin = Calendar.getInstance(); cfin.set(Calendar.MONTH, mes.getMonth());cfin.set(Calendar.YEAR, year.getYear());
            Calendar cin = Calendar.getInstance(); cin.setTime(rs.getDate("Fecha"));
            if(Tools.calcularMes(cin.getTime(), cfin.getTime()) > 0 && Tools.calcularMes(cin.getTime(), cfin.getTime())<= rs.getInt("Plazo")){
                //A=(P*i)/(1-Math.pow(1+i, -n));
                double An = (rs.getDouble("Todo")*ToolsDB.getInflacion())/(1-Math.pow(1+ToolsDB.getInflacion(), -rs.getInt("Plazo")));
                Prest += Tools.Redondear(2, An);
                PrestInt+= Tools.Redondear(2, Tools.FutDAn(rs.getDouble("Cuota"), ToolsDB.getInteres(), mes.getMonth(), year.getYear(), rs.getDate("Fecha")));  
            }
            
        }
        int act = ToolsDB.Actualizar("update Catalogo set Monto = "+(PrestInt - Prest)+" where Cuenta = 'Utilidades'");
        if(act != 1){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado");
        }else{
            act = ToolsDB.Actualizar("update Catalogo set Monto = "+(PrestInt-Prest)+" where Cuenta = 'Banco'");
            if(act != 1){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado");
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Socio_BalanceGeneral.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void setCtsxCobraryDptsxPagar() {
    double abonos;double uti;
    try {
        ResultSet rs = ToolsDB.RS("select * from Catalogo where Cuenta = 'Banco'");
        while(rs.next()){
            uti = rs.getDouble("Monto");
            abonos = 0;
            ResultSet rs1 = ToolsDB.RS("select * from Ahorro_Apertura");
            while(rs1.next()){
                    Calendar cin = Calendar.getInstance();cin.setTime(rs1.getDate("Fecha"));
                Calendar cfin = Calendar.getInstance(); cfin.set(Calendar.MONTH, mes.getMonth());cfin.set(Calendar.YEAR, year.getYear());
                if(Tools.calcularMes(cin.getTime(), cfin.getTime())>0){
                    double futu = Tools.FutDAn(rs1.getDouble("Monto"), ToolsDB.getRendimiento(rs1.getString("ID_Socio")), mes.getMonth(), year.getYear(), rs1.getDate("Fecha"));
                    abonos += futu;                
                }                   
                 
            }
            int Actualizar = ToolsDB.Actualizar("update Catalogo set Monto = "+(uti+abonos)+" where Cuenta = 'Banco'");
            if(Actualizar==0){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error D:");
            }
            Actualizar = ToolsDB.Actualizar("update Catalogo set Monto = "+abonos+" where Cuenta = 'Depositos por pagar'");
            if(Actualizar==0){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error D:");
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Socio_BalanceGeneral.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void setLiquidaciones() {
    try {
        double liquTot = 0;
        ResultSet rs = ToolsDB.RS("select * from Ahorro_Apertura");
        while(rs.next()){
            Calendar cin = Calendar.getInstance();cin.setTime(rs.getDate("Fecha"));
            Calendar cfin = Calendar.getInstance(); cfin.set(Calendar.MONTH, mes.getMonth());cfin.set(Calendar.YEAR, year.getYear());
            if(Tools.calcularMes(cin.getTime(), cfin.getTime())>0){
                double fut = Tools.FutDAn(rs.getDouble("Monto"),ToolsDB.getRendimiento(rs.getString("ID_Socio")) , mes.getMonth(), year.getYear(), rs.getDate("Fecha"));
                liquTot += ToolsDB.getRendimiento(rs.getString("ID_Socio"))*fut;                
            }
        }
        rs = ToolsDB.RS("select * from Catalogo where Cuenta = 'Banco'");
        double banco = 0;
        while(rs.next()){
            banco = rs.getDouble("Monto");
            
        }
        rs = ToolsDB.RS("select * from Catalogo where Cuenta = 'Depositos por pagar'");
        double depxpag = 0;
        while(rs.next()){
            depxpag = rs.getDouble("Monto");
            
        }
        int act = ToolsDB.Actualizar("update Catalogo set Monto ="+(banco - liquTot)+" where Cuenta = 'Banco'");
        
        act = ToolsDB.Actualizar("update Catalogo set Monto = "+(depxpag  - liquTot)+" where Cuenta = 'Depositos por pagar'");
    } catch (SQLException ex) {
        Logger.getLogger(Socio_BalanceGeneral.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    


}
